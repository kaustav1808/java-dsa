# 239. Sliding Window Maximum

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/sliding-window-maximum/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-67

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Day 38 - Monotonic stack and monotonic deque (SCRUM-67)

## Problem statement

Given an array and a window size k, a window of size k slides from the left end to the right end one position at a time. Return an array with the maximum value of each window position.

## Examples

- `nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3 -> [3, 3, 5, 5, 6, 7]`
- `nums = [1], k = 1 -> [1]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Monotonic decreasing deque of indices: O(n) overall.

</details>

## Files in this package

- `SlidingWindowMaximum.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `SlidingWindowMaximumTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
