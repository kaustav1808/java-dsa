# 121. Best Time to Buy and Sell Stock

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-10

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Additional practice (SCRUM-10)

## Problem statement

You are given an array `prices` where prices[i] is a stock's price on day i. Choose one day to buy and a later day to sell to maximise profit. Return the maximum profit, or 0 if no profit is possible.

## Examples

- `prices = [7, 1, 5, 3, 6, 4] -> 5  (buy at 1, sell at 6)`
- `prices = [5, 4, 3] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Track the minimum price so far; profit = price - minSoFar.

</details>

## Files in this package

- `BestTimeToBuyAndSellStock.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `BestTimeToBuyAndSellStockTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
