# 224. Basic Calculator

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/basic-calculator/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-26

**Where it fits:** Week 17 - Interview Simulation: Arrays, Lists & Monotonic Structures → Additional practice (SCRUM-26)

## Problem statement

Evaluate a string expression containing non-negative integers, '+', '-', parentheses and spaces, and return the result. '-' may also be used as a unary minus (for example "-(2 + 3)"). You may not use any built-in eval function.

## Examples

- `s = "1 + 1" -> 2`
- `s = "(1+(4+5+2)-3)+(6+8)" -> 23`
- `s = "-(2+3)" -> -5`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Keep a running result and sign; on '(' push (result, sign) to a stack, on ')' pop and combine.

</details>

## Files in this package

- `BasicCalculator.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `BasicCalculatorTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
