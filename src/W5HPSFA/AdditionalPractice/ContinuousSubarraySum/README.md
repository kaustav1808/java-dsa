# 523. Continuous Subarray Sum

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/continuous-subarray-sum/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-14

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Additional practice (SCRUM-14)

## Problem statement

Given an integer array and an integer k, return true if there is a contiguous subarray of length at least two whose sum is a multiple of k (0 counts as a multiple of k).

## Examples

- `nums = [23, 2, 4, 6, 7], k = 6 -> true  ([2, 4])`
- `nums = [23, 2, 6, 4, 7], k = 13 -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Prefix sum mod k: if the same remainder appears at indices at least 2 apart, return true (seed remainder 0 at index -1).

</details>

## Files in this package

- `ContinuousSubarraySum.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ContinuousSubarraySumTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
