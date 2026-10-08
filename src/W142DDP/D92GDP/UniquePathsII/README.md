# 63. Unique Paths II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/unique-paths-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-121

**Where it fits:** Week 14 - 2D Dynamic Programming → Day 92 - Grid DP (SCRUM-121)

## Problem statement

Same as Unique Paths (move only right or down from top-left to bottom-right), but the grid contains obstacles: cells with 1 cannot be entered, cells with 0 are free. Return the number of distinct paths.

## Examples

- `grid = [[0,0,0],[0,1,0],[0,0,0]] -> 2`
- `grid = [[1]] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- An obstacle cell contributes 0 paths; watch the start cell being blocked.

</details>

## Files in this package

- `UniquePathsII.java`: the LeetCode method/class signature, write your solution here.
- `UniquePathsIITest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
