# 268. Missing Number

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/missing-number/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-21

**Where it fits:** Week 12 - Tries & Prefix Lookups → Additional practice (SCRUM-21)

## Problem statement

An array contains n distinct numbers taken from the range [0, n], so exactly one number in that range is missing. Return the missing number using O(1) extra space.

## Examples

- `nums = [3, 0, 1] -> 2`
- `nums = [0, 1] -> 2`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Expected sum n(n+1)/2 minus actual sum, or XOR indices with values.

</details>

## Files in this package

- `MissingNumber.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MissingNumberTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
