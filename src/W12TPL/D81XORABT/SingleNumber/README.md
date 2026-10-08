# 136. Single Number

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/single-number/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-110

**Where it fits:** Week 12 - Tries & Prefix Lookups → Day 81 - XOR and binary trie (SCRUM-110)

## Problem statement

In a non-empty integer array every element appears exactly twice except for one, which appears once. Find that single element in O(n) time and O(1) extra space.

## Examples

- `nums = [4, 1, 2, 1, 2] -> 4`
- `nums = [7] -> 7`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- XOR all values: pairs cancel out (a ^ a = 0).

</details>

## Files in this package

- `SingleNumber.java`: the LeetCode method/class signature, write your solution here.
- `SingleNumberTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
