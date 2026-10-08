# 918. Maximum Sum Circular Subarray

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/maximum-sum-circular-subarray/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-131

**Where it fits:** Week 15 - Greedy & Kadane-Style Subarray Patterns → Day 102 - Circular subarray (SCRUM-131)

## Problem statement

Given a circular integer array (the end wraps around to the start), return the maximum possible sum of a non-empty subarray. Each element may be included at most once in the subarray.

## Examples

- `nums = [1, -2, 3, -2] -> 3`
- `nums = [5, -3, 5] -> 10  (wrapping 5 + 5)`
- `nums = [-3, -2, -3] -> -2`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- max(normal Kadane max, total - Kadane min); if every number is negative, return the normal Kadane max.

</details>

## Files in this package

- `MaximumSumCircularSubarray.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MaximumSumCircularSubarrayTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
