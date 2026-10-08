# 410. Split Array Largest Sum

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/split-array-largest-sum/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-16

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Additional practice (SCRUM-16)

## Problem statement

Split an array of non-negative integers into exactly k non-empty contiguous subarrays so that the largest subarray sum is as small as possible. Return that minimised largest sum.

## Examples

- `nums = [7, 2, 5, 10, 8], k = 2 -> 18  ([7,2,5] and [10,8])`
- `nums = [1, 2, 3, 4, 5], k = 2 -> 9`

## Board note

Binary search on the answer.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Binary search on the answer in [max, sum]; greedily count how many pieces a cap needs.

</details>

## Files in this package

- `SplitArrayLargestSum.java`: the LeetCode method/class signature, write your solution here.
- `SplitArrayLargestSumTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
