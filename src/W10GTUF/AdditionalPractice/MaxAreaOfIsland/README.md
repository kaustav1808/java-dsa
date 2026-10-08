# 695. Max Area of Island

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/max-area-of-island/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-19

**Where it fits:** Week 10 - Graph Traversal & Union-Find → Additional practice (SCRUM-19)

## Problem statement

Given a binary grid where 1 is land and 0 is water, an island is a group of land cells connected horizontally or vertically. Return the area (number of cells) of the largest island, or 0 if there is none.

## Examples

- `grid = [[1,1,0],[0,1,0],[0,0,1]] -> 3`
- `grid = [[0,0]] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Flood-fill DFS/BFS from each unvisited land cell, counting cells.

</details>

## Files in this package

- `MaxAreaOfIsland.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MaxAreaOfIslandTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
