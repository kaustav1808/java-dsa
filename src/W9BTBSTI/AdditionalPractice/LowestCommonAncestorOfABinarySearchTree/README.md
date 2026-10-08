# 235. Lowest Common Ancestor of a Binary Search Tree

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-18

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Additional practice (SCRUM-18)

## Problem statement

Given a binary search tree and two of its nodes p and q, return their lowest common ancestor: the deepest node that has both p and q as descendants (a node counts as a descendant of itself).

## Examples

- `root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8 -> 6`
- `same tree, p = 2, q = 4 -> 2`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Use BST ordering: if both are smaller go left, if both are larger go right, otherwise the current node is the answer.

</details>

## Files in this package

- `LowestCommonAncestorOfABinarySearchTree.java`: the LeetCode method/class signature, write your solution here.
- `LowestCommonAncestorOfABinarySearchTreeTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
