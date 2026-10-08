# 567. Permutation in String

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/permutation-in-string/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-11

**Where it fits:** Week 2 - Sliding Window (Fixed & Variable) → Additional practice (SCRUM-11)

## Problem statement

Given strings s1 and s2, return true if s2 contains a permutation of s1 as a contiguous substring.

## Examples

- `s1 = "ab", s2 = "eidbaooo" -> true  ("ba")`
- `s1 = "ab", s2 = "eidboaoo" -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Fixed-size window of length s1.length() over s2 with letter counts.

</details>

## Files in this package

- `PermutationInString.java`: the LeetCode method/class signature, write your solution here.
- `PermutationInStringTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
