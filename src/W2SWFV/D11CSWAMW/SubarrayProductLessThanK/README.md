# 713. Subarray Product Less Than K

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/subarray-product-less-than-k/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-40

**Where it fits:** Week 2 - Sliding Window (Fixed & Variable) → Day 11 - Counting subarrays with a monotonic window (SCRUM-40)

## Problem statement

Given an array of positive integers and an integer k, return the number of contiguous subarrays whose product of all elements is strictly less than k.

## Examples

- `nums = [10, 5, 2, 6], k = 100 -> 8`
- `nums = [1, 2, 3], k = 0 -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sliding window: shrink while product >= k; each right end adds (right - left + 1) subarrays.

</details>

## Files in this package

- `SubarrayProductLessThanK.java`: the LeetCode method/class signature, write your solution here.
- `SubarrayProductLessThanKTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
