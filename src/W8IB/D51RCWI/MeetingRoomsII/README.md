# 253. Meeting Rooms II

**Difficulty:** Medium · **Source:** LeetCode Premium (paid)

## Links

- LeetCode: https://leetcode.com/problems/meeting-rooms-ii/ (requires LeetCode Premium)
- NeetCode (free): https://neetcode.io/problems/meeting-schedule-ii/question
- NeetCode explanation: https://neetcode.io/solutions/meeting-rooms-ii
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-80

**Where it fits:** Week 8 - Intervals & Backtracking → Day 51 - Resource counting with intervals (SCRUM-80)

## Problem statement

(LeetCode Premium) Given an array of meeting time intervals [start, end], return the minimum number of conference rooms needed so that no two overlapping meetings share a room. A meeting ending at time t does not overlap one starting at t.

## Examples

- `intervals = [[0,30],[5,10],[15,20]] -> 2`
- `intervals = [[7,10],[2,4]] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sort by start and use a min-heap of end times, or sweep sorted start and end arrays with two pointers.

</details>

## Files in this package

- `MeetingRoomsII.java`: the LeetCode method/class signature, write your solution here.
- `MeetingRoomsIITest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
