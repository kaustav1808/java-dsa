# 91. Decode Ways

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/decode-ways/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-164

**Where it fits:** Week 20 - Interview Simulation: DP, Knapsack & Bitmask → Day 135 - Decode Ways (SCRUM-164)

## Problem statement

A message of uppercase letters is encoded as numbers with A = 1, B = 2, ..., Z = 26. Given a string of digits, return how many different ways it can be decoded. A group with a leading zero (like "06") is not a valid code.

## Examples

- `s = "12" -> 2  ("AB" or "L")`
- `s = "226" -> 3`
- `s = "06" -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[i] = (valid single digit ? dp[i-1] : 0) + (valid two-digit 10..26 ? dp[i-2] : 0).

</details>

## Files in this package

- `DecodeWays.java`: the LeetCode method/class signature, write your solution here.
- `DecodeWaysTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
