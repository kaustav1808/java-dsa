# 130. Surrounded Regions

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/surrounded-regions/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-139

**Where it fits:** Week 16 - Weighted Graphs & Minimum Spanning Trees → Day 110 - Border-connected regions (SCRUM-139)

## Problem statement

Given an m x n board of 'X' and 'O', capture every region of 'O's that is completely surrounded by 'X's by flipping those 'O's to 'X'. A region that touches the border (directly or through connected 'O's) is not captured. Connections are horizontal/vertical only. Modify the board in place.

## Examples

- `[[X,X,X,X],[X,O,O,X],[X,X,O,X],[X,O,X,X]] -> [[X,X,X,X],[X,X,X,X],[X,X,X,X],[X,O,X,X]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Flood-fill from border 'O's to mark them safe; flip every unmarked 'O'.

</details>

## Files in this package

- `SurroundedRegions.java`: the LeetCode method/class signature, write your solution here.
- `SurroundedRegionsTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
