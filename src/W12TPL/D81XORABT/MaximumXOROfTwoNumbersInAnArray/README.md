# 421. Maximum XOR of Two Numbers in an Array

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-110

**Where it fits:** Week 12 - Tries & Prefix Lookups → Day 81 - XOR and binary trie (SCRUM-110)

## Problem statement

Given an integer array, return the maximum value of nums[i] XOR nums[j] over all pairs i, j (i may equal j).

## Examples

- `nums = [3, 10, 5, 25, 2, 8] -> 28  (5 XOR 25)`
- `nums = [0] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Binary trie of the numbers' bits (from bit 30 down); for each number walk the trie preferring the opposite bit.

</details>

## Files in this package

- `MaximumXOROfTwoNumbersInAnArray.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MaximumXOROfTwoNumbersInAnArrayTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
