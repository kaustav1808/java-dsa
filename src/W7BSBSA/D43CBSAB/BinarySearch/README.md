# 704. Binary Search

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/binary-search/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-72

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Day 43 - Classic binary search and boundaries (SCRUM-72)

## Problem statement

Given an array of integers sorted in ascending order and a target, return the index of target, or -1 if it is not present. The algorithm must run in O(log n).

## Examples

- `nums = [-1, 0, 3, 5, 9, 12], target = 9 -> 4`
- `same nums, target = 2 -> -1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Classic binary search; use lo + (hi - lo) / 2 and be consistent about inclusive/exclusive bounds.

</details>

## Files in this package

- `BinarySearch.java`: the LeetCode method/class signature, write your solution here.
- `BinarySearchTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
