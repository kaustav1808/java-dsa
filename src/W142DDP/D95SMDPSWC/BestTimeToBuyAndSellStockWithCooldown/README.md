# 309. Best Time to Buy and Sell Stock with Cooldown

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-124

**Where it fits:** Week 14 - 2D Dynamic Programming → Day 95 - State-machine DP: stock with cooldown (SCRUM-124)

## Problem statement

Given daily stock prices, you may complete any number of transactions (buy one share, then sell it), holding at most one share at a time. After you sell, you must rest (cannot buy) on the next day. Return the maximum profit.

## Examples

- `prices = [1, 2, 3, 0, 2] -> 3  (buy, sell, cooldown, buy, sell)`
- `prices = [1] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- State machine DP with three states: holding, sold today, resting.

</details>

## Files in this package

- `BestTimeToBuyAndSellStockWithCooldown.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `BestTimeToBuyAndSellStockWithCooldownTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
