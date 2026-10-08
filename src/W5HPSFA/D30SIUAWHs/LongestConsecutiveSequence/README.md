# 128. Longest Consecutive Sequence

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/longest-consecutive-sequence/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-59

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Day 30 - Sequences in unsorted arrays with HashSet (SCRUM-59)

## Problem statement

Given an unsorted integer array, return the length of the longest run of consecutive integers (like 4, 5, 6, 7) that can be formed from its values. The values do not need to be adjacent in the array. Aim for O(n) time.

## Examples

- `nums = [10, 4, 20, 1, 3, 2] -> 4  (1, 2, 3, 4)`
- `nums = [] -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Put everything in a HashSet; only start counting from numbers whose predecessor (x - 1) is absent.

</details>

## Files in this package

- `LongestConsecutiveSequence.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `LongestConsecutiveSequenceTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
