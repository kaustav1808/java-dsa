# 785. Is Graph Bipartite

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/is-graph-bipartite/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-19

**Where it fits:** Week 10 - Graph Traversal & Union-Find → Additional practice (SCRUM-19)

## Problem statement

An undirected graph is given as an adjacency list graph[i]. Return true if the graph is bipartite: its nodes can be split into two groups so that every edge connects nodes from different groups. The graph may be disconnected.

## Examples

- `graph = [[1,3],[0,2],[1,3],[0,2]] -> true`
- `graph = [[1,2,3],[0,2],[0,1,3],[0,2]] -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Two-colour every component with BFS/DFS; a same-colour edge means not bipartite.

</details>

## Files in this package

- `IsGraphBipartite.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `IsGraphBipartiteTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
