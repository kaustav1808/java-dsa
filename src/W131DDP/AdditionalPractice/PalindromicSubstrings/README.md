# 647. Palindromic Substrings

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/palindromic-substrings/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-22

**Where it fits:** Week 13 - 1D Dynamic Programming → Additional practice (SCRUM-22)

## Problem statement

Given a string, return how many of its substrings are palindromes. Substrings at different positions count separately even if their text is the same.

## Examples

- `s = "abc" -> 3`
- `s = "aaa" -> 6`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Expand around each centre (2n - 1 centres) and count every successful expansion.

</details>

## Files in this package

- `PalindromicSubstrings.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `PalindromicSubstringsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
