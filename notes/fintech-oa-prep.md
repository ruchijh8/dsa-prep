# Online Assessment (OA) Prep — Fintech Targets
# Target: second week of January 2027 (exact date TBD — about 11 weeks from 2026-10-21)
# Companies: Morgan Stanley, Visa, JPMC (JPMorgan Chase), Mastercard
# Platform / format per company: TBD — fill in the table below once each invite arrives.
# The problem lists below were reported for a Capital One CodeSignal OA by the repo's previous owner — use them as a general easy/medium guide, not as a prediction for these companies.
# Progress as of 2026-10-21: 1 problem solved (Contains Duplicate). Just started.

---

## Current Progress

| Problem | LC # | Status |
|---|---|---|
| Contains Duplicate | #217 | ✅ Solved 2026-10-21 — Stage 1, review due 2026-10-22 |
| Everything else below | — | ⬜ Not solved |

Daily rhythm (from CLAUDE.md): `/start` for a new problem, then `/review-dsa` for up to 5 reviews.

---

## Company Tracker

| Company | OA date | Platform | Format / time limit | Notes |
|---|---|---|---|---|
| Morgan Stanley | TBD | TBD | TBD | |
| Visa | TBD | TBD | TBD | |
| JPMC | TBD | TBD | TBD | |
| Mastercard | TBD | TBD | TBD | |

---

## OA Format (assumed from the Capital One report — confirm per company)

- 4 questions, 70 minutes
- Q1 + Q2: Easy — solve in < 20 min combined
- Q3: Medium-Hard — Grid/String implementation, 15–20 min
- Q4: Medium — HashMap / Subarray trick, algorithmic; DP reportedly did NOT appear
- Partial credit on Q4 — always write something even if brute-force only

**Strategy:** Finish Q1+Q2 fast → skip to Q4 → brute-force Q4 for partial → return to Q3.

---

## Draft Timeline (until the second week of January)

| Dates | Focus (NeetCode 150 order) | Goal |
|---|---|---|
| Oct 21 – Nov 15 | Arrays & Hashing, Two Pointers, Sliding Window, Stack | Easy/medium fluency. Q1/Q2 and Q4 patterns |
| Nov 16 – Dec 13 | Binary Search, Linked List, Trees, Heap | Cover the remaining easy/medium patterns |
| Dec 14 – Dec 31 | Graphs (grid BFS/DFS), then Backtracking | Grid problems for Q3 |
| Jan 1 – OA day | Timed mocks (70 min, 4 questions) + review weak cards | Speed and partial-credit habits |

Adjust once the company, format and exact date are known.

---

## Priority Problems by Slot (reported for the previous target)

### Q1 / Q2 — Easy

| Problem | LC # | Solved |
|---|---|---|
| Two Sum | #1 | ⬜ |
| Valid Parentheses | #20 | ⬜ |
| Reverse Linked List | #206 | ⬜ |
| Best Time to Buy and Sell Stock | #121 | ⬜ |
| Contains Duplicate | #217 | ✅ |
| Merge Two Sorted Lists | #21 | ⬜ |

### Q3 — Medium-Hard (Grid BFS / String Implementation)

| Problem | LC # | Solved |
|---|---|---|
| Number of Islands | #200 | ⬜ |
| Flood Fill | #733 | ⬜ (covered by Number of Islands pattern) |
| Find All Anagrams in a String | #438 | ⬜ |
| **Image Smoother** | **#661** | ⬜ (grid match to the reported Q3) |
| Spiral Matrix | #54 | ⬜ (low priority) |
| Rotate Image | #48 | ⬜ (low priority) |

### Q4 — Medium (HashMap / Subarray — most likely trick)

| Problem | LC # | Solved |
|---|---|---|
| **Subarray Sum Equals K** | **#560** | ⬜ (most commonly reported Q4) |
| Minimum Window Substring | #76 | ⬜ |
| Longest Consecutive Sequence | #128 | ⬜ |
| Top K Frequent Elements | #347 | ⬜ |
| Group Anagrams | #49 | ⬜ (sort-key trick: `Arrays.sort(s.toCharArray())` as the HashMap key) |
| 3Sum | #15 | ⬜ |
| Max Size Subarray Sum Equals K | #325 | ⬜ (covered by #560 pattern) |

---

## Review Coach Instructions

1. Normal SRS priority applies until about 2 weeks before the OA.
2. From about Dec 28, prioritise cards for the problems listed above, even if not overdue.
3. The cap of 5 problems per session still applies.
4. In the final week, use Blitz mode on these cards: time pressure matters more than thoroughness.
5. After the OA, remove the override.
