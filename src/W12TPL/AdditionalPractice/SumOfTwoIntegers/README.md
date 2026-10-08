# 371. Sum of Two Integers

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/sum-of-two-integers/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-21

**Where it fits:** Week 12 - Tries & Prefix Lookups → Additional practice (SCRUM-21)

## Problem statement

Return the sum of two integers a and b without using the + or - operators.

## Examples

- `a = 1, b = 2 -> 3`
- `a = 2, b = 3 -> 5`
- `a = -1, b = 1 -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Repeat: sum = a ^ b (add without carry), carry = (a & b) << 1, until carry is 0.

</details>

## Files in this package

- `SumOfTwoIntegers.java`: the LeetCode method/class signature, write your solution here.
- `SumOfTwoIntegersTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
