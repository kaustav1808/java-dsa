# 417. Pacific Atlantic Water Flow

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/pacific-atlantic-water-flow/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-19

**Where it fits:** Week 10 - Graph Traversal & Union-Find → Additional practice (SCRUM-19)

## Problem statement

An m x n island is bordered by the Pacific Ocean on its top and left edges and the Atlantic Ocean on its bottom and right edges. Rain flows from a cell to a neighbouring cell (up/down/left/right) whose height is less than or equal to it. Return all cells from which water can reach both oceans.

## Examples

- `heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]] -> [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Reverse the flow: BFS/DFS uphill from each ocean's border cells, and intersect the two reachable sets.

</details>

## Files in this package

- `PacificAtlanticWaterFlow.java`: the LeetCode method/class signature, write your solution here.
- `PacificAtlanticWaterFlowTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
