# Valid Anagram — Easy
Problem Link: https://neetcode.io/problems/is-anagram/question
Solved Date: 2026-10-22
Pattern Tag: frequency-array / int[26]

## SRS Tracking
- Stage: 1
- Review Date: 2026-10-23
- Last Rating: —
- Review Count: 0
- Graduated: No

---

# Real World Analogy
A bag of Scrabble tiles: count the tiles for word one, then take tiles out one by one for word two. If you ever need a tile that isn't in the bag, or tiles are left over, they aren't anagrams.

## Core Insight
Two strings are anagrams exactly when they have the same length and the same count of every letter. Count `s` into a 26-slot array, then "pay back" with `t` by decrementing; if any slot goes below zero, return false.

## Approach
Check the lengths first. Count each letter of `s` into `int[26]` using `c - 'a'` as the slot. For each letter of `t`, decrement its slot and return false the moment a slot goes below zero. Equal lengths plus no negatives means every slot ends at zero.

## Mental Model

╔══════════════════════════════════════════╦══════════════════════════════════════════════════════╗
║ Decision                                 ║ Why                                                  ║
╠══════════════════════════════════════════╬══════════════════════════════════════════════════════╣
║ int[26] instead of a HashMap             ║ Lowercase letters only: fixed 26 slots, O(1) space   ║
║ Slot = c - 'a'                           ║ char is a number; no need to memorise ASCII values   ║
║ Length check first                       ║ Different lengths can never be anagrams; also needed ║
║                                          ║ for correctness ("ab" vs "a" would pass otherwise)   ║
║ Count up with s, down with t             ║ One array remembers which string each letter is from ║
║ Stop when a slot goes below 0            ║ t used a letter s didn't have enough of              ║
║ No final scan for zeros                  ║ Equal lengths: total up == total down, none negative ║
║                                          ║ -> every slot is exactly 0                           ║
╚══════════════════════════════════════════╩══════════════════════════════════════════════════════╝

## Pseudocode
```
if s.length != t.length: return false
count = int[26]
for c in s: count[c - 'a']++
for c in t:
    count[c - 'a']--
    if count[c - 'a'] < 0: return false
return true
```

## Complexity

### Time: O(n)

╔═══════════════════════╦════════════════╦══════════════════════════════════════════════╗
║ Component             ║ Cost           ║ Why                                          ║
╠═══════════════════════╬════════════════╬══════════════════════════════════════════════╣
║ Count s               ║ O(n)           ║ One pass, O(1) per character                 ║
║ Pay back with t       ║ O(n)           ║ One pass, O(1) per character                 ║
║ Total                 ║ O(n)           ║ n + n; the 26 is a constant                  ║
╚═══════════════════════╩════════════════╩══════════════════════════════════════════════╝

### Space: O(1)

╔══════════════════╦══════════╦══════════════════════════════════════════════╗
║ Structure        ║ Size     ║ Why                                          ║
╠══════════════════╬══════════╬══════════════════════════════════════════════╣
║ count[26]        ║ O(1)     ║ Fixed 26 slots regardless of n               ║
║ toCharArray()    ║ O(n)     ║ Copies both strings; avoid with charAt(i)    ║
╚══════════════════╩══════════╩══════════════════════════════════════════════╝

### Why Optimal
Every character of both strings must be read at least once, so O(n) time is a lower bound; sorting both strings would cost O(n log n).

╔══════════════════════╦══════════════╦════════════════════════════════════════════╗
║ Algorithm / Approach ║ Time         ║ Note                                       ║
╠══════════════════════╬══════════════╬════════════════════════════════════════════╣
║ int[26] count/pay    ║ O(n)         ║ O(1) space (this solution)                 ║
╠══════════════════════╬══════════════╬════════════════════════════════════════════╣
║ Sort both, compare   ║ O(n log n)   ║ Simple; O(n) space for char arrays         ║
╠══════════════════════╬══════════════╬════════════════════════════════════════════╣
║ Two count arrays     ║ O(n)         ║ Compare 26 slots at the end                ║
╚══════════════════════╩══════════════╩════════════════════════════════════════════╝

## Watch Out For
- Length check compares `s.length()` with `t.length()` — NOT with the count array's length (26)
- Without the length check, "ab" vs "a" returns true (nothing goes negative)
- Adding both strings into one array can't work: "aa" and "bb" both give a:2, b:2
- Follow-up: if Unicode is allowed, use a HashMap<Character,Integer> instead of int[26]
  - `'é' - 'a'` = 233 - 97 = 136 -> `ArrayIndexOutOfBoundsException` on `int[26]` (seen when tested 2026-10-22)
  - Say the assumption out loud in an interview: "lowercase a-z only, so 26 slots"

## Dry Run
`s = "cat"`, `t = "tac"`
```
lengths equal (3 == 3)
after s:    c:1 a:1 t:1
t reads t:  t:0
t reads a:  a:0
t reads c:  c:0   -> all zeros -> true
```
`s = "aa"`, `t = "bb"`
```
after s:    a:2
t reads b:  b:-1  -> below zero -> false
```

## Boilerplate Template
```java
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < t.length(); i++) {
        if (--count[t.charAt(i) - 'a'] < 0) return false;
    }
    return true;
}
```

## Unicode / HashMap Version
Use when the input may contain any character (not just `a`-`z`). Same count-up / pay-back idea; the character itself is the key.

| | `int[26]` | `HashMap<Character, Integer>` |
|---|---|---|
| Works for | only `'a'`-`'z'` | any character |
| Space | fixed 26 slots, O(1) | one entry per distinct character, O(k) |
| Speed | a little faster | a little slower (hashing) |

```java
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    Map<Character, Integer> count = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        count.merge(s.charAt(i), 1, Integer::sum);          // count up
    }
    for (int i = 0; i < t.length(); i++) {
        char c = t.charAt(i);
        if (count.getOrDefault(c, 0) == 0) return false;    // nothing left to pay back
        count.merge(c, -1, Integer::sum);
    }
    return true;
}
```

Edge case to re-test on review: `s = "é"`, `t = "é"` -> HashMap version returns true, `int[26]` version crashes.
