# 191. Number of 1 Bits

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/number-of-1-bits/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-21

**Where it fits:** Week 12 - Tries & Prefix Lookups → Additional practice (SCRUM-21)

## Problem statement

Given an integer treated as an unsigned 32-bit value, return how many of its bits are 1 (its Hamming weight).

## Examples

- `n = 11 (binary 1011) -> 3`
- `n = 128 -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- n &= (n - 1) clears the lowest set bit; count how many times until n is 0.

</details>

## Files in this package

- `NumberOf1Bits.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `NumberOf1BitsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
