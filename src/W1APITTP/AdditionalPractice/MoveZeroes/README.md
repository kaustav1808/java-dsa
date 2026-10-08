# 283. Move Zeroes

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/move-zeroes/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-10

**Where it fits:** Week 1 - Array Pruning, Index Tricks & Two Pointers → Additional practice (SCRUM-10)

## Problem statement

Move all 0s in an array to the end while keeping the relative order of the non-zero elements. Do it in place.

## Examples

- `nums = [0, 1, 0, 3, 12] -> [1, 3, 12, 0, 0]`
- `nums = [0] -> [0]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Write pointer for the next non-zero position, then fill the rest with zeros (or swap).

</details>

## Files in this package

- `MoveZeroes.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MoveZeroesTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
