# 498. Diagonal Traverse

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/diagonal-traverse/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-55

**Where it fits:** Week 4 - Matrix Manipulation & Grid State Tracking → Day 26 - Diagonal traversal (SCRUM-55)

## Problem statement

Given an m x n matrix, return all elements in diagonal zig-zag order: start at the top-left, go up-right along the first anti-diagonal, then down-left along the next, alternating.

## Examples

- `[[1,2,3],[4,5,6],[7,8,9]] -> [1, 2, 4, 7, 5, 3, 6, 8, 9]`
- `[[1,2],[3,4]] -> [1, 2, 3, 4]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Cells on the same anti-diagonal share r + c; alternate the traversal direction by the parity of r + c.

</details>

## Files in this package

- `DiagonalTraverse.java`: the LeetCode method/class signature, write your solution here.
- `DiagonalTraverseTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
