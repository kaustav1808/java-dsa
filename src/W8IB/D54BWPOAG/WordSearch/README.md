# 79. Word Search

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/word-search/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-83

**Where it fits:** Week 8 - Intervals & Backtracking → Day 54 - Backtracking with pruning on a grid (SCRUM-83)

## Problem statement

Given an m x n grid of letters and a word, return true if the word can be traced through the grid by moving between horizontally or vertically adjacent cells, using each cell at most once.

## Examples

- `board = [["C","A","T"],["X","R","S"]], word = "CAR" -> true`
- `same board, word = "CATS" -> true; word = "ACA" -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- DFS from each cell; mark cells visited on the way down and unmark on the way back.

</details>

## Files in this package

- `WordSearch.java`: the LeetCode method/class signature, write your solution here.
- `WordSearchTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
