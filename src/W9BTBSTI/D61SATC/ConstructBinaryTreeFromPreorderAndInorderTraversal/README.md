# 105. Construct Binary Tree from Preorder and Inorder Traversal

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-90

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Day 61 - Serialization and tree construction (SCRUM-90)

## Problem statement

Given the preorder and inorder traversal arrays of a binary tree whose values are all distinct, rebuild the tree and return its root.

## Examples

- `preorder = [3, 9, 20, 15, 7], inorder = [9, 3, 15, 20, 7] -> [3, 9, 20, null, null, 15, 7]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- The first preorder value is the root; its position in inorder splits left and right subtrees (use a value -> index map).

</details>

## Files in this package

- `ConstructBinaryTreeFromPreorderAndInorderTraversal.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ConstructBinaryTreeFromPreorderAndInorderTraversalTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
