# 162. Find Peak Element

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-peak-element/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-16

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Additional practice (SCRUM-16)

## Problem statement

A peak element is strictly greater than its neighbours; treat positions outside the array as minus infinity. Given an array where adjacent values are never equal, return the index of any peak in O(log n) time.

## Examples

- `nums = [1, 2, 3, 1] -> 2`
- `nums = [1, 2, 1, 3, 5, 6, 4] -> 1 or 5`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Binary search: if nums[mid] < nums[mid + 1], a peak exists to the right; otherwise at mid or to the left.

</details>

## Files in this package

- `FindPeakElement.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `FindPeakElementTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
