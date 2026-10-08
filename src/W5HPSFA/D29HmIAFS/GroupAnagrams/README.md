# 49. Group Anagrams

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/group-anagrams/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-58

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Day 29 - HashMap internals and frequency signatures (SCRUM-58)

## Problem statement

Given an array of strings, group together the words that are anagrams of each other (same letters, same counts, possibly different order). Return the groups in any order.

## Examples

- `strs = ["tea", "eat", "tan", "nat", "bat"] -> [["tea","eat"], ["tan","nat"], ["bat"]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Key each word by its sorted letters or a 26-count signature.

</details>

## Files in this package

- `GroupAnagrams.java`: the LeetCode method/class signature, write your solution here.
- `GroupAnagramsTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
