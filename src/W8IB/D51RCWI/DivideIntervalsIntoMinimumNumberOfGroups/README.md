# 2406. Divide Intervals Into Minimum Number of Groups

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/
- This is the free equivalent of premium problem 253. Meeting Rooms II on the same day
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-80

**Where it fits:** Week 8 - Intervals & Backtracking → Day 51 - Resource counting with intervals (SCRUM-80)

## Problem statement

Given intervals [left, right] (inclusive), divide them into the minimum number of groups so that no two intervals in the same group intersect. Intervals sharing even one point (like [1,5] and [5,8]) intersect. Return the minimum number of groups.

## Examples

- `intervals = [[5,10],[6,8],[1,5],[2,3],[1,10]] -> 3`
- `intervals = [[1,3],[5,6],[8,10],[11,13]] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Equals the maximum number of intervals overlapping at any point: sort by start with a min-heap of group end times, or a sweep line.

</details>

## Files in this package

- `DivideIntervalsIntoMinimumNumberOfGroups.java`: the LeetCode method/class signature, write your solution here.
- `DivideIntervalsIntoMinimumNumberOfGroupsTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
