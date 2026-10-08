# 494. Target Sum

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/target-sum/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-23

**Where it fits:** Week 14 - 2D Dynamic Programming → Additional practice (SCRUM-23)

## Problem statement

Given an integer array and a target, place either '+' or '-' in front of every number and evaluate the expression. Return how many different sign assignments make the expression equal target.

## Examples

- `nums = [1, 1, 1, 1, 1], target = 3 -> 5`
- `nums = [1], target = 1 -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Subset-sum reformulation: count subsets with sum (total + target) / 2; or DP over (index, running sum).

</details>

## Files in this package

- `TargetSum.java`: the LeetCode method/class signature, write your solution here.
- `TargetSumTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
