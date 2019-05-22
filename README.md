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
