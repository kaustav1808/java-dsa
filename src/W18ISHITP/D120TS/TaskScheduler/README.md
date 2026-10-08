# 621. Task Scheduler

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/task-scheduler/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-149

**Where it fits:** Week 18 - Interview Simulation: Heaps, Intervals & Tree Paths → Day 120 - Task Scheduler (SCRUM-149)

## Problem statement

Given a list of CPU tasks (letters A-Z) and a cooling interval n, the CPU completes one task or idles in each time unit. Two identical tasks must be at least n units apart. Return the minimum number of time units needed to finish all tasks.

## Examples

- `tasks = [A, A, A, B, B, B], n = 2 -> 8  (A B idle A B idle A B)`
- `tasks = [A, C, A, B, D, B], n = 1 -> 6`
- `tasks = [A, A, A, B, B, B], n = 0 -> 6`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Formula: max(tasks.length, (maxFreq - 1) * (n + 1) + countOfTasksWithMaxFreq); or simulate with a max-heap and a cooldown queue.

</details>

## Files in this package

- `TaskScheduler.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `TaskSchedulerTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
