# 150. Evaluate Reverse Polish Notation

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/evaluate-reverse-polish-notation/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-15

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Additional practice (SCRUM-15)

## Problem statement

Evaluate an arithmetic expression given in Reverse Polish (postfix) notation as an array of tokens. Operators are +, -, * and /; division between integers truncates toward zero. The expression is always valid.

## Examples

- `tokens = ["2","1","+","3","*"] -> 9  ((2 + 1) * 3)`
- `tokens = ["4","13","5","/","+"] -> 6  (4 + 13 / 5)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Stack: push numbers; on an operator pop two (right operand first) and push the result.

</details>

## Files in this package

- `EvaluateReversePolishNotation.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `EvaluateReversePolishNotationTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
