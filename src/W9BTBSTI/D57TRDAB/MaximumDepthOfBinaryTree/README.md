# 104. Maximum Depth of Binary Tree

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/maximum-depth-of-binary-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-86

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Day 57 - Tree recursion: depth and balance (SCRUM-86)

## Problem statement

Given the root of a binary tree, return its maximum depth: the number of nodes on the longest path from the root down to a leaf.

## Examples

- `root = [3, 9, 20, null, null, 15, 7] -> 3`
- `root = [] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- depth = 1 + max(depth(left), depth(right)).

</details>

## Files in this package

- `MaximumDepthOfBinaryTree.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MaximumDepthOfBinaryTreeTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
