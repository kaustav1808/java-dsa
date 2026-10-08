# 210. Course Schedule II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/course-schedule-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-101

**Where it fits:** Week 11 - Topological Sort & Dependency Graphs → Day 72 - Topological order output (SCRUM-101)

## Problem statement

Same setup as Course Schedule: given numCourses and prerequisite pairs [a, b] (take b before a), return any valid order in which to take all courses, or an empty array if it is impossible.

## Examples

- `numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]] -> [0, 1, 2, 3] or [0, 2, 1, 3]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Topological sort; if fewer than numCourses nodes are output, there is a cycle.

</details>

## Files in this package

- `CourseScheduleII.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `CourseScheduleIITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
