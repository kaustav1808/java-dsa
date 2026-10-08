# 44. Wildcard Matching

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/wildcard-matching/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-29

**Where it fits:** Week 20 - Interview Simulation: DP, Knapsack & Bitmask → Additional practice (SCRUM-29)

## Problem statement

Implement wildcard matching between a string `s` and a pattern `p`, where `?` matches any single character and `*` matches any sequence of characters (including the empty one). The pattern must match the whole string.

## Examples

- `s = "abcde", p = "a*d?" -> true`
- `s = "ab", p = "*c" -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- 2D DP, or a greedy scan that remembers the last '*' position for backtracking.

</details>

## Files in this package

- `WildcardMatching.java`: the LeetCode method/class signature, write your solution here.
- `WildcardMatchingTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
