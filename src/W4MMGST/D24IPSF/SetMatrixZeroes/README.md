# 73. Set Matrix Zeroes

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/set-matrix-zeroes/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-53

**Where it fits:** Week 4 - Matrix Manipulation & Grid State Tracking → Day 24 - In-place state flags (SCRUM-53)

## Problem statement

Given an m x n integer matrix, if any element is 0, set its entire row and column to 0. Do it in place; the follow-up asks for O(1) extra space.

## Examples

- `[[1,1,1],[1,0,1],[1,1,1]] -> [[1,0,1],[0,0,0],[1,0,1]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Use the first row and first column as marker storage, with two flags for themselves.

</details>

## Files in this package

- `SetMatrixZeroes.java`: the LeetCode method/class signature, write your solution here.
- `SetMatrixZeroesTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
