# 74. Search a 2D Matrix

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/search-a-2d-matrix/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-76

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Day 47 - Binary search in a 2D matrix (SCRUM-76)

## Problem statement

You are given an m x n matrix where each row is sorted ascending and the first value of each row is greater than the last value of the previous row. Return whether `target` is in the matrix, in O(log(m * n)) time.

## Examples

- `matrix = [[1,3,5],[7,9,11],[13,15,17]], target = 9 -> true`
- `same matrix, target = 6 -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Treat it as one sorted array of length m*n: index k maps to (k / n, k % n).

</details>

## Files in this package

- `SearchA2DMatrix.java`: the LeetCode method/class signature, write your solution here.
- `SearchA2DMatrixTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
