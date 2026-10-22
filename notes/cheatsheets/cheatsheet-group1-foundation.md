# Group 1: Foundation

| | |
|---|---|
| **Patterns** | HashSet · Frequency Array |
| **Prerequisite** | None. This is the base everything else builds on |
| **When to read** | Open this when working on any Group 1 pattern (3 min) |

---

## HashSet

> **Real world:** a guest list. O(1) "is this person on the list?" with no duplicates allowed.

| Operation | Cost | Returns |
|---|---|---|
| `set.add(n)` | O(1) avg | `true` if `n` was **new**, `false` if already present |
| `set.contains(n)` | O(1) avg | `true` if present |
| `set.remove(n)` | O(1) avg | `true` if the element existed |

### Seen-before: duplicate detection in one pass
*Card: [contains-duplicate-solved.md](../contains-duplicate-solved.md)*

```java
Set<Integer> seen = new HashSet<>();
for (int n : nums) {
    if (!seen.add(n)) return true;   // add() == false -> already seen
}
return false;
```

### Watch out for

| | Mistake | Fix |
|---|---|---|
| ⚠️ | Naming the result of `add()` "isPresent" (it is true when the value is **new**) | Call it `isNew`, or inline it: `if (!seen.add(x))` |
| ⚠️ | Returning `true` for an empty or single-element array | No repeat has been found, so return `false` |
| ⚠️ | Using a `boolean[]` indexed by value | Values reach 1e9 and can be negative; use a set |

---

## Frequency Array

> **Real world:** a bag of Scrabble tiles. Count the tiles for one word, then take them out for the other.
>
> It is the array version of a frequency HashMap. Use it only when the keys are a small fixed set, such as `'a'`–`'z'`.

### Count up with `s`, pay back with `t`
*Card: [valid-anagram-solved.md](../valid-anagram-solved.md)*

```java
if (s.length() != t.length()) return false;

int[] count = new int[26];
for (int i = 0; i < s.length(); i++) count[s.charAt(i) - 'a']++;

for (int i = 0; i < t.length(); i++) {
    if (--count[t.charAt(i) - 'a'] < 0) return false;   // t used a letter s didn't have
}
return true;                                              // equal lengths + no negatives -> all zeros
```

### Watch out for

| | Mistake | Fix |
|---|---|---|
| ⚠️ | Comparing `s.length()` with the count array's length (26) | Compare `s.length()` with `t.length()` |
| ⚠️ | Adding both strings into **one** array | `"aa"` and `"bb"` both give a:2, b:2. Count up with one, down with the other |
| ⚠️ | Unicode input | Use `HashMap<Character, Integer>` instead of `int[26]` |
