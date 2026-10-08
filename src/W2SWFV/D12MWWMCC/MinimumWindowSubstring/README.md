# 76. Minimum Window Substring

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/minimum-window-substring/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-41

**Where it fits:** Week 2 - Sliding Window (Fixed & Variable) → Day 12 - Minimum window with multi-character constraints (SCRUM-41)

## Problem statement

Given strings `s` and `t`, return the shortest substring of `s` that contains every character of `t`, including duplicates (if t has two 'a's, the window needs at least two). If no such window exists, return the empty string. The answer is unique when it exists.

## Examples

- `s = "XADOBECODEBANCY", t = "ABC" -> "BANC"`
- `s = "a", t = "aa" -> ""`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Expand the right edge until valid, then shrink the left edge; a 'formed' counter keeps each step O(1).

</details>

## Files in this package

- `MinimumWindowSubstring.java`: the LeetCode method/class signature, write your solution here.
- `MinimumWindowSubstringTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
