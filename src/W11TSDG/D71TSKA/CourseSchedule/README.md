# 207. Course Schedule

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/course-schedule/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-100

**Where it fits:** Week 11 - Topological Sort & Dependency Graphs → Day 71 - Topological sort: Kahn's algorithm (SCRUM-100)

## Problem statement

There are `numCourses` courses labelled 0..n-1 and a list of prerequisite pairs [a, b] meaning b must be taken before a. Return true if it is possible to finish all courses (that is, the prerequisite graph has no cycle).

## Examples

- `numCourses = 2, prerequisites = [[1, 0]] -> true`
- `numCourses = 2, prerequisites = [[1, 0], [0, 1]] -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Kahn's algorithm (BFS on in-degree 0) or DFS cycle detection with three colours.

</details>

## Files in this package

- `CourseSchedule.java`: the LeetCode method/class signature, write your solution here.
- `CourseScheduleTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
