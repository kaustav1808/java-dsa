# 1353. Maximum Number of Events That Can Be Attended

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-27

**Where it fits:** Week 18 - Interview Simulation: Heaps, Intervals & Tree Paths → Additional practice (SCRUM-27)

## Problem statement

events[i] = [startDay, endDay]. You can attend an event on any single day d with start <= d <= end, and can attend only one event per day. Return the maximum number of events you can attend.

## Examples

- `events = [[1,2],[2,3],[3,4]] -> 3`
- `events = [[1,2],[2,3],[3,4],[1,2]] -> 4`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sort by start; sweep day by day, push end days of started events into a min-heap, drop expired ones, attend the one ending soonest.

</details>

## Files in this package

- `MaximumNumberOfEventsThatCanBeAttended.java`: the LeetCode method/class signature, write your solution here.
- `MaximumNumberOfEventsThatCanBeAttendedTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
