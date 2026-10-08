# 986. Interval List Intersections

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/interval-list-intersections/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-17

**Where it fits:** Week 8 - Intervals & Backtracking → Additional practice (SCRUM-17)

## Problem statement

Given two lists of closed intervals, each list sorted and pairwise disjoint, return the intersection of the two lists (all ranges covered by both).

## Examples

- `first = [[0,2],[5,10],[13,23],[24,25]], second = [[1,5],[8,12],[15,24],[25,26]] -> [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Two pointers: the overlap is [max(starts), min(ends)] if valid; advance the interval that ends first.

</details>

## Files in this package

- `IntervalListIntersections.java`: the LeetCode method/class signature, write your solution here.
- `IntervalListIntersectionsTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
