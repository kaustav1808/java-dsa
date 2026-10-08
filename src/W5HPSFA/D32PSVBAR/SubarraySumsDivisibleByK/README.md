# 974. Subarray Sums Divisible by K

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/subarray-sums-divisible-by-k/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-61

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Day 32 - Prefix-sum variants: balance and remainders (SCRUM-61)

## Problem statement

Given an integer array and k, return the number of non-empty contiguous subarrays whose sum is divisible by k.

## Examples

- `nums = [4, 5, 0, -2, -3, 1], k = 5 -> 7`
- `nums = [5], k = 9 -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Count prefix-sum remainders; normalise negative remainders with ((x % k) + k) % k; seed remainder 0 with count 1.

</details>

## Files in this package

- `SubarraySumsDivisibleByK.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `SubarraySumsDivisibleByKTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
