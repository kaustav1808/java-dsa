# 322. Coin Change

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/coin-change/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-117

**Where it fits:** Week 13 - 1D Dynamic Programming → Day 88 - Unbounded knapsack: Coin Change (SCRUM-117)

## Problem statement

Given coin denominations and a target amount, return the fewest coins needed to make exactly that amount, using unlimited coins of each type. Return -1 if the amount cannot be made.

## Examples

- `coins = [1, 2, 5], amount = 11 -> 3  (5 + 5 + 1)`
- `coins = [2], amount = 3 -> -1`
- `coins = [1], amount = 0 -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[a] = 1 + min(dp[a - coin]); unbounded knapsack.

</details>

## Files in this package

- `CoinChange.java`: the LeetCode method/class signature, write your solution here.
- `CoinChangeTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
