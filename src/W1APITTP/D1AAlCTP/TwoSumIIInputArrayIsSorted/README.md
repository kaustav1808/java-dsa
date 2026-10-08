# 167. Two Sum II - Input Array Is Sorted

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-30

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Day 1 - Arrays vs ArrayList + converging two pointers (SCRUM-30)

## Problem statement

Given a 1-indexed array of integers sorted in non-decreasing order, find two numbers that add up to `target` and return their indices [index1, index2] with index1 < index2. Exactly one solution exists, the same element cannot be used twice, and you must use only constant extra space.

## Examples

- `numbers = [2, 7, 11, 15], target = 9 -> [1, 2]`
- `numbers = [-1, 0], target = -1 -> [1, 2]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Converging two pointers: if the sum is too small move left up, if too big move right down.

</details>

## Files in this package

- `TwoSumIIInputArrayIsSorted.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `TwoSumIIInputArrayIsSortedTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
