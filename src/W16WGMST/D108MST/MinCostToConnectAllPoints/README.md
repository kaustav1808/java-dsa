# 1584. Min Cost to Connect All Points

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/min-cost-to-connect-all-points/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-137

**Where it fits:** Week 16 - Weighted Graphs & Minimum Spanning Trees → Day 108 - Minimum spanning tree (SCRUM-137)

## Problem statement

Given points on a 2D plane, connecting two points costs their Manhattan distance |x1 - x2| + |y1 - y2|. Return the minimum total cost to connect all points so that there is exactly one simple path between any two points (a minimum spanning tree).

## Examples

- `points = [[0,0],[2,2],[3,10],[5,2],[7,0]] -> 20`
- `points = [[3,12],[-2,5],[-4,1]] -> 18`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Prim's algorithm on the complete graph (O(n^2) without a heap works well), or Kruskal with Union-Find.

</details>

## Files in this package

- `MinCostToConnectAllPoints.java`: the LeetCode method/class signature, write your solution here.
- `MinCostToConnectAllPointsTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
