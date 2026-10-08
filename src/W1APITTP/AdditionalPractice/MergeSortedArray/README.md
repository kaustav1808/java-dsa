# 88. Merge Sorted Array

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/merge-sorted-array/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-10

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Additional practice (SCRUM-10)

## Problem statement

You have two sorted arrays: `nums1` of length m + n, whose first m slots hold real values and last n slots are zeros (free space), and `nums2` of length n. Merge nums2 into nums1 in place so nums1 becomes one sorted array.

## Examples

- `nums1 = [1, 4, 7, 0, 0], m = 3, nums2 = [2, 5], n = 2 -> nums1 = [1, 2, 4, 5, 7]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Fill from the back with three pointers so nothing is overwritten.

</details>

## Files in this package

- `MergeSortedArray.java`: the LeetCode method/class signature, write your solution here.
- `MergeSortedArrayTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
