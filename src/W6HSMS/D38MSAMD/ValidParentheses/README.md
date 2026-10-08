# 20. Valid Parentheses

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/valid-parentheses/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-67

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Day 38 - Monotonic stack and monotonic deque (SCRUM-67)

## Problem statement

Given a string made only of the characters `()[]{}`, decide whether it is valid: every opening bracket must be closed by the same type of bracket, brackets must close in the correct order, and every closing bracket must have a matching opener.

## Examples

- `s = "{[]()}" -> true`
- `s = "(]" -> false`
- `s = "([)]" -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Push openers on a stack; on a closer, the top must be its partner.

</details>

## Files in this package

- `ValidParentheses.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ValidParenthesesTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
