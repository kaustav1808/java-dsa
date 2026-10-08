# 332. Reconstruct Itinerary

**Difficulty:** Hard · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/reconstruct-itinerary/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-25

**Where it fits:** Week 16 - Weighted Graphs & Minimum Spanning Trees → Additional practice (SCRUM-25)

## Problem statement

Given a list of airline tickets [from, to], reconstruct the itinerary that uses every ticket exactly once, starting from "JFK". If several itineraries are valid, return the one that is smallest in lexical order when read as a single sequence. At least one valid itinerary exists.

## Examples

- `[["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]] -> ["JFK","MUC","LHR","SFO","SJC"]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Hierholzer's algorithm for an Eulerian path with destinations kept in min-heaps; add airports to the route on the way back and reverse.

</details>

## Files in this package

- `ReconstructItinerary.java`: the LeetCode method/class signature, write your solution here.
- `ReconstructItineraryTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
