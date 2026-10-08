# 240. Search a 2D Matrix II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/search-a-2d-matrix-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-13

**Where it fits:** Week 4 - Matrix Manipulation & Grid State Tracking → Additional practice (SCRUM-13)

## Problem statement

Search for a target in an m x n matrix where every row is sorted left to right and every column is sorted top to bottom. Return true if it is present.

## Examples

- `matrix = [[1,4,7,11],[2,5,8,12],[3,6,9,16],[10,13,14,17]], target = 5 -> true; target = 15 -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Start at the top-right corner: move left if too big, down if too small (O(m + n)).

</details>

## Files in this package

- `SearchA2DMatrixII.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `SearchA2DMatrixIITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
