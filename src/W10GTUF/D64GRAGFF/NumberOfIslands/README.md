# 200. Number of Islands

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/number-of-islands/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-93

**Where it fits:** Week 10 - Graph Traversal & Union-Find → Day 64 - Graph representations and grid flood-fill (SCRUM-93)

## Problem statement

Given a grid of '1' (land) and '0' (water), count the islands. An island is a group of land cells connected horizontally or vertically; the grid is surrounded by water.

## Examples

- `[[1,1,0,0],[1,0,0,1],[0,0,1,1]] -> 2`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- DFS/BFS flood-fill from each unvisited land cell, or Union-Find.

</details>

## Files in this package

- `NumberOfIslands.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `NumberOfIslandsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
