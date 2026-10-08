# 279. Perfect Squares

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/perfect-squares/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-22

**Where it fits:** Week 13 - 1D Dynamic Programming → Additional practice (SCRUM-22)

## Problem statement

Given a positive integer n, return the least number of perfect square numbers (1, 4, 9, 16, ...) whose sum is n.

## Examples

- `n = 12 -> 3  (4 + 4 + 4)`
- `n = 13 -> 2  (4 + 9)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[i] = 1 + min(dp[i - s]) over squares s <= i (unbounded knapsack), or BFS.

</details>

## Files in this package

- `PerfectSquares.java`: the LeetCode method/class signature, write your solution here.
- `PerfectSquaresTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
