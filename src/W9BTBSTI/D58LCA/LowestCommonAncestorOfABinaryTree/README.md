# 236. Lowest Common Ancestor of a Binary Tree

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-87

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Day 58 - Lowest Common Ancestor (SCRUM-87)

## Problem statement

Given a binary tree (not necessarily a BST) and two of its nodes p and q, return their lowest common ancestor: the deepest node with both p and q in its subtree (a node is a descendant of itself).

## Examples

- `root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1 -> 3`
- `same tree, p = 5, q = 4 -> 5`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Post-order: if p and q are found in different subtrees, the current node is the LCA; otherwise pass up whichever side found something.

</details>

## Files in this package

- `LowestCommonAncestorOfABinaryTree.java`: the LeetCode method/class signature, write your solution here.
- `LowestCommonAncestorOfABinaryTreeTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
