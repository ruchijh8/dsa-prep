# Group 1 — Foundation
# Patterns: HashSet
# Prerequisite: none — this is the base everything else builds on
# Daily read: open this when working on any Group 1 pattern (3 min)

---

## ── HASHSET ──────────────────────────────────────────────────────────────────
# Real world: a guest list — O(1) "is this person on the list?" with no duplicates allowed.

```java
Set<Integer> set = new HashSet<>();
set.add(n);        // O(1) — returns true if n was NEW, false if already present
set.contains(n);   // O(1)
set.remove(n);     // O(1) — returns true if element existed

// Seen-before — duplicate detection in one pass (Contains Duplicate)
Set<Integer> seen = new HashSet<>();
for (int n : nums) {
    if (!seen.add(n)) return true;   // add() == false -> already seen
}
return false;
```

⚠️ `add()` returns true when the value is NEW — name the result `isNew`, or inline it in `if (!seen.add(n))`.
⚠️ Empty and single-element arrays have no duplicates -> false.
⚠️ Don't use a `boolean[]` indexed by value: values reach 1e9 and can be negative.
