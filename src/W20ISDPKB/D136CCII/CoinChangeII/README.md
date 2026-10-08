# 518. Coin Change II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/coin-change-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-165

**Where it fits:** Week 20 - Interview Simulation: DP, Knapsack & Bitmask → Day 136 - Coin Change II (SCRUM-165)

## Problem statement

Given coin denominations (unlimited supply of each) and an amount, return the number of different combinations of coins that make up that amount. Order does not matter (1+2 is the same as 2+1). Return 0 if impossible.

## Examples

- `amount = 5, coins = [1, 2, 5] -> 4`
- `amount = 3, coins = [2] -> 0`
- `amount = 10, coins = [10] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[a] += dp[a - coin]; loop coins outside, amounts inside (that counts combinations, not orders).

</details>

## Files in this package

- `CoinChangeII.java`: the LeetCode method/class signature, write your solution here.
- `CoinChangeIITest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
