# 122. Best Time to Buy and Sell Stock II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-24

**Where it fits:** Week 15 - Greedy & Kadane-Style Subarray Patterns → Additional practice (SCRUM-24)

## Problem statement

Given daily stock prices, you may complete as many transactions as you like, but can hold at most one share at a time (you must sell before you buy again). You may buy and sell on the same day. Return the maximum total profit.

## Examples

- `prices = [7, 1, 5, 3, 6, 4] -> 7  (buy 1 sell 5, buy 3 sell 6)`
- `prices = [1, 2, 3, 4] -> 3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Greedy: add every positive day-to-day increase.

</details>

## Files in this package

- `BestTimeToBuyAndSellStockII.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `BestTimeToBuyAndSellStockIITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
