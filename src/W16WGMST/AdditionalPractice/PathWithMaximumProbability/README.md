# 1514. Path with Maximum Probability

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/path-with-maximum-probability/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-25

**Where it fits:** Week 16 - Weighted Graphs & Minimum Spanning Trees → Additional practice (SCRUM-25)

## Problem statement

An undirected graph has n nodes, and each edge has a probability of successful traversal. Return the maximum probability of a path from start to end (the product of its edge probabilities), or 0 if no path exists.

## Examples

- `n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2 -> 0.25`
- `n = 3, edges = [[0,1]], succProb = [0.5], start = 0, end = 2 -> 0.0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Dijkstra with a max-heap on probability (multiplying instead of adding).

</details>

## Files in this package

- `PathWithMaximumProbability.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `PathWithMaximumProbabilityTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
