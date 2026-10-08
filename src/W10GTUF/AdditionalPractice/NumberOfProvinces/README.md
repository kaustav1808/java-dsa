# 547. Number of Provinces

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/number-of-provinces/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-19

**Where it fits:** Week 10 - Graph Traversal & Union-Find → Additional practice (SCRUM-19)

## Problem statement

There are n cities. isConnected[i][j] = 1 means cities i and j are directly connected. A province is a group of cities connected directly or indirectly, with no connections to cities outside the group. Return the number of provinces.

## Examples

- `isConnected = [[1,1,0],[1,1,0],[0,0,1]] -> 2`
- `isConnected = [[1,0,0],[0,1,0],[0,0,1]] -> 3`

## Board note

Free alternative to the premium problem on Day 66.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Union-Find over the matrix, or DFS from each unvisited city.

</details>

## Files in this package

- `NumberOfProvinces.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `NumberOfProvincesTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
