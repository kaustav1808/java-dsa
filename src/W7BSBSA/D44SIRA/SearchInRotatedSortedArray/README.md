# 33. Search in Rotated Sorted Array

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/search-in-rotated-sorted-array/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-73

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Day 44 - Search in rotated arrays (SCRUM-73)

## Problem statement

A sorted array of distinct integers has been rotated at an unknown pivot (for example [0,1,2,4,5,6,7] could become [4,5,6,7,0,1,2]). Given the rotated array `nums` and a `target`, return the index of `target` or -1 if it is absent. The solution must run in O(log n).

## Examples

- `nums = [6, 7, 9, 1, 3, 4], target = 3 -> 4`
- `nums = [6, 7, 9, 1, 3, 4], target = 5 -> -1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- At each step one half is sorted; check whether the target lies in that half.

</details>

## Files in this package

- `SearchInRotatedSortedArray.java`: the LeetCode method/class signature, write your solution here.
- `SearchInRotatedSortedArrayTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
