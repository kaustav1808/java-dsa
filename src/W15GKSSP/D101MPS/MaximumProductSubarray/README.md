# 152. Maximum Product Subarray

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/maximum-product-subarray/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-130

**Where it fits:** Week 15 - Greedy & Kadane-Style Subarray Patterns → Day 101 - Maximum product subarray (SCRUM-130)

## Problem statement

Given an integer array, find the contiguous non-empty subarray with the largest product and return that product.

## Examples

- `nums = [2, 3, -2, 4] -> 6`
- `nums = [-2, 0, -1] -> 0`
- `nums = [-2, 3, -4] -> 24`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Track both the maximum and minimum product ending at each position; a negative number swaps them.

</details>

## Files in this package

- `MaximumProductSubarray.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MaximumProductSubarrayTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
