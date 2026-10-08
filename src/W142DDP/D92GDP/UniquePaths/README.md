# 62. Unique Paths

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/unique-paths/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-121

**Where it fits:** Week 14 - 2D Dynamic Programming → Day 92 - Grid DP (SCRUM-121)

## Problem statement

A robot starts at the top-left cell of an m x n grid and can only move right or down. Return how many distinct paths lead it to the bottom-right cell.

## Examples

- `m = 3, n = 2 -> 3`
- `m = 3, n = 3 -> 6`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[r][c] = dp[r-1][c] + dp[r][c-1]; a single row array is enough.

</details>

## Files in this package

- `UniquePaths.java`: the LeetCode method/class signature, write your solution here.
- `UniquePathsTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
