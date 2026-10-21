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
| — | Contains Duplicate | hashset | — | | | | |
| — | Valid Anagram | hashmap / frequency | — | | | | |
| two-sum-solved.md | Two Sum | hashmap / complement-lookup | 3 | | | | |
| — | Group Anagrams | hashmap | — | | | | |
| — | Top K Frequent Elements | heap / bucket-sort | — | | | | |
| — | Encode and Decode Strings | string / design | — | | | | |
| product-of-array-except-self-solved.md | Product of Array Except Self | prefix-product / two-pass | 3 | | | | |
| valid-sudoku-solved.md | Valid Sudoku | matrix / box-index / set | 3 | | | | |
| longest-consecutive-sequence-solved.md | Longest Consecutive Sequence | hashset / sequence-start | 3 | | | | |

## Two Pointers
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| valid-palindrome-solved.md | Valid Palindrome | two-pointer / skip non-alnum | 6 | | | | |
| — | Two Sum II - Input Array Is Sorted | two-pointer | — | | | | |
| triplet-sum-to-zero-solved.md | 3Sum | sort + two-pointer + dedup | 4 | | | | |
| container-with-most-water-solved.md | Container with Most Water | two-pointer / move shorter | 5 | | | | |
| — | Trapping Rain Water | two-pointer | — | | | | |

## Sliding Window
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Best Time to Buy and Sell Stock | sliding-window / min-so-far | — | | | | |
| longest-substring-without-repeating-solved.md | Longest Substring Without Repeating Characters | sliding window / lastIndex | 4 | | | | |
| longest-repeating-character-replacement-solved.md | Longest Repeating Character Replacement | sliding window / maxFreq | 4 | | | | |
| — | Permutation in String | fixed sliding window | — | | | | |
| minimum-window-substring-solved.md | Minimum Window Substring | sliding-window / frequency-map | 4 | | | | |
| sliding-window-maximum-solved.md | Sliding Window Maximum | monotonic deque of indices | 4 | | | | |

## Stack
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| valid-parentheses-solved.md | Valid Parentheses | stack / matching | 5 | | | | |
| — | Min Stack | stack / design | — | | | | |
| evaluate-reverse-polish-notation-solved.md | Evaluate Reverse Polish Notation | stack / pop b then a | 4 | | | | |
| — | Generate Parentheses | backtracking | — | | | | |
| — | Daily Temperatures | monotonic stack | — | | | | |
| — | Car Fleet | stack / sort | — | | | | |
| — | Largest Rectangle in Histogram | monotonic stack | — | | | | |

## Binary Search
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Binary Search | binary-search / standard | — | | | | |
| search-2d-matrix-solved.md | Search a 2D Matrix | binary search / row=mid/cols | 4 | | | | |
| koko-eating-bananas-solved.md | Koko Eating Bananas | binary search on answer / ceiling div | 4 | | | | |
| find-minimum-rotated-sorted-array-solved.md | Find Minimum in Rotated Sorted Array | binary search / right=mid | 4 | | | | |
| search-rotated-sorted-array-solved.md | Search in Rotated Sorted Array | binary search / sorted half | 4 | | | | |
| — | Time Based Key-Value Store | hashmap / binary-search | — | | | | |
| median-two-sorted-arrays-solved.md | Median of Two Sorted Arrays | binary-search / partition | 3 | | | | |

## Linked List
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| reverse-linked-list-solved.md | Reverse Linked List | three-pointer / iterative | 6 | | | | |
| — | Merge Two Sorted Lists | linked-list / dummy node | — | | | | |
| — | Reorder List | linked-list / slow-fast + reverse | — | | | | |
| remove-nth-node-from-end-solved.md | Remove Nth Node From End of List | dummy node / advance fast n+1 | 3 | | | | |
| — | Copy List with Random Pointer | linked-list / hashmap | — | | | | |
| — | Add Two Numbers | linked-list / carry | — | | | | |
| linked-list-cycle-solved.md | Linked List Cycle | Floyd's cycle detection | 6 | | | | |
| — | Find the Duplicate Number | Floyd's cycle detection | — | | | | |
| lru-cache-solved.md | LRU Cache | hashmap / doubly-linked-list | 5 | | | | |
| merge-k-sorted-lists-solved.md | Merge K Sorted Lists | min-heap of ListNodes | 4 | | | | |
| — | Reverse Nodes in k-Group | linked-list / reverse | — | | | | |

