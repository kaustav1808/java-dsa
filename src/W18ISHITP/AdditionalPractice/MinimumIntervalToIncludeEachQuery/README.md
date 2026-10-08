# 1851. Minimum Interval to Include Each Query

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/minimum-interval-to-include-each-query/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-27

**Where it fits:** Week 18 - Interview Simulation: Heaps, Intervals & Tree Paths → Additional practice (SCRUM-27)

## Problem statement

You are given intervals [left, right] and queries. For each query value q, return the size (right - left + 1) of the smallest interval that contains q, or -1 if no interval contains it.

## Examples

- `intervals = [[1,4],[2,4],[3,6],[4,4]], queries = [2,3,4,5] -> [3, 3, 1, 4]`
- `intervals = [[2,3],[2,5],[1,8],[20,25]], queries = [2,19,5,22] -> [2, -1, 4, 6]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sort intervals by left and queries by value (offline); push intervals whose left <= q into a min-heap by size, pop those whose right < q.

</details>

## Files in this package

- `MinimumIntervalToIncludeEachQuery.java`: the LeetCode method/class signature, write your solution here.
- `MinimumIntervalToIncludeEachQueryTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
