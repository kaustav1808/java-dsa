# 847. Shortest Path Visiting All Nodes

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/shortest-path-visiting-all-nodes/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-29

**Where it fits:** Week 20 - Interview Simulation: DP, Knapsack & Bitmask → Additional practice (SCRUM-29)

## Problem statement

An undirected connected graph of n nodes is given as an adjacency list. Return the length (number of edges) of the shortest walk that visits every node. You may start and stop anywhere, and may revisit nodes and reuse edges.

## Examples

- `graph = [[1,2,3],[0],[0],[0]] -> 4  (1 -> 0 -> 2 -> 0 -> 3)`
- `graph = [[1],[0,2,4],[1,3,4],[2],[1,2]] -> 4`

## Board note

BFS with bitmask.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Multi-source BFS over states (node, visitedMask), starting from every node at once; finish when mask is all ones.

</details>

## Files in this package

- `ShortestPathVisitingAllNodes.java`: the LeetCode method/class signature, write your solution here.
- `ShortestPathVisitingAllNodesTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
