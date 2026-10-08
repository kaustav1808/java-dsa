# 5. Longest Palindromic Substring

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/longest-palindromic-substring/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-125

**Where it fits:** Week 14 - 2D Dynamic Programming → Day 96 - Palindromic substring vs subsequence (SCRUM-125)

## Problem statement

Given a string `s`, return its longest substring that reads the same forwards and backwards. If several have the same maximum length, any of them is accepted.

## Examples

- `s = "forgeeksskeegfor" -> "geeksskeeg"`
- `s = "ac" -> "a" (or "c")`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Expand around each of the 2N-1 centres (odd and even lengths): O(N^2) time, O(1) space.

</details>

## Files in this package

- `LongestPalindromicSubstring.java`: the LeetCode method/class signature, write your solution here.
- `LongestPalindromicSubstringTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
