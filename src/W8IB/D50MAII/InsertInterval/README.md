# 57. Insert Interval

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/insert-interval/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-79

**Where it fits:** Week 8 - Intervals & Backtracking → Day 50 - Merging and inserting intervals (SCRUM-79)

## Problem statement

You are given a list of non-overlapping intervals sorted by start, and one new interval. Insert the new interval so the list stays sorted and non-overlapping, merging wherever necessary, and return the result.

## Examples

- `intervals = [[1,3],[6,9]], newInterval = [2,5] -> [[1,5],[6,9]]`
- `intervals = [[1,2],[5,6]], newInterval = [3,4] -> [[1,2],[3,4],[5,6]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Three phases: copy intervals ending before it, merge overlapping ones, copy the rest.

</details>

## Files in this package

- `InsertInterval.java`: the LeetCode method/class signature, write your solution here.
- `InsertIntervalTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
