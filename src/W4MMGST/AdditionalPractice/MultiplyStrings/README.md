# 43. Multiply Strings

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/multiply-strings/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-13

**Where it fits:** Week 4 - Matrix Manipulation & Grid State Tracking → Additional practice (SCRUM-13)

## Problem statement

Given two non-negative integers `num1` and `num2` written as strings, return their product, also as a string. You must not convert the inputs to integers directly or use big-number libraries.

## Examples

- `num1 = "12", num2 = "34" -> "408"`
- `num1 = "0", num2 = "52" -> "0"`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Grade-school multiplication: digit i times digit j lands in positions i + j and i + j + 1.

</details>

## Files in this package

- `MultiplyStrings.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MultiplyStringsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