## Trees
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| invert-binary-tree-solved.md | Invert Binary Tree | dfs / swap | 6 | | | | |
| max-depth-binary-tree-solved.md | Maximum Depth of Binary Tree | dfs / recursion | 6 | | | | |
| diameter-binary-tree-solved.md | Diameter of Binary Tree | dfs / return height / global max | 4 | | | | |
| balanced-binary-tree-solved.md | Balanced Binary Tree | dfs / -1 sentinel | 1 | | | | |
| same-tree-solved.md | Same Tree | structural dfs | 5 | | | | |
| — | Subtree of Another Tree | structural dfs | — | | | | |
| — | Lowest Common Ancestor of a BST | bst | — | | | | |
| — | Binary Tree Level Order Traversal | bfs | — | | | | |
| binary-tree-right-side-view-solved.md | Binary Tree Right Side View | bfs / reverse-preorder | 3 | | | | |
| — | Count Good Nodes in Binary Tree | dfs / max-so-far | — | | | | |
| validate-bst-solved.md | Validate Binary Search Tree | min/max bounds / Long | 4 | | | | |
| kth-smallest-bst-solved.md | Kth Smallest Element in a BST | iterative inorder / stop at k | 4 | | | | |
| construct-binary-tree-preorder-inorder-solved.md | Construct Binary Tree from Preorder and Inorder | tree / recursion / HashMap | 3 | | | | |
| binary-tree-maximum-path-sum-solved.md | Binary Tree Maximum Path Sum | dfs / post-order / global-max | 3 | | | | |
| serialize-deserialize-binary-tree-solved.md | Serialize and Deserialize Binary Tree | tree / preorder / queue | 3 | | | | |

## Heap / Priority Queue
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Kth Largest Element in a Stream | min-heap size k | — | | | | |
| — | Last Stone Weight | max-heap | — | | | | |
| — | K Closest Points to Origin | heap / top-k | — | | | | |
| — | Kth Largest Element in an Array | heap / quickselect | — | | | | |
| — | Task Scheduler | heap / greedy | — | | | | |
| — | Design Twitter | heap / design | — | | | | |
| find-median-data-stream-solved.md | Find Median from Data Stream | two-heap / rebalance | 3 | | | | |

## Backtracking
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Subsets | backtracking | — | | | | |
| — | Combination Sum | backtracking | — | | | | |
| — | Combination Sum II | backtracking / dedup | — | | | | |
| — | Permutations | backtracking | — | | | | |
| — | Subsets II | backtracking / dedup | — | | | | |
| — | Generate Parentheses | backtracking | — | | | | |
| word-search-solved.md | Word Search | backtracking / dfs / matrix | 4 | | | | |
| — | Palindrome Partitioning | backtracking | — | | | | |
| — | Letter Combinations of a Phone Number | backtracking | — | | | | |
| — | N-Queens | backtracking / constraint | — | | | | |

## Tries
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| implement-trie-solved.md | Implement Trie (Prefix Tree) | trie / design | 3 | | | | |
| design-add-search-words-solved.md | Design Add and Search Words Data Structure | trie / dfs / wildcard | 3 | | | | |
| word-search-ii-solved.md | Word Search II | trie / dfs / backtracking | 3 | | | | |

