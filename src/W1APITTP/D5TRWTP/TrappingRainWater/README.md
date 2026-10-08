# 42. Trapping Rain Water

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/trapping-rain-water/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-34

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Day 5 - Trapping Rain Water (two-pointer) (SCRUM-34)

## Problem statement

You are given `n` non-negative integers representing the heights of bars of width 1 on an elevation map. Compute how many units of rain water are trapped between the bars after it rains.

## Examples

- `height = [3, 0, 2, 0, 4] -> 7`
- `height = [1, 2, 3] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Water above bar i = min(maxLeft, maxRight) - height[i]; two pointers compute this in O(1) space.

</details>

## Files in this package

- `TrappingRainWater.java`: the LeetCode method/class signature, write your solution here.
- `TrappingRainWaterTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
