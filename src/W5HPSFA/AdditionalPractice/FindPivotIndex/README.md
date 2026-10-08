# 724. Find Pivot Index

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-pivot-index/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-14

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Additional practice (SCRUM-14)

## Problem statement

Return the leftmost pivot index of an array: the index where the sum of all numbers strictly to its left equals the sum of all numbers strictly to its right. Return -1 if there is none.

## Examples

- `nums = [1, 7, 3, 6, 5, 6] -> 3`
- `nums = [1, 2, 3] -> -1`
- `nums = [2, 1, -1] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Total sum once; walk with a running left sum: right = total - left - nums[i].

</details>

## Files in this package

- `FindPivotIndex.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `FindPivotIndexTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
