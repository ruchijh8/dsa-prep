Read @notes/REVIEW.md.

Goal: work through the NeetCode 150 in the order listed in REVIEW.md, before anything else.

Run these checks in order and show the first one that applies:

## Link Rule (applies to ALL checks)
Always display the Problem Link for every problem announced — sprint due or next NeetCode problem.
For a solved problem, fetch the link from its note file (grep "Problem Link").
For an unsolved problem there is no note yet — look it up in @notes/NEETCODE-LINKS.md and give its NeetCode URL (format https://neetcode.io/problems/<slug>/question; the "/question" suffix is required). Never guess a slug. Mention the LeetCode number alongside it if you know it.
Never announce a problem without its link.

## Check 1 — Sprint Due?
Find any Stage 1 or Stage 2 problem whose Review Date is today or overdue.
If found → show a table with columns: Problem | Stage | Due | Link
Include ALL overdue/due sprint problems, each with its Problem Link.
Announce: "Sprint active. Run /review-dsa first before starting a new problem."

## Check 2 — Next NeetCode 150 Problem
Scan REVIEW.md from the top, section by section, row by row.
Pick the FIRST row whose File column is "—" (not solved yet). Ignore pattern tags, the 3-problem rule and pattern gaps.
Announce: "NeetCode 150 progress: [solved]/[total rows]. Next up:" and show Problem | Section | Tag | Link.
Follow the full coaching flow from CLAUDE.md once I confirm.

## If nothing is left
Every NeetCode 150 row has a file.
Announce: "NeetCode 150 complete." and suggest the next pattern based on MAANG frequency (DP > Backtracking > Greedy > advanced graph > rest).
