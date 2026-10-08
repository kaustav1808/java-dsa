# 312. Burst Balloons

**Difficulty:** Hard · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/burst-balloons/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-23

**Where it fits:** Week 14 - 2D Dynamic Programming → Additional practice (SCRUM-23)

## Problem statement

You have n balloons, each painted with a number. Bursting balloon i earns nums[left] * nums[i] * nums[right], where left and right are its current neighbours (treat out-of-range neighbours as 1). After bursting, the neighbours become adjacent. Return the maximum coins you can collect by bursting all balloons.

## Examples

- `nums = [3, 1, 5, 8] -> 167`
- `nums = [1, 5] -> 10`

## Board note

Interval DP.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Interval DP: choose which balloon is burst LAST inside (l, r): dp[l][r] = max(dp[l][k] + dp[k][r] + v[l]*v[k]*v[r]).

</details>

## Files in this package

- `BurstBalloons.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `BurstBalloonsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
