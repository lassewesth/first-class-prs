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

5. Aha! Got it working by changing to a 'regular' build configuration type!

6. Maybe now I won't no longer need the duplicate VCS
   * Back to trigger-on-snapshot, let's see...
