# 48. Rotate Image

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/rotate-image/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-51

**Where it fits:** Week 4 - Matrix Manipulation & Grid State Tracking → Day 22 - Matrix rotation in place (SCRUM-51)

## Problem statement

Given an n x n matrix representing an image, rotate it 90 degrees clockwise in place (without allocating another matrix).

## Examples

- `[[1,2],[3,4]] -> [[3,1],[4,2]]`
- `[[1,2,3],[4,5,6],[7,8,9]] -> [[7,4,1],[8,5,2],[9,6,3]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Transpose, then reverse each row.

</details>

## Files in this package

- `RotateImage.java`: the LeetCode method/class signature, write your solution here.
- `RotateImageTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
