# 22. Generate Parentheses

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/generate-parentheses/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-17

**Where it fits:** Week 8 - Intervals & Backtracking → Additional practice (SCRUM-17)

## Problem statement

Given `n`, generate every string of `n` pairs of parentheses that is well-formed (balanced).

## Examples

- `n = 2 -> ["(())", "()()"]`
- `n = 1 -> ["()"]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Backtrack: add '(' while open < n, add ')' while close < open.

</details>

## Files in this package

- `GenerateParentheses.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `GenerateParenthesesTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
