# 399. Evaluate Division

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/evaluate-division/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-157

**Where it fits:** Week 19 - Interview Simulation: Advanced Graphs → Day 128 - Evaluate Division (SCRUM-157)

## Problem statement

You are given equations like A / B = value, and queries C / D. Using the equations, answer each query with its value, or -1.0 if it cannot be determined (for example a variable never appeared).

## Examples

- `equations = [["a","b"],["b","c"]], values = [2.0, 3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]] -> [6.0, 0.5, -1.0, 1.0, -1.0]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Weighted graph with edges a -> b (value) and b -> a (1 / value); DFS/BFS multiplying weights, or weighted Union-Find.

</details>

## Files in this package

- `EvaluateDivision.java`: the LeetCode method/class signature, write your solution here.
- `EvaluateDivisionTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
