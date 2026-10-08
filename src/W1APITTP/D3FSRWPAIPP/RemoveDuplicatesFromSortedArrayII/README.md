# 80. Remove Duplicates from Sorted Array II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-32

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Day 3 - Fast/slow (read/write) pointers and in-place partitioning (SCRUM-32)

## Problem statement

Given an integer array sorted in non-decreasing order, remove duplicates in place so that each value appears at most twice, keeping the relative order. Return `k`, the length of the kept prefix.

## Examples

- `nums = [1, 1, 1, 2, 2, 3] -> k = 5, nums starts with [1, 1, 2, 2, 3]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Write nums[i] only if it differs from nums[write - 2].

</details>

## Files in this package

- `RemoveDuplicatesFromSortedArrayII.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `RemoveDuplicatesFromSortedArrayIITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
