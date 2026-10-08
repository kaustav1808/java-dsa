# 698. Partition to K Equal Sum Subsets

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/partition-to-k-equal-sum-subsets/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-166

**Where it fits:** Week 20 - Interview Simulation: DP, Knapsack & Bitmask → Day 137 - Partition to K Equal Sum Subsets (SCRUM-166)

## Problem statement

Given an integer array and k, return true if the array can be divided into k non-empty subsets that all have the same sum.

## Examples

- `nums = [4, 3, 2, 3, 5, 2, 1], k = 4 -> true  ((5), (1,4), (2,3), (2,3))`
- `nums = [1, 2, 3, 4], k = 3 -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Backtracking that fills buckets with target = sum / k; sort descending and skip identical empty buckets to prune (or bitmask DP).

</details>

## Files in this package

- `PartitionToKEqualSumSubsets.java`: the LeetCode method/class signature, write your solution here.
- `PartitionToKEqualSumSubsetsTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
