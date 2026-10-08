# 377. Combination Sum IV

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/combination-sum-iv/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-22

**Where it fits:** Week 13 - 1D Dynamic Programming → Additional practice (SCRUM-22)

## Problem statement

Given an array of distinct positive integers and a target, return how many ordered sequences of those numbers (numbers may be reused) add up to the target. Different orders count as different sequences.

## Examples

- `nums = [1, 2, 3], target = 4 -> 7`
- `nums = [9], target = 3 -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[t] = sum of dp[t - num] over nums; loop target outside, nums inside (that counts orders).

</details>

## Files in this package

- `CombinationSumIV.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `CombinationSumIVTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
