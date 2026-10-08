# 51. N-Queens

**Difficulty:** Hard · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/n-queens/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-17

**Where it fits:** Week 8 - Intervals & Backtracking → Additional practice (SCRUM-17)

## Problem statement

Place `n` queens on an n x n chessboard so that no two queens attack each other (no shared row, column or diagonal). Return every distinct solution, each drawn as a list of strings where 'Q' is a queen and '.' is empty.

## Examples

- `n = 4 -> 2 solutions: [".Q..","...Q","Q...","..Q."] and ["..Q.","Q...","...Q",".Q.."]`
- `n = 1 -> [["Q"]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Backtrack row by row; track used columns, (r - c) diagonals and (r + c) anti-diagonals.

</details>

## Files in this package

- `NQueens.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `NQueensTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
