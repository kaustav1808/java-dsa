# 221. Maximal Square

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/maximal-square/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-23

**Where it fits:** Week 14 - 2D Dynamic Programming → Additional practice (SCRUM-23)

## Problem statement

Given a binary matrix of '0' and '1', find the largest square containing only '1's and return its area.

## Examples

- `[[1,0,1,0,0],[1,0,1,1,1],[1,1,1,1,1],[1,0,0,1,0]] -> 4`
- `[[0]] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[r][c] = 1 + min(top, left, top-left) when the cell is '1'; answer is maxSide^2.

</details>

## Files in this package

- `MaximalSquare.java`: the LeetCode method/class signature, write your solution here.
- `MaximalSquareTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
