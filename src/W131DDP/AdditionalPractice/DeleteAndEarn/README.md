# 740. Delete and Earn

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/delete-and-earn/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-22

**Where it fits:** Week 13 - 1D Dynamic Programming → Additional practice (SCRUM-22)

## Problem statement

Given an integer array, you may repeatedly pick any nums[i] to earn its value, but then every element equal to nums[i] - 1 or nums[i] + 1 is deleted. Return the maximum total points.

## Examples

- `nums = [3, 4, 2] -> 6  (take 4, which deletes 3; then take 2)`
- `nums = [2, 2, 3, 3, 3, 4] -> 9  (take all three 3s)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sum points per value, then it is House Robber over the value axis.

</details>

## Files in this package

- `DeleteAndEarn.java`: the LeetCode method/class signature, write your solution here.
- `DeleteAndEarnTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
