# 40. Combination Sum II

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/combination-sum-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-17

**Where it fits:** Week 8 - Intervals & Backtracking → Additional practice (SCRUM-17)

## Problem statement

Given an array `candidates` (which may contain duplicates) and a `target`, return all unique combinations whose sum is `target`, where each element of the array may be used at most once. The answer must not contain duplicate combinations.

## Examples

- `candidates = [1, 1, 2, 5, 6], target = 8 -> [[1,1,6], [1,2,5], [2,6]]`

## Board note

Skip duplicates at the same level.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sort, and at each recursion level skip a value equal to the previous one.

</details>

## Files in this package

- `CombinationSumII.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `CombinationSumIITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
