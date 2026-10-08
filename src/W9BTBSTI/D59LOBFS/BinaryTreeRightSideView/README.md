# 199. Binary Tree Right Side View

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/binary-tree-right-side-view/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-88

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Day 59 - Level-order BFS (SCRUM-88)

## Problem statement

Given the root of a binary tree, imagine standing on its right side. Return the values of the nodes you can see, from top to bottom (the rightmost node of each level).

## Examples

- `root = [1, 2, 3, null, 5, null, 4] -> [1, 3, 4]`
- `root = [1, 2] -> [1, 2]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- BFS keeping the last node of each level, or DFS visiting right first and recording the first node at each depth.

</details>

## Files in this package

- `BinaryTreeRightSideView.java`: the LeetCode method/class signature, write your solution here.
- `BinaryTreeRightSideViewTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
