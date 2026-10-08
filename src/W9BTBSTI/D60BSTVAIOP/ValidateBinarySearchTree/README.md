# 98. Validate Binary Search Tree

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/validate-binary-search-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-89

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Day 60 - BST validation and in-order property (SCRUM-89)

## Problem statement

Given the root of a binary tree, decide whether it is a valid binary search tree: every node's left subtree contains only keys strictly smaller than the node, its right subtree only keys strictly larger, and both subtrees are themselves valid BSTs.

## Examples

- `root = [2, 1, 3] -> true`
- `root = [5, 1, 4, null, null, 3, 6] -> false  (4 is in 5's right subtree but smaller than 5)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Pass down (min, max) bounds, or check that the in-order traversal is strictly increasing.

</details>

## Files in this package

- `ValidateBinarySearchTree.java`: the LeetCode method/class signature, write your solution here.
- `ValidateBinarySearchTreeTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
