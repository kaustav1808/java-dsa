# 45. Jump Game II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/jump-game-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-128

**Where it fits:** Week 15 - Greedy & Kadane-Style Subarray Patterns → Day 99 - Greedy: jump games (SCRUM-128)

## Problem statement

You start at index 0 of the array `nums`; `nums[i]` is the maximum jump length from index i. It is guaranteed you can reach the last index. Return the minimum number of jumps needed to reach it.

## Examples

- `nums = [2, 3, 1, 1, 4] -> 2  (0 -> 1 -> 4)`
- `nums = [1, 1, 1] -> 2`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Greedy BFS by levels: track the farthest reach of the current jump window.

</details>

## Files in this package

- `JumpGameII.java`: the LeetCode method/class signature, write your solution here.
- `JumpGameIITest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
