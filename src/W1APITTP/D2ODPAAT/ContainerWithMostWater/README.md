# 11. Container With Most Water

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/container-with-most-water/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-31

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Day 2 - Opposite-direction pointers: area and triplets (SCRUM-31)

## Problem statement

You are given an array `height` where `height[i]` is the height of a vertical line at position `i`. Choose two lines that, together with the x-axis, form a container; the water it holds is (distance between them) x (the shorter line). Return the maximum water any container can hold. The container may not be tilted.

## Examples

- `height = [2, 5, 4, 3, 6] -> 15  (lines at index 1 and 4: width 3 x min(5, 6) = 15)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Converging pointers: always move the pointer at the shorter wall.

</details>

## Files in this package

- `ContainerWithMostWater.java`: the LeetCode method/class signature, write your solution here.
- `ContainerWithMostWaterTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
