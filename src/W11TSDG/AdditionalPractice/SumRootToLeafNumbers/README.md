# 129. Sum Root to Leaf Numbers

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/sum-root-to-leaf-numbers/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-20

**Where it fits:** Week 11 - Topological Sort & Dependency Graphs → Additional practice (SCRUM-20)

## Problem statement

Every root-to-leaf path in a binary tree of digits 0-9 spells a number (for example 1 -> 2 -> 3 is 123). Return the sum of all those numbers.

## Examples

- `root = [1, 2, 3] -> 25  (12 + 13)`
- `root = [4, 9, 0, 5, 1] -> 1026  (495 + 491 + 40)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- DFS passing current = current * 10 + node.val; add it at leaves.

</details>

## Files in this package

- `SumRootToLeafNumbers.java`: the LeetCode method/class signature, write your solution here.
- `SumRootToLeafNumbersTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
