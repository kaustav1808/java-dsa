# 287. Find the Duplicate Number

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-the-duplicate-number/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-142

**Where it fits:** Week 17 - Interview Simulation: Arrays, Lists & Monotonic Structures → Day 113 - Find the Duplicate Number (SCRUM-142)

## Problem statement

An array of n + 1 integers contains values only in the range [1, n], so at least one value repeats. There is exactly one repeated value (it may repeat more than twice). Find it without modifying the array and using only O(1) extra space.

## Examples

- `nums = [1, 3, 4, 2, 2] -> 2`
- `nums = [3, 1, 3, 4, 2] -> 3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Treat i -> nums[i] as a linked list; Floyd's cycle detection finds the cycle entrance, which is the duplicate.

</details>

## Files in this package

- `FindTheDuplicateNumber.java`: the LeetCode method/class signature, write your solution here.
- `FindTheDuplicateNumberTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
