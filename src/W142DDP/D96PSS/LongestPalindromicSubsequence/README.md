# 516. Longest Palindromic Subsequence

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/longest-palindromic-subsequence/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-125

**Where it fits:** Week 14 - 2D Dynamic Programming → Day 96 - Palindromic substring vs subsequence (SCRUM-125)

## Problem statement

Given a string s, return the length of its longest palindromic subsequence (characters in order, not necessarily contiguous).

## Examples

- `s = "bbbab" -> 4  ("bbbb")`
- `s = "cbbd" -> 2  ("bb")`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[i][j] = dp[i+1][j-1] + 2 if s[i] == s[j], else max(dp[i+1][j], dp[i][j-1]); equivalently LCS of s and reverse(s).

</details>

## Files in this package

- `LongestPalindromicSubsequence.java`: the LeetCode method/class signature, write your solution here.
- `LongestPalindromicSubsequenceTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
