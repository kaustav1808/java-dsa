# 1631. Path With Minimum Effort

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/path-with-minimum-effort/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-160

**Where it fits:** Week 19 - Interview Simulation: Advanced Graphs → Day 131 - Path With Minimum Effort (SCRUM-160)

## Problem statement

You are a hiker on a grid of heights moving up, down, left or right from the top-left to the bottom-right cell. A route's effort is the maximum absolute height difference between two consecutive cells on it. Return the minimum effort possible.

## Examples

- `heights = [[1,2,2],[3,8,2],[5,3,5]] -> 2`
- `heights = [[1,2,3],[3,8,4],[5,3,5]] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Dijkstra where a path's cost is its max edge (not the sum); or binary search the answer with BFS; or Union-Find on sorted edges.

</details>

## Files in this package

- `PathWithMinimumEffort.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `PathWithMinimumEffortTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
