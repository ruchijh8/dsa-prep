# Contains Duplicate — Easy
Problem Link: https://leetcode.com/problems/contains-duplicate/
Solved Date: 2026-10-21
Pattern Tag: hashset / seen-before

## SRS Tracking
- Stage: 1
- Review Date: 2026-10-22
- Last Rating: —
- Review Count: 0
- Graduated: No

---

# Real World Analogy
A guest list at a party: when someone walks in, check the list. If their name is already there, they're a repeat; otherwise write it down.

## Core Insight
Don't rescan the array to ask "have I seen this?" — remember seen values in a set, where the check is O(1). `set.add(x)` returns false when x was already present, so check and insert are one call.

## Approach
Walk the array once, adding each number to a HashSet. The first time `add` returns false, a value repeated — return true. If the loop ends, all values were distinct — return false.

## Mental Model

╔══════════════════════════════════════════╦══════════════════════════════════════════════════════╗
║ Decision                                 ║ Why                                                  ║
╠══════════════════════════════════════════╬══════════════════════════════════════════════════════╣
║ HashSet, not boolean[] "lockers"         ║ Values reach 1e9 and can be negative; array needs    ║
║                                          ║ a slot per possible value, a set only per seen value ║
║ Use return value of add()                ║ false = already present, so no separate contains()   ║
║ Return as soon as add() is false         ║ Early exit; no need to see the rest of the array     ║
╚══════════════════════════════════════════╩══════════════════════════════════════════════════════╝

## Pseudocode
```
seen = empty set
for n in nums:
    if seen.add(n) is false:
        return true
return false
```

## Complexity

### Time: O(n)

╔═══════════════════════╦════════════════╦══════════════════════════════════════════════╗
║ Component             ║ Cost           ║ Why                                          ║
╠═══════════════════════╬════════════════╬══════════════════════════════════════════════╣
║ Loop                  ║ O(n)           ║ One pass over nums                           ║
║ add() per element     ║ O(1) average   ║ Hash lookup + insert                         ║
║ Total                 ║ O(n)           ║ n * O(1)                                     ║
╚═══════════════════════╩════════════════╩══════════════════════════════════════════════╝

### Space: O(n)

╔══════════════════╦══════════╦══════════════════════════════════════════════╗
║ Structure        ║ Size     ║ Why                                          ║
╠══════════════════╬══════════╬══════════════════════════════════════════════╣
║ HashSet          ║ O(n)     ║ All distinct input -> every element stored   ║
╚══════════════════╩══════════╩══════════════════════════════════════════════╝

### Why Optimal
Every element must be looked at at least once, so O(n) time is a lower bound; sorting gets O(1)/O(log n) extra space but costs O(n log n) time.

╔══════════════════════╦══════════════╦════════════════════════════════════════════╗
║ Algorithm / Approach ║ Time         ║ Note                                       ║
╠══════════════════════╬══════════════╬════════════════════════════════════════════╣
║ HashSet (this)       ║ O(n)         ║ O(n) space — trades memory for speed       ║
╠══════════════════════╬══════════════╬════════════════════════════════════════════╣
║ Sort + adjacent      ║ O(n log n)   ║ O(1) extra space if sorting in place       ║
╠══════════════════════╬══════════════╬════════════════════════════════════════════╣
║ Brute force (pairs)  ║ O(n^2)       ║ O(1) space; too slow at n = 1e5            ║
╚══════════════════════╩══════════════╩════════════════════════════════════════════╝

## Watch Out For
- `add()` returns true when the value is NEW — a variable named "isPresent" for it is backwards; use `isNew` or just `if (!set.add(x))`
- Empty and single-element arrays have no duplicates -> false (don't special-case them to true)
- Don't use boolean[] indexed by value: values up to 1e9 and negatives break it

## Dry Run
`nums = [1, 2, 3, 1]`
```
n=1 -> add true  -> {1}
n=2 -> add true  -> {1,2}
n=3 -> add true  -> {1,2,3}
n=1 -> add FALSE -> return true
```

## Boilerplate Template
```java
public boolean hasDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int n : nums) {
        if (!seen.add(n)) return true;   // add() == false -> already seen
    }
    return false;
}
```
