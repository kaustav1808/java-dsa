# 543. Diameter of Binary Tree

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/diameter-of-binary-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-103

**Where it fits:** Week 11 - Topological Sort & Dependency Graphs → Day 74 - Tree path DFS: diameter and max path sum (SCRUM-103)

## Problem statement

Given the root of a binary tree, return its diameter: the number of edges on the longest path between any two nodes. The path may or may not pass through the root.

## Examples

- `root = [1, 2, 3, 4, 5] -> 3  (4 -> 2 -> 1 -> 3)`
- `root = [1, 2] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Post-order height; at each node update best = max(best, leftHeight + rightHeight).

</details>

## Files in this package

- `DiameterOfBinaryTree.java`: the LeetCode method/class signature, write your solution here.
- `DiameterOfBinaryTreeTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
