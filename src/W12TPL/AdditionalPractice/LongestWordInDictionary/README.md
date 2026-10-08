# 720. Longest Word in Dictionary

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/longest-word-in-dictionary/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-21

**Where it fits:** Week 12 - Tries & Prefix Lookups → Additional practice (SCRUM-21)

## Problem statement

Given an array of words, return the longest word that can be built one character at a time, where every prefix of it (of length 1, 2, ...) is also a word in the array. If there is a tie, return the alphabetically smallest; if none, return the empty string.

## Examples

- `words = ["w","wo","wor","worl","world"] -> "world"`
- `words = ["a","banana","app","appl","ap","apply","apple"] -> "apple"`

## Board note

Trie.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Trie: DFS only through nodes marked as complete words; or sort and use a HashSet of buildable words.

</details>

## Files in this package

- `LongestWordInDictionary.java`: the LeetCode method/class signature, write your solution here.
- `LongestWordInDictionaryTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
