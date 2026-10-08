# 289. Game of Life

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/game-of-life/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-13

**Where it fits:** Week 4 - Matrix Manipulation & Grid State Tracking → Additional practice (SCRUM-13)

## Problem statement

Conway's Game of Life is played on an m x n grid of live (1) and dead (0) cells. Each cell looks at its 8 neighbours: a live cell with fewer than 2 or more than 3 live neighbours dies; a live cell with 2 or 3 survives; a dead cell with exactly 3 live neighbours becomes alive. All cells update simultaneously. Compute the next state in place.

## Examples

- `[[0,1,0],[0,0,1],[1,1,1],[0,0,0]] -> [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]`

## Board note

In-place state encoding.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Encode old and new state together (for example 2 = was dead becomes alive, -1 = was alive dies), then normalise in a second pass.

</details>

## Files in this package

- `GameOfLife.java`: the LeetCode method/class signature, write your solution here.
- `GameOfLifeTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
