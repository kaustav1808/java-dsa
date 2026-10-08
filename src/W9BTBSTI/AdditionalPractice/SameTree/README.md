# 100. Same Tree

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/same-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-18

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Additional practice (SCRUM-18)

## Problem statement

Given the roots of two binary trees, return true if they are the same: identical shape with identical values at every node.

## Examples

- `p = [1, 2, 3], q = [1, 2, 3] -> true`
- `p = [1, 2], q = [1, null, 2] -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Recursive: both null, or equal values and equal left and right subtrees.

</details>

## Files in this package

- `SameTree.java`: the LeetCode method/class signature, write your solution here.
- `SameTreeTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
