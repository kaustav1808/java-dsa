# 54. Spiral Matrix

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/spiral-matrix/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-52

**Where it fits:** Week 4 - Matrix Manipulation & Grid State Tracking → Day 23 - Spiral traversal with shrinking bounds (SCRUM-52)

## Problem statement

Given an m x n matrix, return all of its elements in clockwise spiral order, starting at the top-left corner.

## Examples

- `[[1,2,3],[4,5,6],[7,8,9]] -> [1,2,3,6,9,8,7,4,5]`
- `[[1,2],[3,4],[5,6]] -> [1,2,4,6,5,3]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Keep top/bottom/left/right bounds and shrink them after each side is walked.

</details>

## Files in this package

- `SpiralMatrix.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `SpiralMatrixTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
