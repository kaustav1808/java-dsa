# 189. Rotate Array

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/rotate-array/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-10

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Additional practice (SCRUM-10)

## Problem statement

Rotate an integer array to the right by `k` steps in place (the last k elements move to the front). k may be larger than the array length.

## Examples

- `nums = [1, 2, 3, 4, 5, 6, 7], k = 3 -> [5, 6, 7, 1, 2, 3, 4]`
- `nums = [1, 2], k = 3 -> [2, 1]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- k %= n, then reverse the whole array, reverse the first k, reverse the rest.

</details>

## Files in this package

- `RotateArray.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `RotateArrayTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
