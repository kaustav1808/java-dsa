# 438. Find All Anagrams in a String

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-all-anagrams-in-a-string/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-37

**Where it fits:** Week 2 - Sliding Window (Fixed & Variable) → Day 8 - Fixed-size sliding window (SCRUM-37)

## Problem statement

Given strings s and p, return the starting indices of every substring of s that is an anagram of p (same letters, same counts). Indices may be returned in any order.

## Examples

- `s = "cbaebabacd", p = "abc" -> [0, 6]`
- `s = "abab", p = "ab" -> [0, 1, 2]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Fixed-size window of length p.length() with 26-slot counts; compare (or track a 'matches' counter) as it slides.

</details>

## Files in this package

- `FindAllAnagramsInAString.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `FindAllAnagramsInAStringTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
