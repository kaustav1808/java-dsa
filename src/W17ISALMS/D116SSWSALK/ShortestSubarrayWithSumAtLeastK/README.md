# 862. Shortest Subarray with Sum at Least K

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-145

**Where it fits:** Week 17 - Interview Simulation: Arrays, Lists & Monotonic Structures → Day 116 - Shortest Subarray with Sum at Least K (SCRUM-145)

## Problem statement

Given an integer array (values may be negative) and k, return the length of the shortest non-empty contiguous subarray whose sum is at least k, or -1 if none exists.

## Examples

- `nums = [1], k = 1 -> 1`
- `nums = [1, 2], k = 4 -> -1`
- `nums = [2, -1, 2], k = 3 -> 3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Prefix sums with a monotonic increasing deque of indices: pop from the front while the sum condition holds, pop from the back to keep it increasing.

</details>

## Files in this package

- `ShortestSubarrayWithSumAtLeastK.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ShortestSubarrayWithSumAtLeastKTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
