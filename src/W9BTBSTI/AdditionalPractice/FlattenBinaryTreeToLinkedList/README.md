# 114. Flatten Binary Tree to Linked List

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-18

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Additional practice (SCRUM-18)

## Problem statement

Given the root of a binary tree, flatten it in place into a 'linked list' that uses right pointers only (all left pointers become null), with nodes in the same order as a pre-order traversal.

## Examples

- `root = [1, 2, 5, 3, 4, null, 6]  =>  1->2->3->4->5->6 (along right pointers)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- For each node, splice its left subtree between it and its right subtree (Morris-style, O(1) space).

</details>

## Files in this package

- `FlattenBinaryTreeToLinkedList.java`: the LeetCode method/class signature, write your solution here.
- `FlattenBinaryTreeToLinkedListTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
