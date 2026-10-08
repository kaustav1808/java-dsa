# 474. Ones and Zeroes

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/ones-and-zeroes/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-29

**Where it fits:** Week 20 - Interview Simulation: DP, Knapsack & Bitmask → Additional practice (SCRUM-29)

## Problem statement

Given an array of binary strings and two integers m and n, return the size of the largest subset of strings that together use at most m zeros and at most n ones.

## Examples

- `strs = ["10","0001","111001","1","0"], m = 5, n = 3 -> 4  ({"10","0001","1","0"})`
- `strs = ["10","0","1"], m = 1, n = 1 -> 2`

## Board note

2D knapsack.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- 0/1 knapsack with two capacities: dp[z][o], iterated backwards for each string.

</details>

## Files in this package

- `OnesAndZeroes.java`: the LeetCode method/class signature, write your solution here.
- `OnesAndZeroesTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
