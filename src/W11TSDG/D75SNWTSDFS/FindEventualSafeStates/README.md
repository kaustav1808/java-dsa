# 802. Find Eventual Safe States

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-eventual-safe-states/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-104

**Where it fits:** Week 11 - Topological Sort & Dependency Graphs → Day 75 - Safe nodes with three-state DFS (SCRUM-104)

## Problem statement

A directed graph is given as an adjacency list. A terminal node has no outgoing edges. A node is safe if every path starting from it leads to a terminal node (never into a cycle). Return all safe nodes in ascending order.

## Examples

- `graph = [[1,2],[2,3],[5],[0],[5],[],[]] -> [2, 4, 5, 6]`
- `graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]] -> [4]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- DFS with three states (unvisited, visiting, safe); or Kahn's algorithm on the reversed graph starting from terminal nodes.

</details>

## Files in this package

- `FindEventualSafeStates.java`: the LeetCode method/class signature, write your solution here.
- `FindEventualSafeStatesTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
