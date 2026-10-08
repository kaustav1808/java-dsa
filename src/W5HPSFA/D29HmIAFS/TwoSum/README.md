# 1. Two Sum

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/two-sum/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-58

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Day 29 - HashMap internals and frequency signatures (SCRUM-58)

## Problem statement

Given an integer array `nums` and an integer `target`, return the indices of the two different elements whose values add up to `target`. Exactly one valid pair exists, and the same element may not be used twice. The indices may be returned in any order.

## Examples

- `nums = [4, 9, 1, 6], target = 7 -> [2, 3]  (1 + 6 = 7)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Brute force is O(N^2); a HashMap of value -> index gives O(N).

</details>

## Files in this package

- `TwoSum.java`: the LeetCode method/class signature, write your solution here.
- `TwoSumTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
