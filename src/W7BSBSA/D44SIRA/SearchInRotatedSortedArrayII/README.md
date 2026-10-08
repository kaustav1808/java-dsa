# 81. Search in Rotated Sorted Array II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-73

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Day 44 - Search in rotated arrays (SCRUM-73)

## Problem statement

Search for `target` in a sorted array that has been rotated at an unknown pivot, where the array may contain duplicates. Return true if target is present, otherwise false.

## Examples

- `nums = [2, 5, 6, 0, 0, 1, 2], target = 0 -> true`
- `same nums, target = 3 -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Like the distinct version, but when nums[lo] == nums[mid] == nums[hi] you can only shrink both ends by one (worst case O(n)).

</details>

## Files in this package

- `SearchInRotatedSortedArrayII.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `SearchInRotatedSortedArrayIITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
