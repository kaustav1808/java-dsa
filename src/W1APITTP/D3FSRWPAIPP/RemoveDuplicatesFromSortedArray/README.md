# 26. Remove Duplicates from Sorted Array

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-32

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Day 3 - Fast/slow (read/write) pointers and in-place partitioning (SCRUM-32)

## Problem statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in place so each value appears once, keeping the original relative order. Return `k`, the number of unique values; the first `k` slots of `nums` must hold those values (what is left after them does not matter).

## Examples

- `nums = [0, 0, 1, 2, 2, 2, 3] -> k = 4, nums starts with [0, 1, 2, 3]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Read/write (slow/fast) pointers, O(1) extra space.

</details>

## Files in this package

- `RemoveDuplicatesFromSortedArray.java`: the LeetCode method/class signature, write your solution here.
- `RemoveDuplicatesFromSortedArrayTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
