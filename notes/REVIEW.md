# SRS Review Index
# NeetCode 150 tracker. File "—" = not solved yet.
# Review Date, Last Rating, Review Count, Graduated are intentionally blank (reset 2026-10-21).
# Update this file whenever:
# - A new card is added (fill File, Tag, Stage and the SRS fields)
# - A review is completed (update Stage, Review Date, Last Rating, Review Count)
# - A card graduates (mark Graduated=Yes)
#
# Format: | File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
# Intervals: Stage 1=1d  Stage 2=3d  Stage 3=10d  Stage 4=21d  Stage 5=45d  Stage 6=90d

## Arrays & Hashing
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| contains-duplicate-solved.md | Contains Duplicate | hashset / seen-before | 1 | 2026-10-23 | Okay | 1 | No |
| valid-anagram-solved.md | Valid Anagram | frequency-array / int[26] | 1 | 2026-10-23 | — | 0 | No |
| — | Two Sum | hashmap / complement-lookup | — | | | | |
| — | Group Anagrams | hashmap | — | | | | |
| — | Top K Frequent Elements | heap / bucket-sort | — | | | | |
| — | Encode and Decode Strings | string / design | — | | | | |
| — | Product of Array Except Self | prefix-product / two-pass | — | | | | |
| — | Valid Sudoku | matrix / box-index / set | — | | | | |
| — | Longest Consecutive Sequence | hashset / sequence-start | — | | | | |

## Two Pointers
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Valid Palindrome | two-pointer / skip non-alnum | — | | | | |
| — | Two Sum II - Input Array Is Sorted | two-pointer | — | | | | |
| — | 3Sum | sort + two-pointer + dedup | — | | | | |
| — | Container with Most Water | two-pointer / move shorter | — | | | | |
| — | Trapping Rain Water | two-pointer | — | | | | |

## Sliding Window
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Best Time to Buy and Sell Stock | sliding-window / min-so-far | — | | | | |
| — | Longest Substring Without Repeating Characters | sliding window / lastIndex | — | | | | |
| — | Longest Repeating Character Replacement | sliding window / maxFreq | — | | | | |
| — | Permutation in String | fixed sliding window | — | | | | |
| — | Minimum Window Substring | sliding-window / frequency-map | — | | | | |
| — | Sliding Window Maximum | monotonic deque of indices | — | | | | |

## Stack
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Valid Parentheses | stack / matching | — | | | | |
| — | Min Stack | stack / design | — | | | | |
| — | Evaluate Reverse Polish Notation | stack / pop b then a | — | | | | |
| — | Generate Parentheses | backtracking | — | | | | |
| — | Daily Temperatures | monotonic stack | — | | | | |
| — | Car Fleet | stack / sort | — | | | | |
| — | Largest Rectangle in Histogram | monotonic stack | — | | | | |

## Binary Search
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Binary Search | binary-search / standard | — | | | | |
| — | Search a 2D Matrix | binary search / row=mid/cols | — | | | | |
| — | Koko Eating Bananas | binary search on answer / ceiling div | — | | | | |
| — | Find Minimum in Rotated Sorted Array | binary search / right=mid | — | | | | |
| — | Search in Rotated Sorted Array | binary search / sorted half | — | | | | |
| — | Time Based Key-Value Store | hashmap / binary-search | — | | | | |
| — | Median of Two Sorted Arrays | binary-search / partition | — | | | | |

## Linked List
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Reverse Linked List | three-pointer / iterative | — | | | | |
| — | Merge Two Sorted Lists | linked-list / dummy node | — | | | | |
| — | Reorder List | linked-list / slow-fast + reverse | — | | | | |
| — | Remove Nth Node From End of List | dummy node / advance fast n+1 | — | | | | |
| — | Copy List with Random Pointer | linked-list / hashmap | — | | | | |
| — | Add Two Numbers | linked-list / carry | — | | | | |
| — | Linked List Cycle | Floyd's cycle detection | — | | | | |
| — | Find the Duplicate Number | Floyd's cycle detection | — | | | | |
| — | LRU Cache | hashmap / doubly-linked-list | — | | | | |
| — | Merge K Sorted Lists | min-heap of ListNodes | — | | | | |
| — | Reverse Nodes in k-Group | linked-list / reverse | — | | | | |

