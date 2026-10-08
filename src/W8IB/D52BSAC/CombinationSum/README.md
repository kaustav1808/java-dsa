# 39. Combination Sum

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/combination-sum/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-81

**Where it fits:** Week 8 - Intervals & Backtracking → Day 52 - Backtracking: subsets and combinations (SCRUM-81)

## Problem statement

Given an array of distinct positive integers `candidates` and a `target`, return all unique combinations of candidates that add up to `target`. Each candidate may be used any number of times. Two combinations are the same if they use the same numbers with the same counts.

## Examples

- `candidates = [2, 3, 5], target = 8 -> [[2,2,2,2], [2,3,3], [3,5]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Backtracking where the recursive call can reuse the same index; stop when the running sum exceeds target.

</details>

## Files in this package

- `CombinationSum.java`: the LeetCode method/class signature, write your solution here.
- `CombinationSumTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
