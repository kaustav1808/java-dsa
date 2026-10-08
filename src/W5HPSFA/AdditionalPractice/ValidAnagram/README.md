# 242. Valid Anagram

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/valid-anagram/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-14

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Additional practice (SCRUM-14)

## Problem statement

Given two strings s and t, return true if t is an anagram of s (uses exactly the same letters with the same counts).

## Examples

- `s = "anagram", t = "nagaram" -> true`
- `s = "rat", t = "car" -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- 26-slot frequency array: increment for s, decrement for t, check all zero.

</details>

## Files in this package

- `ValidAnagram.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ValidAnagramTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
