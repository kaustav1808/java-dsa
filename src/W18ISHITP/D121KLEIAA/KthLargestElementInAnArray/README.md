# 215. Kth Largest Element in an Array

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/kth-largest-element-in-an-array/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-150

**Where it fits:** Week 18 - Interview Simulation: Heaps, Intervals & Tree Paths → Day 121 - Kth Largest Element in an Array (SCRUM-150)

## Problem statement

Given an integer array and an integer k, return the k-th largest element in sorted order (not the k-th distinct). Try to do better than fully sorting.

## Examples

- `nums = [3, 2, 1, 5, 6, 4], k = 2 -> 5`
- `nums = [3, 2, 3, 1, 2, 4, 5, 5, 6], k = 4 -> 4`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Min-heap of size k (O(n log k)) or Quickselect (average O(n)).

</details>

## Files in this package

- `KthLargestElementInAnArray.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `KthLargestElementInAnArrayTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
