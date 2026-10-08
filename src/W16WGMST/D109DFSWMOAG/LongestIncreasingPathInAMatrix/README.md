# 329. Longest Increasing Path in a Matrix

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-138

**Where it fits:** Week 16 - Weighted Graphs & Minimum Spanning Trees → Day 109 - DFS with memoisation on a grid (SCRUM-138)

## Problem statement

Given an m x n integer matrix, return the length of the longest strictly increasing path, moving up, down, left or right (no diagonals, no wrap-around).

## Examples

- `[[9,9,4],[6,6,8],[2,1,1]] -> 4  (1 -> 2 -> 6 -> 9)`
- `[[1]] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- DFS from each cell with memoisation; no visited set is needed because paths are strictly increasing.

</details>

## Files in this package

- `LongestIncreasingPathInAMatrix.java`: the LeetCode method/class signature, write your solution here.
- `LongestIncreasingPathInAMatrixTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
