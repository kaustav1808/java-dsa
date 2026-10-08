# 394. Decode String

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/decode-string/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-15

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Additional practice (SCRUM-15)

## Problem statement

Decode a string encoded as k[encoded_string], meaning the part inside the brackets repeats k times. Encodings can be nested. Input is always valid and digits only appear as repeat counts.

## Examples

- `s = "3[a]2[bc]" -> "aaabcbc"`
- `s = "3[a2[c]]" -> "accaccacc"`
- `s = "2[abc]3[cd]ef" -> "abcabccdcdcdef"`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Two stacks (counts and partial strings) or recursion on '['.

</details>

## Files in this package

- `DecodeString.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `DecodeStringTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
