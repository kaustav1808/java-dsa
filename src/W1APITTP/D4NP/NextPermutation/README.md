# 31. Next Permutation

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/next-permutation/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-33

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Day 4 - Next Permutation (SCRUM-33)

## Problem statement

A permutation's 'next permutation' is the next arrangement in lexicographic (dictionary) order. Rearrange the integer array `nums` in place into its next permutation. If it is already the largest arrangement, rearrange it into the smallest (ascending) order. Use only constant extra memory.

## Examples

- `nums = [1, 3, 2] -> [2, 1, 3]`
- `nums = [3, 2, 1] -> [1, 2, 3]`
- `nums = [1, 1, 5] -> [1, 5, 1]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Find the rightmost i with nums[i] < nums[i+1], swap it with the rightmost larger element, then reverse the suffix.

</details>

## Files in this package

- `NextPermutation.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `NextPermutationTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
