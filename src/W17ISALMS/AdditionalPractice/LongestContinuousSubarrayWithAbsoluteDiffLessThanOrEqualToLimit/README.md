# 1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-26

**Where it fits:** Week 17 - Interview Simulation: Arrays, Lists & Monotonic Structures → Additional practice (SCRUM-26)

## Problem statement

Given an integer array and a limit, return the length of the longest non-empty contiguous subarray in which the absolute difference between any two elements is at most limit.

## Examples

- `nums = [8, 2, 4, 7], limit = 4 -> 2`
- `nums = [10, 1, 2, 4, 7, 2], limit = 5 -> 4`
- `nums = [4, 2, 2, 2, 4, 4, 2, 2], limit = 0 -> 3`

## Board note

Monotonic deques.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sliding window with two monotonic deques (one for the max, one for the min); shrink while max - min > limit.

</details>

## Files in this package

- `LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit.java`: the LeetCode method/class signature, write your solution here.
- `LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimitTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
