# 435. Non-overlapping Intervals

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/non-overlapping-intervals/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-152

**Where it fits:** Week 18 - Interview Simulation: Heaps, Intervals & Tree Paths → Day 123 - Non-overlapping Intervals (SCRUM-152)

## Problem statement

Given a list of intervals, return the minimum number of intervals to remove so that the rest do not overlap. Intervals that only touch at an endpoint (like [1,2] and [2,3]) do not overlap.

## Examples

- `[[1,2],[2,3],[3,4],[1,3]] -> 1`
- `[[1,2],[1,2],[1,2]] -> 2`
- `[[1,2],[2,3]] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Greedy: sort by end time and keep each interval that starts at or after the last kept end.

</details>

## Files in this package

- `NonOverlappingIntervals.java`: the LeetCode method/class signature, write your solution here.
- `NonOverlappingIntervalsTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
