# 153. Find Minimum in Rotated Sorted Array

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-74

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Day 45 - Minimum in a rotated array (SCRUM-74)

## Problem statement

A sorted array of unique values was rotated between 1 and n times. Return its minimum element in O(log n) time.

## Examples

- `nums = [4, 5, 6, 7, 0, 1, 2] -> 0`
- `nums = [11, 13, 15, 17] -> 11`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Compare nums[mid] with nums[hi]: if bigger, the minimum is to the right of mid; otherwise it is at mid or to the left.

</details>

## Files in this package

- `FindMinimumInRotatedSortedArray.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `FindMinimumInRotatedSortedArrayTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
