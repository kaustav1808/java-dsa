# 525. Contiguous Array

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/contiguous-array/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-61

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Day 32 - Prefix-sum variants: balance and remainders (SCRUM-61)

## Problem statement

Given a binary array (only 0s and 1s), return the maximum length of a contiguous subarray containing equal numbers of 0s and 1s.

## Examples

- `nums = [0, 1] -> 2`
- `nums = [0, 1, 0] -> 2`
- `nums = [0, 0, 1, 0, 1, 1] -> 6`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Treat 0 as -1; the longest subarray with sum 0 is found by storing the first index of each prefix sum (balance).

</details>

## Files in this package

- `ContiguousArray.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ContiguousArrayTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
