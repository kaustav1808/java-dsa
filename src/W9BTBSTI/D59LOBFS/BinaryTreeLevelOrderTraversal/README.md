# 102. Binary Tree Level Order Traversal

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/binary-tree-level-order-traversal/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-88

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Day 59 - Level-order BFS (SCRUM-88)

## Problem statement

Given the root of a binary tree, return the node values level by level, from left to right within each level (a list of lists).

## Examples

- `root = [3, 9, 20, null, null, 15, 7] -> [[3], [9, 20], [15, 7]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- BFS with a queue, processing exactly queue.size() nodes per level.

</details>

## Files in this package

- `BinaryTreeLevelOrderTraversal.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `BinaryTreeLevelOrderTraversalTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
