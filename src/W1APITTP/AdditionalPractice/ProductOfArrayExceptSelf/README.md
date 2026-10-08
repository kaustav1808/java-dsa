# 238. Product of Array Except Self

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/product-of-array-except-self/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-10

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Additional practice (SCRUM-10)

## Problem statement

Given an integer array `nums`, return an array `answer` where answer[i] is the product of every element except nums[i]. Run in O(n) time without using division.

## Examples

- `nums = [1, 2, 3, 4] -> [24, 12, 8, 6]`
- `nums = [-1, 1, 0, -3, 3] -> [0, 0, 9, 0, 0]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Prefix products from the left times suffix products from the right; the output array can hold one of them (O(1) extra space).

</details>

## Files in this package

- `ProductOfArrayExceptSelf.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ProductOfArrayExceptSelfTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
