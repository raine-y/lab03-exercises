# Lab 03: Git and GitHub

This repository documents my practice with local Git, GitHub, branches, and pull requests.

## README Responses

### 1.1 After initialization

```text
ls -la
total 8
drwxr-xr-x@ 4 raine  staff  128 Sep  4 19:23 .
drwxr-xr-x@ 6 raine  staff  192 Sep  4 19:15 ..
drwxr-xr-x@ 9 raine  staff  288 Sep  4 19:16 .git
-rw-r--r--@ 1 raine  staff  869 Sep  4 19:23 README.md
```

### 1.2 First git status

```text
git status
On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
    README.md

nothing added to commit but untracked files present (use "git add" to track)
```

### 1.3 After the first commit

```text
On branch main
nothing to commit, working tree clean
```

### 1.4 git log

```text
55cf7af (HEAD -> main) Create lab README
```

### 1.5 git diff

Paste the `git status` and `git diff` commands and their output.

```text
git status

On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
    modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")
```

```text
git diff

diff --git a/README.md b/README.md
index fff9bb2..6d386e9 100644
--- a/README.md
+++ b/README.md
@@ -1,5 +1,7 @@
 # Lab 03: Git and GitHub

+This repository documents my practice with local Git, GitHub, branches, and pull requests.
+
 ## README Responses

 ### 1.1 After initialization
@@ -30,12 +32,36 @@ nothing added to commit but untracked files present (use "git add" to track)

 ### 1.3 After the first commit

+```text
+On branch main
+nothing to commit, working tree clean
+```
+
 ### 1.4 git log

+```text
+55cf7af (HEAD -> main) Create lab README
+```
+
 ### 1.5 git diff

 Paste the `git status` and `git diff` commands and their output.

+```text
+git status
+
+On branch main
+Changes not staged for commit:
+  (use "git add <file>..." to update what will be committed)
+  (use "git restore <file>..." to discard changes in working directory)
+    modified:   README.md
+
+no changes added to commit (use "git add" and/or "git commit -a")
+```
+
+```text
+git diff
+
 How does this `git status` differ from the one in **1.2**?

 ### 1.6 Git command reflections
```

How does this `git status` differ from the one in **1.2**?

```text
1.2's git status references that there is nothing to commit because the only changes have happened to untracked files.
1.5's git status complains instead that no new changes have been staged in the currently tracked files. 
```

### 1.6 Git command reflections

In one or two sentences each, what does each command do?

- `git init` creates a new git repository in the current working directory.
- `git status` shows the files that have been modified and staged for commit.
- `git add` adds a file or files to the next commit.
- `git commit` commits every change staged for commit through `git add`.
- `git log` shows all of the previous commits.
- `git diff` shows the difference between all of the changes to a repo and the staged changes.

### 1.7 Repository link

<https://github.com/raine-y/lab03-exercises>

### 1.8 Comparing approaches

In your own words:

- How does the nested-loop approach check for a duplicate?
- How does the set-based approach check for a duplicate?
- What is the runtime and memory trade-off of each?

### 1.9 Pull request merge options

In your own words, what does each GitHub merge option do?

- Create a merge commit
- Squash and merge
- Rebase and merge
