# 1091. Shortest Path in Binary Matrix

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/shortest-path-in-binary-matrix/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-28

**Where it fits:** Week 19 - Interview Simulation: Advanced Graphs → Additional practice (SCRUM-28)

## Problem statement

In an n x n binary grid, find the length of the shortest clear path from the top-left to the bottom-right cell. A clear path only visits cells with 0 and moves in any of the 8 directions; its length is the number of cells visited. Return -1 if no clear path exists.

## Examples

- `grid = [[0,1],[1,0]] -> 2`
- `grid = [[0,0,0],[1,1,0],[1,1,0]] -> 4`
- `grid = [[1,0,0],[1,1,0],[1,1,0]] -> -1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- BFS with 8 neighbours; check the start and end cells first.

</details>

## Files in this package

- `ShortestPathInBinaryMatrix.java`: the LeetCode method/class signature, write your solution here.
- `ShortestPathInBinaryMatrixTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
