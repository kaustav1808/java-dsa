# 124. Binary Tree Maximum Path Sum

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/binary-tree-maximum-path-sum/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-103

**Where it fits:** Week 11 - Topological Sort & Dependency Graphs → Day 74 - Tree path DFS: diameter and max path sum (SCRUM-103)

## Problem statement

A path in a binary tree is any sequence of nodes connected by edges, where each node appears at most once; it does not have to pass through the root and needs at least one node. Return the maximum sum of node values over all paths.

## Examples

- `root = [1, 2, 3] -> 6  (2 -> 1 -> 3)`
- `root = [-10, 9, 20, null, null, 15, 7] -> 42  (15 -> 20 -> 7)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Post-order: each node returns its best single downward branch (ignore negative branches) and updates a global best using both branches.

</details>

## Files in this package

- `BinaryTreeMaximumPathSum.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `BinaryTreeMaximumPathSumTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
