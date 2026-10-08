# 787. Cheapest Flights Within K Stops

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/cheapest-flights-within-k-stops/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-136

**Where it fits:** Week 16 - Weighted Graphs & Minimum Spanning Trees → Day 107 - Shortest path with at most K stops (SCRUM-136)

## Problem statement

There are n cities and directed flights [from, to, price]. Return the cheapest price from src to dst using at most k stops (k + 1 flights), or -1 if there is no such route.

## Examples

- `n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1 -> 700`
- `n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0 -> 500`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Bellman-Ford limited to k + 1 rounds (copy the distance array each round), or BFS by number of stops.

</details>

## Files in this package

- `CheapestFlightsWithinKStops.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `CheapestFlightsWithinKStopsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
