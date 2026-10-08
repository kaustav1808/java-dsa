# 226. Invert Binary Tree

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/invert-binary-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-18

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Additional practice (SCRUM-18)

## Problem statement

Given the root of a binary tree, invert it (mirror it: swap every node's left and right children) and return the root.

## Examples

- `root = [4, 2, 7, 1, 3, 6, 9] -> [4, 7, 2, 9, 6, 3, 1]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Recursively swap children, or BFS swapping at each node.

</details>

## Files in this package

- `InvertBinaryTree.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `InvertBinaryTreeTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
