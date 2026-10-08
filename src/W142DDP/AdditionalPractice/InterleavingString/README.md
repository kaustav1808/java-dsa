# 97. Interleaving String

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/interleaving-string/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-23

**Where it fits:** Week 14 - 2D Dynamic Programming → Additional practice (SCRUM-23)

## Problem statement

Given strings `s1`, `s2` and `s3`, decide whether s3 can be formed by interleaving s1 and s2: taking all characters of both strings, keeping each string's own character order, and merging them.

## Examples

- `s1 = "ab", s2 = "cd", s3 = "acbd" -> true`
- `s1 = "ab", s2 = "cd", s3 = "bacd" -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[i][j] = can the first i chars of s1 and j chars of s2 form the first i + j chars of s3.

</details>

## Files in this package

- `InterleavingString.java`: the LeetCode method/class signature, write your solution here.
- `InterleavingStringTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
