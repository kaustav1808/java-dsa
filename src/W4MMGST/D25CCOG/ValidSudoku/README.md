# 36. Valid Sudoku

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/valid-sudoku/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-54

**Where it fits:** Week 4 - Matrix Manipulation & Grid State Tracking → Day 25 - Constraint checking on grids (SCRUM-54)

## Problem statement

Decide whether a partially filled 9x9 Sudoku board is valid so far. Only the filled cells need to be checked: no digit 1-9 may repeat within any row, any column, or any of the nine 3x3 boxes. Empty cells are shown as '.'. The board does not have to be solvable.

## Examples

- `A board whose first row contains two '5's -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Track seen digits per row, column and box (box index = (r / 3) * 3 + c / 3).

</details>

## Files in this package

- `ValidSudoku.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ValidSudokuTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
