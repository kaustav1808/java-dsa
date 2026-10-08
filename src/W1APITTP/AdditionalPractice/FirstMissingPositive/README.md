# 41. First Missing Positive

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/first-missing-positive/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-10

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Additional practice (SCRUM-10)

## Problem statement

Given an unsorted integer array `nums`, return the smallest positive integer (1, 2, 3, ...) that does not appear in it. The solution must run in O(n) time using O(1) extra space.

## Examples

- `nums = [3, 4, -1, 1] -> 2`
- `nums = [1, 2, 3] -> 4`
- `nums = [8, 9] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Cyclic placement: put each value v in [1..n] at index v - 1, then scan for the first mismatch.

</details>

## Files in this package

- `FirstMissingPositive.java`: the LeetCode method/class signature, write your solution here.
- `FirstMissingPositiveTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
