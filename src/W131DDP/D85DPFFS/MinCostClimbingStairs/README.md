# 746. Min Cost Climbing Stairs

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/min-cost-climbing-stairs/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-114

**Where it fits:** Week 13 - 1D Dynamic Programming → Day 85 - DP foundations: Fibonacci-style (SCRUM-114)

## Problem statement

cost[i] is the price of stepping on stair i. After paying you can climb 1 or 2 stairs. You may start at stair 0 or stair 1. Return the minimum cost to reach the top (one step past the last stair).

## Examples

- `cost = [10, 15, 20] -> 15`
- `cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1] -> 6`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[i] = cost[i] + min(dp[i-1], dp[i-2]); answer = min(dp[n-1], dp[n-2]).

</details>

## Files in this package

- `MinCostClimbingStairs.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MinCostClimbingStairsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
