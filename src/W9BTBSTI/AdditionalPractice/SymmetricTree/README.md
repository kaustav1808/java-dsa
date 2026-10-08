# 101. Symmetric Tree

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/symmetric-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-18

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Additional practice (SCRUM-18)

## Problem statement

Given the root of a binary tree, return true if the tree is a mirror image of itself around its centre.

## Examples

- `root = [1, 2, 2, 3, 4, 4, 3] -> true`
- `root = [1, 2, 2, null, 3, null, 3] -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Compare left.left with right.right and left.right with right.left.

</details>

## Files in this package

- `SymmetricTree.java`: the LeetCode method/class signature, write your solution here.
- `SymmetricTreeTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
