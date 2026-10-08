# 230. Kth Smallest Element in a BST

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-89

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Day 60 - BST validation and in-order property (SCRUM-89)

## Problem statement

Given the root of a binary search tree and an integer k, return the k-th smallest value (1-indexed) among all node values.

## Examples

- `root = [3, 1, 4, null, 2], k = 1 -> 1`
- `root = [5, 3, 6, 2, 4, null, null, 1], k = 3 -> 3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- In-order traversal visits values in sorted order; stop at the k-th visit.

</details>

## Files in this package

- `KthSmallestElementInABST.java`: the LeetCode method/class signature, write your solution here.
- `KthSmallestElementInABSTTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
