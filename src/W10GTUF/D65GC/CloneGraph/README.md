# 133. Clone Graph

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/clone-graph/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-94

**Where it fits:** Week 10 - Graph Traversal & Union-Find → Day 65 - Graph cloning (SCRUM-94)

## Problem statement

Given a reference to one node of a connected undirected graph, return a deep copy (clone) of the whole graph. Each node has an integer value and a list of neighbours.

## Examples

- `adjacency = [[2,4],[1,3],[2,4],[1,3]] (4-cycle) -> a new graph with the same structure and values`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- DFS/BFS with a HashMap original -> clone so each node is copied once.

</details>

## Files in this package

- `CloneGraph.java`: the LeetCode method/class signature, write your solution here.
- `CloneGraphTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.
- `Node.java`: LeetCode's Node class (already defined on LeetCode, do not paste it).

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
