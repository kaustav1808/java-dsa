# 131. Palindrome Partitioning

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/palindrome-partitioning/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-17

**Where it fits:** Week 8 - Intervals & Backtracking → Additional practice (SCRUM-17)

## Problem statement

Given a string `s`, split it into pieces so that every piece is a palindrome, and return every possible such partition.

## Examples

- `s = "aab" -> [["a","a","b"], ["aa","b"]]`
- `s = "a" -> [["a"]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Backtracking over end positions; precompute an isPalindrome[i][j] table to speed checks.

</details>

## Files in this package

- `PalindromePartitioning.java`: the LeetCode method/class signature, write your solution here.
- `PalindromePartitioningTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
