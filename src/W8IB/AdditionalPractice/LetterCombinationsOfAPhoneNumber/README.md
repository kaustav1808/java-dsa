# 17. Letter Combinations of a Phone Number

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-17

**Where it fits:** Week 8 - Intervals & Backtracking → Additional practice (SCRUM-17)

## Problem statement

Each digit 2-9 maps to letters as on an old phone keypad (2 = abc, 3 = def, 4 = ghi, 5 = jkl, 6 = mno, 7 = pqrs, 8 = tuv, 9 = wxyz). Given a string of such digits, return every letter combination the digits could represent, in any order. An empty input returns an empty list.

## Examples

- `digits = "34" -> ["dg","dh","di","eg","eh","ei","fg","fh","fi"]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Backtracking: one level of recursion per digit.

</details>

## Files in this package

- `LetterCombinationsOfAPhoneNumber.java`: the LeetCode method/class signature, write your solution here.
- `LetterCombinationsOfAPhoneNumberTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
