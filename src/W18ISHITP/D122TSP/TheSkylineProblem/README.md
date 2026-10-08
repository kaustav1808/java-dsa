# 218. The Skyline Problem

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/the-skyline-problem/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-151

**Where it fits:** Week 18 - Interview Simulation: Heaps, Intervals & Tree Paths → Day 122 - The Skyline Problem (SCRUM-151)

## Problem statement

Buildings are given as [left, right, height] rectangles standing on flat ground. Return the skyline: the outer contour formed by all buildings when seen from a distance, as a list of 'key points' [x, height] where the height changes, sorted by x. The last key point always has height 0, and there must be no consecutive key points with the same height.

## Examples

- `buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]] -> [[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sweep line over start/end events with a max-heap (or TreeMap) of active heights; emit a point when the max changes.

</details>

## Files in this package

- `TheSkylineProblem.java`: the LeetCode method/class signature, write your solution here.
- `TheSkylineProblemTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
