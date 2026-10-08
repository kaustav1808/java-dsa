# 310. Minimum Height Trees

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/minimum-height-trees/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-156

**Where it fits:** Week 19 - Interview Simulation: Advanced Graphs → Day 127 - Minimum Height Trees (SCRUM-156)

## Problem statement

A tree of n nodes (labelled 0..n-1) is given as an undirected edge list. Choosing any node as the root gives a rooted tree with some height. Return all root labels that produce the minimum possible height.

## Examples

- `n = 4, edges = [[1,0],[1,2],[1,3]] -> [1]`
- `n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]] -> [3, 4]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Peel leaves layer by layer (topological trimming); the last 1 or 2 nodes are the answer.

</details>

## Files in this package

- `MinimumHeightTrees.java`: the LeetCode method/class signature, write your solution here.
- `MinimumHeightTreesTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
