# 560. Subarray Sum Equals K

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/subarray-sum-equals-k/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-60

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Day 31 - Prefix sums with a HashMap (SCRUM-60)

## Problem statement

Given an integer array (values may be negative) and an integer k, return the total number of contiguous subarrays whose sum equals k.

## Examples

- `nums = [1, 1, 1], k = 2 -> 2`
- `nums = [1, 2, 3], k = 3 -> 2`
- `nums = [1, -1, 0], k = 0 -> 3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Prefix sum + HashMap of how many times each prefix sum has occurred (seed 0 -> 1).

</details>

## Files in this package

- `SubarraySumEqualsK.java`: the LeetCode method/class signature, write your solution here.
- `SubarraySumEqualsKTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
