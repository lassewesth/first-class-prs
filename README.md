# first-class-prs

1. Let's start with just a commit.

2. Alright that worked:
   * `commit-status` triggered
     * That in turn triggered `all-builds`
       * And in turn that triggered
         * `skeleton`-> `openjdk8` -> `pack`
         * `openjdk11`
         * `zulujdk-8`
   * Also though it triggered `pull-request-status`
     * And therefore `skeleton -> ...`
     * But I guess that's alright, queue will de-dup it, not a practical problem
     * No notification from `pull-request-status`, or at least nothing broke

3. Now hardcoded branch in VCS because `pull-request-status` is not triggering
   * This will need fixing when we get to `v6.8` or `v7.0`

4. Yet another PR, now I have attached `pull-request-status` to a VCS root...
   * I mean, this is terrible duplication but bloody hell, the thing doesn't work?!

5. Ok it is a mess so I have deleted `pull-request-status`.
   * Ideal world (what I will build now) is `pull-request-status` as composite type, trigger-on-snapshot-deps, with PR and notifier build features
   * Oh and I'll go back to branch-as-property
   
6. OK branch-as-property, let's just verify that works with regular commits
   * Created `pull-request-status`, type composite, regular trigger-on-snapshot, let's test

7. That didn't work. Now made `skeleton-builds` depend directly on `pack`, trying again...
   * No luck, now `pull-request-status` points directly to `pack`
   * Wait, remove `pack`, try again, to double check
     * Det virkede!

8. Nu igen en PR, lad os se...
   * Det virkede ikke. Lavede `pack` til dependency på `pull-request-status`, igen...
   * Det virkede heller ikke, har nu hardcoded branch, igen...
   * Hardcoded branch makes no difference. Now let's just add a VCS root to `pull-request-status`...
   * Hmm der skal åbenbart token til, igen...
   * Wohoo, added token, build triggering!
   
9. Unticked _Allow builds in the default branch_ to exclude running on regular commits!

10. But goddamnit, now it triggers but builds the main branch. FFS!
