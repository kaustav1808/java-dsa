# 300. Longest Increasing Subsequence

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/longest-increasing-subsequence/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-118

**Where it fits:** Week 13 - 1D Dynamic Programming → Day 89 - Longest Increasing Subsequence (SCRUM-118)

## Problem statement

Given an integer array, return the length of the longest strictly increasing subsequence (elements in order, not necessarily adjacent).

## Examples

- `nums = [10, 9, 2, 5, 3, 7, 101, 18] -> 4  ([2, 3, 7, 18])`
- `nums = [7, 7, 7] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- O(n^2) DP, or O(n log n) with a 'tails' array and binary search.

</details>

## Files in this package

- `LongestIncreasingSubsequence.java`: the LeetCode method/class signature, write your solution here.
- `LongestIncreasingSubsequenceTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
