# 113. Path Sum II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/path-sum-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-20

**Where it fits:** Week 11 - Topological Sort & Dependency Graphs → Additional practice (SCRUM-20)

## Problem statement

Given the root of a binary tree and an integer `targetSum`, return every root-to-leaf path whose node values add up to targetSum, each path as a list of values.

## Examples

- `root = [5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1], targetSum = 22 -> [[5,4,11,2], [5,8,4,5]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- DFS with a running path list; add a copy at leaves, remove the last element when returning.

</details>

## Files in this package

- `PathSumII.java`: the LeetCode method/class signature, write your solution here.
- `PathSumIITest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
