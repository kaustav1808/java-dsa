# 1192. Critical Connections in a Network

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/critical-connections-in-a-network/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-28

**Where it fits:** Week 19 - Interview Simulation: Advanced Graphs → Additional practice (SCRUM-28)

## Problem statement

There are n servers connected by undirected connections. A critical connection is one whose removal makes some servers unable to reach others. Return all critical connections in any order.

## Examples

- `n = 4, connections = [[0,1],[1,2],[2,0],[1,3]] -> [[1,3]]`
- `n = 2, connections = [[0,1]] -> [[0,1]]`

## Board note

Tarjan's bridges.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Tarjan's bridge-finding: DFS discovery time and low-link; edge (u, v) is a bridge if low[v] > disc[u].

</details>

## Files in this package

- `CriticalConnectionsInANetwork.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `CriticalConnectionsInANetworkTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
