# 10. Regular Expression Matching

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/regular-expression-matching/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-167

**Where it fits:** Week 20 - Interview Simulation: DP, Knapsack & Bitmask → Day 138 - Regular Expression Matching (SCRUM-167)

## Problem statement

Implement regular-expression matching for a string `s` and a pattern `p` that supports two special characters: `.` matches any single character, and `*` matches zero or more of the element immediately before it. The match must cover the entire string, not just part of it.

## Examples

- `s = "aab", p = "c*a*b" -> true  (c repeated 0 times, a repeated twice)`
- `s = "ab", p = "." -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- 2D DP over (i, j) = does s[i..] match p[j..]; handle the `x*` pair as 'skip it' or 'use it once and stay'.

</details>

## Files in this package

- `RegularExpressionMatching.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `RegularExpressionMatchingTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
