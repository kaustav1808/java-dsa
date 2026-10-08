# 72. Edit Distance

**Difficulty:** Medium (listed as Hard on the Jira board) · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/edit-distance/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-123

**Where it fits:** Week 14 - 2D Dynamic Programming → Day 94 - Edit Distance (SCRUM-123)

## Problem statement

Given two strings `word1` and `word2`, return the minimum number of single-character operations needed to turn word1 into word2. The allowed operations are: insert a character, delete a character, or replace a character.

## Examples

- `word1 = "cat", word2 = "cut" -> 1`
- `word1 = "sunday", word2 = "saturday" -> 3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- dp[i][j] = cost to convert the first i chars into the first j chars; match is free, otherwise 1 + min(insert, delete, replace).

</details>

## Files in this package

- `EditDistance.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `EditDistanceTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
