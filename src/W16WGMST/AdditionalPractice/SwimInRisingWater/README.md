# 778. Swim in Rising Water

**Difficulty:** Hard · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/swim-in-rising-water/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-25

**Where it fits:** Week 16 - Weighted Graphs & Minimum Spanning Trees → Additional practice (SCRUM-25)

## Problem statement

In an n x n grid, grid[r][c] is the elevation of each cell. At time t the water level is t, and you can swim between adjacent cells (4 directions) only if both elevations are at most t; swimming itself takes no time. Return the least time t at which you can get from the top-left to the bottom-right cell.

## Examples

- `grid = [[0,2],[1,3]] -> 3`
- `grid = [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]] -> 16`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Minimise the maximum cell on a path: Dijkstra with a min-heap on max-so-far, or binary search + BFS, or Union-Find by elevation.

</details>

## Files in this package

- `SwimInRisingWater.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `SwimInRisingWaterTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
