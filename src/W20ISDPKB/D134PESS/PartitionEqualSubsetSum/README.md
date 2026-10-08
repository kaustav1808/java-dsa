# 416. Partition Equal Subset Sum

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/partition-equal-subset-sum/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-163

**Where it fits:** Week 20 - Interview Simulation: DP, Knapsack & Bitmask → Day 134 - Partition Equal Subset Sum (SCRUM-163)

## Problem statement

Given an array of positive integers, return true if it can be split into two subsets with equal sums.

## Examples

- `nums = [1, 5, 11, 5] -> true  ([1, 5, 5] and [11])`
- `nums = [1, 2, 3, 5] -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- 0/1 knapsack: can a subset reach total / 2? Use a boolean dp array iterated backwards (or a BitSet).

</details>

## Files in this package

- `PartitionEqualSubsetSum.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `PartitionEqualSubsetSumTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
