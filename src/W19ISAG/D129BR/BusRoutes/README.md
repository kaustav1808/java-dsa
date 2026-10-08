# 815. Bus Routes

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/bus-routes/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-158

**Where it fits:** Week 19 - Interview Simulation: Advanced Graphs → Day 129 - Bus Routes (SCRUM-158)

## Problem statement

routes[i] lists the bus stops that bus i visits in a repeating loop. Starting at stop source (not on any bus yet), return the minimum number of buses you must take to reach stop target, or -1 if impossible.

## Examples

- `routes = [[1,2,7],[3,6,7]], source = 1, target = 6 -> 2`
- `routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12 -> -1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- BFS where each level is one bus: map stop -> buses; mark buses (not just stops) visited.

</details>

## Files in this package

- `BusRoutes.java`: the LeetCode method/class signature, write your solution here.
- `BusRoutesTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
