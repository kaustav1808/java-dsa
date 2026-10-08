# 34. Find First and Last Position of Element in Sorted Array

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-72

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Day 43 - Classic binary search and boundaries (SCRUM-72)

## Problem statement

Given an array `nums` sorted in non-decreasing order and a `target`, return the first and last index at which `target` appears, or [-1, -1] if it does not appear. The algorithm must be O(log n).

## Examples

- `nums = [2, 4, 4, 4, 7], target = 4 -> [1, 3]`
- `nums = [2, 4, 7], target = 5 -> [-1, -1]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Two binary searches: lower bound and upper bound.

</details>

## Files in this package

- `FindFirstAndLastPositionOfElementInSortedArray.java`: the LeetCode method/class signature, write your solution here.
- `FindFirstAndLastPositionOfElementInSortedArrayTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
