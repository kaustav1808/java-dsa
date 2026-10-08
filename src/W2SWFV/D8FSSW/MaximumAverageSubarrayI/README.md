# 643. Maximum Average Subarray I

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/maximum-average-subarray-i/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-37

**Where it fits:** Week 2 - Sliding Window (Fixed & Variable) → Day 8 - Fixed-size sliding window (SCRUM-37)

## Problem statement

Given an integer array and k, find the contiguous subarray of length exactly k with the maximum average and return that average.

## Examples

- `nums = [1, 12, -5, -6, 50, 3], k = 4 -> 12.75  ((12 - 5 - 6 + 50) / 4)`
- `nums = [5], k = 1 -> 5.0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Fixed-size sliding window: add the new element, subtract the one leaving.

</details>

## Files in this package

- `MaximumAverageSubarrayI.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MaximumAverageSubarrayITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