## Trees
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Invert Binary Tree | dfs / swap | — | | | | |
| — | Maximum Depth of Binary Tree | dfs / recursion | — | | | | |
| — | Diameter of Binary Tree | dfs / return height / global max | — | | | | |
| — | Balanced Binary Tree | dfs / -1 sentinel | — | | | | |
| — | Same Tree | structural dfs | — | | | | |
| — | Subtree of Another Tree | structural dfs | — | | | | |
| — | Lowest Common Ancestor of a BST | bst | — | | | | |
| — | Binary Tree Level Order Traversal | bfs | — | | | | |
| — | Binary Tree Right Side View | bfs / reverse-preorder | — | | | | |
| — | Count Good Nodes in Binary Tree | dfs / max-so-far | — | | | | |
| — | Validate Binary Search Tree | min/max bounds / Long | — | | | | |
| — | Kth Smallest Element in a BST | iterative inorder / stop at k | — | | | | |
| — | Construct Binary Tree from Preorder and Inorder | tree / recursion / HashMap | — | | | | |
| — | Binary Tree Maximum Path Sum | dfs / post-order / global-max | — | | | | |
| — | Serialize and Deserialize Binary Tree | tree / preorder / queue | — | | | | |

## Heap / Priority Queue
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Kth Largest Element in a Stream | min-heap size k | — | | | | |
| — | Last Stone Weight | max-heap | — | | | | |
| — | K Closest Points to Origin | heap / top-k | — | | | | |
| — | Kth Largest Element in an Array | heap / quickselect | — | | | | |
| — | Task Scheduler | heap / greedy | — | | | | |
| — | Design Twitter | heap / design | — | | | | |
| — | Find Median from Data Stream | two-heap / rebalance | — | | | | |

## Backtracking
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Subsets | backtracking | — | | | | |
| — | Combination Sum | backtracking | — | | | | |
| — | Combination Sum II | backtracking / dedup | — | | | | |
| — | Permutations | backtracking | — | | | | |
| — | Subsets II | backtracking / dedup | — | | | | |
| — | Generate Parentheses | backtracking | — | | | | |
| — | Word Search | backtracking / dfs / matrix | — | | | | |
| — | Palindrome Partitioning | backtracking | — | | | | |
| — | Letter Combinations of a Phone Number | backtracking | — | | | | |
| — | N-Queens | backtracking / constraint | — | | | | |

## Tries
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Implement Trie (Prefix Tree) | trie / design | — | | | | |
| — | Design Add and Search Words Data Structure | trie / dfs / wildcard | — | | | | |
| — | Word Search II | trie / dfs / backtracking | — | | | | |

## Graphs
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Number of Islands | dfs flood fill | — | | | | |
| — | Max Area of Island | dfs / return area | — | | | | |
| — | Clone Graph | graph / bfs / hashmap | — | | | | |
| — | Walls and Gates | multi-source-bfs / matrix | — | | | | |
| — | Rotting Oranges | multi-source bfs / fresh count | — | | | | |
| — | Pacific Atlantic Water Flow | multi-source-bfs / reverse-flow | — | | | | |
| — | Surrounded Regions | multi-source-bfs / boundary-seed | — | | | | |
| — | Course Schedule | topological-sort / kahn's / cycle-detection | — | | | | |
| — | Course Schedule II | topological-sort | — | | | | |
| — | Redundant Connection | union-find | — | | | | |
| — | Number of Connected Components in an Undirected Graph | graph / dfs | — | | | | |
| — | Graph Valid Tree | dfs / union-find / cycle-detection | — | | | | |
| — | Word Ladder | graph / bfs | — | | | | |

