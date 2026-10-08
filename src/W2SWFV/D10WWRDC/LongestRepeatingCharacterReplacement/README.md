# 424. Longest Repeating Character Replacement

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/longest-repeating-character-replacement/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-39

**Where it fits:** Week 2 - Sliding Window (Fixed & Variable) → Day 10 - Window with replacements (dominant character) (SCRUM-39)

## Problem statement

Given an uppercase string and an integer k, you may change at most k characters to any other uppercase letter. Return the length of the longest substring that contains only one repeated letter after these changes.

## Examples

- `s = "ABAB", k = 2 -> 4`
- `s = "AABABBA", k = 1 -> 4`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sliding window: valid while windowLength - maxFrequency <= k.

</details>

## Files in this package

- `LongestRepeatingCharacterReplacement.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `LongestRepeatingCharacterReplacementTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
