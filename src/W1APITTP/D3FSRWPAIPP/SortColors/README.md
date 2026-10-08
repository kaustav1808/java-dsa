# 75. Sort Colors

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/sort-colors/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-32

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Day 3 - Fast/slow (read/write) pointers and in-place partitioning (SCRUM-32)

## Problem statement

An array contains only the values 0, 1 and 2 (red, white, blue). Sort it in place so all 0s come first, then 1s, then 2s, without using a library sort; ideally in one pass with constant space.

## Examples

- `nums = [2, 0, 1, 2, 0] -> [0, 0, 1, 2, 2]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Dutch National Flag: low / mid / high pointers.

</details>

## Files in this package

- `SortColors.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `SortColorsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
