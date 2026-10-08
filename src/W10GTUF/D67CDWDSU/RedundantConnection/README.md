# 684. Redundant Connection

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/redundant-connection/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-96

**Where it fits:** Week 10 - Graph Traversal & Union-Find → Day 67 - Cycle detection with DSU (SCRUM-96)

## Problem statement

A graph started as a tree with n nodes (labelled 1..n) and then one extra edge was added. Given the edges in order, return an edge that can be removed so the remaining graph is a tree. If several answers exist, return the one that appears last in the input.

## Examples

- `edges = [[1,2],[1,3],[2,3]] -> [2, 3]`
- `edges = [[1,2],[2,3],[3,4],[1,4],[1,5]] -> [1, 4]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Union-Find: the first edge whose endpoints are already in the same set closes the cycle.

</details>

## Files in this package

- `RedundantConnection.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `RedundantConnectionTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