## Advanced Graphs
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Reconstruct Itinerary | graph / euler path | — | | | | |
| — | Min Cost to Connect All Points | graph / mst / prim's | — | | | | |
| — | Network Delay Time | graph / dijkstra | — | | | | |
| — | Swim in Rising Water | graph / dijkstra | — | | | | |
| — | Alien Dictionary | topological-sort | — | | | | |
| — | Cheapest Flights Within K Stops | graph / bellman-ford | — | | | | |

## 1-D Dynamic Programming
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Climbing Stairs | dp / 1d | — | | | | |
| — | Min Cost Climbing Stairs | dp / 1d | — | | | | |
| — | House Robber | dp / 1d | — | | | | |
| — | House Robber II | dp / 1d | — | | | | |
| — | Longest Palindromic Substring | dp / expand-around-center | — | | | | |
| — | Palindromic Substrings | dp / expand-around-center | — | | | | |
| — | Decode Ways | dp / 1d | — | | | | |
| — | Coin Change | dp / 1d | — | | | | |
| — | Maximum Product Subarray | dp / 1d | — | | | | |
| — | Word Break | dp / 1d | — | | | | |
| — | Longest Increasing Subsequence | dp / 1d | — | | | | |
| — | Partition Equal Subset Sum | dp / knapsack | — | | | | |

## 2-D Dynamic Programming
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Unique Paths | dp / 2d | — | | | | |
| — | Longest Common Subsequence | dp / 2d | — | | | | |
| — | Best Time to Buy and Sell Stock with Cooldown | dp / state machine | — | | | | |
| — | Coin Change II | dp / 2d | — | | | | |
| — | Target Sum | dp / knapsack | — | | | | |
| — | Interleaving String | dp / 2d | — | | | | |
| — | Longest Increasing Path in a Matrix | graph / dfs / memoization | — | | | | |
| — | Distinct Subsequences | dp / 2d | — | | | | |
| — | Edit Distance | dp / 2d | — | | | | |
| — | Burst Balloons | dp / interval | — | | | | |
| — | Regular Expression Matching | dp / 2d | — | | | | |

## Greedy
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Maximum Subarray | greedy / kadane | — | | | | |
| — | Jump Game | greedy | — | | | | |
| — | Jump Game II | greedy | — | | | | |
| — | Gas Station | greedy | — | | | | |
| — | Hand of Straights | greedy / hashmap | — | | | | |
| — | Merge Triplets to Form Target Triplet | greedy | — | | | | |
| — | Partition Labels | greedy | — | | | | |
| — | Valid Parenthesis String | greedy | — | | | | |

## Intervals
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Insert Interval | intervals | — | | | | |
| — | Merge Intervals | sort by start / max end | — | | | | |
| — | Non-overlapping Intervals | sort by end / prevEnd | — | | | | |
| — | Meeting Rooms | intervals / sort | — | | | | |
| — | Meeting Rooms II | intervals / heap | — | | | | |
| — | Minimum Interval to Include Each Query | intervals / heap | — | | | | |

## Math & Geometry
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Rotate Image | matrix | — | | | | |
| — | Spiral Matrix | matrix | — | | | | |
| — | Set Matrix Zeroes | matrix / two-pass | — | | | | |
| — | Happy Number | hashset / cycle detection | — | | | | |
| — | Plus One | math | — | | | | |
| — | Pow(x, n) | math / fast-power | — | | | | |
| — | Multiply Strings | math | — | | | | |
| — | Detect Squares | hashmap / design | — | | | | |

## Bit Manipulation
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Single Number | bit / xor | — | | | | |
| — | Number of 1 Bits | bit | — | | | | |
| — | Counting Bits | bit / dp | — | | | | |
| — | Reverse Bits | bit | — | | | | |
| — | Missing Number | bit / math | — | | | | |
| — | Sum of Two Integers | bit | — | | | | |
| — | Reverse Integer | math | — | | | | |
