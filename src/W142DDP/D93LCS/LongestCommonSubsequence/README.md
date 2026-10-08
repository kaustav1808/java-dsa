# 1143. Longest Common Subsequence

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/longest-common-subsequence/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-122

**Where it fits:** Week 14 - 2D Dynamic Programming → Day 93 - Longest Common Subsequence (SCRUM-122)

## Problem statement

Given two strings, return the length of their longest common subsequence (characters in the same relative order, not necessarily contiguous), or 0 if none.

## Examples

- `text1 = "abcde", text2 = "ace" -> 3`
- `text1 = "abc", text2 = "def" -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[i][j] = dp[i-1][j-1] + 1 on a match, else max(dp[i-1][j], dp[i][j-1]).

</details>

## Files in this package

- `LongestCommonSubsequence.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `LongestCommonSubsequenceTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
