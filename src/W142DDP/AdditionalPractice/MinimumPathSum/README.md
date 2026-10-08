# 64. Minimum Path Sum

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/minimum-path-sum/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-23

**Where it fits:** Week 14 - 2D Dynamic Programming → Additional practice (SCRUM-23)

## Problem statement

Given an m x n grid of non-negative numbers, find a path from the top-left to the bottom-right cell, moving only right or down, that minimises the sum of the numbers on the path. Return that minimum sum.

## Examples

- `grid = [[1,3,1],[1,5,1],[4,2,1]] -> 7  (1 -> 3 -> 1 -> 1 -> 1)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[r][c] = grid[r][c] + min(top, left).

</details>

## Files in this package

- `MinimumPathSum.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MinimumPathSumTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
