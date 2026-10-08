# 3. Longest Substring Without Repeating Characters

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/longest-substring-without-repeating-characters/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-38

**Where it fits:** Week 2 - Sliding Window (Fixed & Variable) → Day 9 - Variable-size sliding window (SCRUM-38)

## Problem statement

Given a string `s`, return the length of the longest substring (contiguous) that contains no repeated characters.

## Examples

- `s = "dvdf" -> 3  ("vdf")`
- `s = "bbbb" -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Variable-size sliding window with a last-seen index map or a frequency set.

</details>

## Files in this package

- `LongestSubstringWithoutRepeatingCharacters.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `LongestSubstringWithoutRepeatingCharactersTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
