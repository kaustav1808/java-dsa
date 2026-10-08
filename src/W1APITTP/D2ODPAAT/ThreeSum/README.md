# 15. 3Sum

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/3sum/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-31

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Day 2 - Opposite-direction pointers: area and triplets (SCRUM-31)

## Problem statement

Given an integer array `nums`, return every unique triplet `[a, b, c]` of elements at three different indices such that `a + b + c == 0`. The answer must not contain duplicate triplets; order of triplets does not matter.

## Examples

- `nums = [-2, 0, 1, 1, 2] -> [[-2, 0, 2], [-2, 1, 1]]`
- `nums = [1, 2, 3] -> []`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sort, fix one element, then run converging two pointers; skip equal neighbours to avoid duplicates.

</details>

## Files in this package

- `ThreeSum.java`: the LeetCode method/class signature, write your solution here.
- `ThreeSumTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