## Graphs
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| number-of-islands-solved.md | Number of Islands | dfs flood fill | 4 | | | | |
| max-area-of-island-solved.md | Max Area of Island | dfs / return area | 4 | | | | |
| clone-graph-solved.md | Clone Graph | graph / bfs / hashmap | 3 | | | | |
| walls-and-gates-solved.md | Walls and Gates | multi-source-bfs / matrix | 4 | | | | |
| rotting-oranges-solved.md | Rotting Oranges | multi-source bfs / fresh count | 4 | | | | |
| pacific-atlantic-water-flow-solved.md | Pacific Atlantic Water Flow | multi-source-bfs / reverse-flow | 3 | | | | |
| surrounded-regions-solved.md | Surrounded Regions | multi-source-bfs / boundary-seed | 3 | | | | |
| course-schedule-solved.md | Course Schedule | topological-sort / kahn's / cycle-detection | 4 | | | | |
| — | Course Schedule II | topological-sort | — | | | | |
| redundant-connection-solved.md | Redundant Connection | union-find | 3 | | | | |
| number-of-connected-components-solved.md | Number of Connected Components in an Undirected Graph | graph / dfs | 4 | | | | |
| graph-valid-tree-solved.md | Graph Valid Tree | dfs / union-find / cycle-detection | 4 | | | | |
| word-ladder-solved.md | Word Ladder | graph / bfs | 3 | | | | |

## Advanced Graphs
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Reconstruct Itinerary | graph / euler path | — | | | | |
| min-cost-connect-all-points-solved.md | Min Cost to Connect All Points | graph / mst / prim's | 2 | | | | |
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
| longest-increasing-path-matrix-solved.md | Longest Increasing Path in a Matrix | graph / dfs / memoization | 3 | | | | |
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
| merge-intervals-solved.md | Merge Intervals | sort by start / max end | 4 | | | | |
| non-overlapping-intervals-solved.md | Non-overlapping Intervals | sort by end / prevEnd | 4 | | | | |
| — | Meeting Rooms | intervals / sort | — | | | | |
| — | Meeting Rooms II | intervals / heap | — | | | | |
| — | Minimum Interval to Include Each Query | intervals / heap | — | | | | |

## Math & Geometry
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| — | Rotate Image | matrix | — | | | | |
| — | Spiral Matrix | matrix | — | | | | |
| set-matrix-zeroes-solved.md | Set Matrix Zeroes | matrix / two-pass | 6 | | | | |
| happy-number-solved.md | Happy Number | hashset / cycle detection | 4 | | | | |
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

