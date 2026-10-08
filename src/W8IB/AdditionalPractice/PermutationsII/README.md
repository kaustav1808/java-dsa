# 47. Permutations II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/permutations-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-17

**Where it fits:** Week 8 - Intervals & Backtracking → Additional practice (SCRUM-17)

## Problem statement

Given an array that may contain duplicate values, return all distinct permutations, in any order.

## Examples

- `nums = [1, 1, 2] -> [[1,1,2], [1,2,1], [2,1,1]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sort, then skip nums[i] if it equals nums[i-1] and nums[i-1] has not been used at this level.

</details>

## Files in this package

- `PermutationsII.java`: the LeetCode method/class signature, write your solution here.
- `PermutationsIITest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
