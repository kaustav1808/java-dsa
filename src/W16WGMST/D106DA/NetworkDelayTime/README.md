# 743. Network Delay Time

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/network-delay-time/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-135

**Where it fits:** Week 16 - Weighted Graphs & Minimum Spanning Trees → Day 106 - Dijkstra's algorithm (SCRUM-135)

## Problem statement

A network has n nodes labelled 1..n and directed travel times times[i] = (u, v, w). A signal is sent from node k. Return the time it takes for all nodes to receive it, or -1 if some node can never receive it.

## Examples

- `times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2 -> 2`
- `times = [[1,2,1]], n = 2, k = 2 -> -1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Dijkstra from k; the answer is the largest shortest distance.

</details>

## Files in this package

- `NetworkDelayTime.java`: the LeetCode method/class signature, write your solution here.
- `NetworkDelayTimeTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