## Additional Solved (not in NeetCode 150)
| File | Problem | Tag | Stage | Review Date | Last Rating | Review Count | Graduated |
|---|---|---|---|---|---|---|---|
| move-zeroes-solved.md | Move Zeroes | two-pointer / in-place | 6 | | | | |
| middle-of-linked-list-solved.md | Middle of Linked List | slow-fast pointer | 6 | | | | |
| logger-rate-limiter-solved.md | Logger Rate Limiter | hashmap / timestamp | 5 | | | | |
| moving-average-data-stream-solved.md | Moving Average from Data Stream | queue / running-sum | 5 | | | | |
| find-all-anagrams-solved.md | Find All Anagrams in String | fixed sliding window / matched counter | 6 | | | | |
| intersection-of-linked-lists-solved.md | Intersection of Linked Lists | two-pointer / redirect | 4 | | | | |
| linked-list-palindrome-solved.md | Linked List Palindrome | reverse second half / compare | 4 | | | | |
| next-greater-element-i-solved.md | Next Greater Element I | monotonic stack + HashMap | 1 | | | | |
| implement-stack-using-queues-solved.md | Implement Stack Using Queues | queue / rotate n-1 | 4 | | | | |
| implement-queue-using-stacks-solved.md | Implement Queue Using Stacks | two stacks / lazy transfer | 4 | | | | |
| remove-adjacent-duplicates-solved.md | Remove Adjacent Duplicates | StringBuilder as stack | 4 | | | | |
| symmetric-tree-solved.md | Symmetric Tree | dfs / isMirror | 4 | | | | |
| maximum-width-binary-tree-solved.md | Maximum Width of Binary Tree | bfs / index / normalize | 4 | | | | |
| find-first-last-position-sorted-array-solved.md | Find First and Last Position | binary search / save+continue | 4 | | | | |
| find-peak-element-solved.md | Find Peak Element | binary search / compare mid+1 | 4 | | | | |
| range-sum-query-immutable-solved.md | Range Sum Query Immutable | prefix sum | 4 | | | | |
| sort-k-sorted-array-solved.md | Sort K-Sorted Array | min-heap size k+1 | 4 | | | | |
| k-most-frequent-strings-solved.md | K Most Frequent Strings | min-heap size k / reverse lex | 4 | | | | |
| possible-bipartition-solved.md | Possible Bipartition | graph / bfs-dfs / bipartite | 4 | | | | |
| min-max-stack-solved.md | Min Max Stack | stack / design / two-stack | 4 | | | | |
| subarray-sum-equals-k-solved.md | Subarray Sum Equals K | prefix-sum / hashmap | 2 | | | | |
| lowest-common-ancestor-binary-tree-solved.md | Lowest Common Ancestor Binary Tree | tree / dfs | 6 | | | | |
| evaluate-expression-solved.md | Evaluate Expression | stack / sign-tracking | 3 | | | | |
| 3sum-closest-solved.md | 3Sum Closest | two-pointer / three-sum | 3 | | | | |
| nested-list-weight-sum-solved.md | Nested List Weight Sum | bfs / weighted-depth | 3 | | | | |
| nested-list-weight-sum-ii-solved.md | Nested List Weight Sum II | bfs / carry-forward / running-sum | 3 | | | | |
| search-insert-position-solved.md | Search Insert Position | binary-search / lower-bound | 3 | | | | |
| flatten-binary-tree-to-linked-list-solved.md | Flatten Binary Tree to Linked List | tree / rightmost-of-left | 3 | | | | |
| flatten-doubly-linked-list-solved.md | Flatten Doubly Linked List | linked-list / child-tail | 3 | | | | |
| next-permutation-solved.md | Next Permutation | array / find-descent / reverse-suffix | 3 | | | | |
| maximum-overlapping-intervals-solved.md | Maximum Overlapping Intervals | heap / end-times | 3 | | | | |
| interval-list-intersections-solved.md | Interval List Intersections | two-pointer / advance smaller end | 3 | | | | |
| random-pick-with-weight-solved.md | Random Pick with Weight | prefix-sum / binary-search | 3 | | | | |
| cutting-wood-solved.md | Cutting Wood / Capacity to Ship | binary-search on answer | 3 | | | | |
| closest-bst-value-ii-solved.md | Closest BST Value II | bst / inorder / deque | 3 | | | | |
| geometric-sequence-triplets-solved.md | Geometric Sequence Triplets | array / fix-middle / count | 3 | | | | |
| is-graph-bipartite-solved.md | Is Graph Bipartite | graph / bfs / 2-coloring | 3 | | | | |
| min-heap-construction-solved.md | Min Heap Construction | heap / design / sift-down | 3 | | | | |
| vertical-order-traversal-solved.md | Vertical Order Traversal | bfs / treemap / column-tracking | 3 | | | | |
| dijkstras-shortest-path-solved.md | Dijkstra's Shortest Path | graph / dijkstra / min-heap | 3 | | | | |
| ransom-note-solved.md | Ransom Note | hashmap / frequency-count | 3 | | | | |
| intersection-of-two-arrays-solved.md | Intersection of Two Arrays | hashset / intersection | 2 | | | | |
| top-k-frequent-words-solved.md | Top K Frequent Words | heap / top-k / custom-comparator | 3 | | | | |
| connecting-cities-with-minimum-cost-solved.md | Connecting Cities with Minimum Cost | graph / mst / prim's | 3 | | | | |
| optimize-water-distribution-solved.md | Optimize Water Distribution in a Village | graph / mst / virtual-node / prim's | 1 | | | | |
