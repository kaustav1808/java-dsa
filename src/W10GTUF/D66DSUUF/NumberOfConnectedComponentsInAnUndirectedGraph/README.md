# 323. Number of Connected Components in an Undirected Graph

**Difficulty:** Medium · **Source:** LeetCode Premium (paid)

## Links

- LeetCode: https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/ (requires LeetCode Premium)
- NeetCode (free): https://neetcode.io/problems/count-connected-components/question
- NeetCode explanation: https://neetcode.io/solutions/number-of-connected-components-in-an-undirected-graph
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-95

**Where it fits:** Week 10 - Graph Traversal & Union-Find → Day 66 - Disjoint Set Union (Union-Find) (SCRUM-95)

## Problem statement

(LeetCode Premium) A graph has n nodes labelled 0..n-1 and a list of undirected edges. Return the number of connected components.

## Examples

- `n = 5, edges = [[0,1],[1,2],[3,4]] -> 2`
- `n = 5, edges = [[0,1],[1,2],[2,3],[3,4]] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Union-Find: start with n components and subtract one for every successful union; or DFS/BFS.

</details>

## Files in this package

- `NumberOfConnectedComponentsInAnUndirectedGraph.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `NumberOfConnectedComponentsInAnUndirectedGraphTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
