# 198. House Robber

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/house-robber/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-115

**Where it fits:** Week 13 - 1D Dynamic Programming → Day 86 - Take-or-skip DP (SCRUM-115)

## Problem statement

Houses along a street hold given amounts of money. You cannot rob two adjacent houses (it triggers an alarm). Return the maximum amount you can rob.

## Examples

- `nums = [2, 7, 9, 3, 1] -> 12  (2 + 9 + 1)`
- `nums = [1, 2, 3, 1] -> 4`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[i] = max(dp[i-1], dp[i-2] + nums[i]) with two variables.

</details>

## Files in this package

- `HouseRobber.java`: the LeetCode method/class signature, write your solution here.
- `HouseRobberTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
