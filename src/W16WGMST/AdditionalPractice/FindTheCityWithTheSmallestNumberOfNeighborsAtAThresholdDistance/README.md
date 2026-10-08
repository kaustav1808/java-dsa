# 1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-25

**Where it fits:** Week 16 - Weighted Graphs & Minimum Spanning Trees → Additional practice (SCRUM-25)

## Problem statement

There are n cities with weighted undirected edges. For each city count how many other cities are reachable with a shortest-path distance of at most distanceThreshold. Return the city with the smallest count; if tied, return the one with the greatest label.

## Examples

- `n = 4, edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold = 4 -> 3`
- `n = 5, edges = [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], distanceThreshold = 2 -> 0`

## Board note

Floyd-Warshall.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Floyd-Warshall for all-pairs shortest paths (n is small), then count per city.

</details>

## Files in this package

- `FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance.java`: the LeetCode method/class signature, write your solution here.
- `FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistanceTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
