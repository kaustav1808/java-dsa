# 115. Distinct Subsequences

**Difficulty:** Hard · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/distinct-subsequences/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-23

**Where it fits:** Week 14 - 2D Dynamic Programming → Additional practice (SCRUM-23)

## Problem statement

Given strings `s` and `t`, return how many distinct subsequences of s are equal to t (a subsequence deletes some characters without reordering the rest).

## Examples

- `s = "rabbbit", t = "rabbit" -> 3`
- `s = "aaa", t = "aa" -> 3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[i][j] = dp[i-1][j] + (s[i-1] == t[j-1] ? dp[i-1][j-1] : 0).

</details>

## Files in this package

- `DistinctSubsequences.java`: the LeetCode method/class signature, write your solution here.
- `DistinctSubsequencesTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
