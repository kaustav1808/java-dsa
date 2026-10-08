# 53. Maximum Subarray

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/maximum-subarray/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-129

**Where it fits:** Week 15 - Greedy & Kadane-Style Subarray Patterns → Day 100 - Kadane's algorithm (SCRUM-129)

## Problem statement

Given an integer array `nums`, find the contiguous non-empty subarray with the largest sum and return that sum.

## Examples

- `nums = [-3, 4, -1, 2, -5, 3] -> 5  ([4, -1, 2])`
- `nums = [-2, -1] -> -1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Kadane's algorithm: best ending here = max(x, bestEndingHere + x).

</details>

## Files in this package

- `MaximumSubarray.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MaximumSubarrayTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
