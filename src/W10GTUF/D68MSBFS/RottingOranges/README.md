# 994. Rotting Oranges

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/rotting-oranges/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-97

**Where it fits:** Week 10 - Graph Traversal & Union-Find → Day 68 - Multi-source BFS (SCRUM-97)

## Problem statement

In a grid, 0 is empty, 1 is a fresh orange and 2 is a rotten orange. Every minute, any fresh orange next to a rotten one (4 directions) becomes rotten. Return the minimum number of minutes until no fresh orange remains, or -1 if that is impossible.

## Examples

- `grid = [[2,1,1],[1,1,0],[0,1,1]] -> 4`
- `grid = [[2,1,1],[0,1,1],[1,0,1]] -> -1`
- `grid = [[0,2]] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Multi-source BFS starting from all rotten oranges at once; count fresh oranges to detect leftovers.

</details>

## Files in this package

- `RottingOranges.java`: the LeetCode method/class signature, write your solution here.
- `RottingOrangesTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
