# 66. Plus One

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/plus-one/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-13

**Where it fits:** Week 4 - Matrix Manipulation & Grid State Tracking → Additional practice (SCRUM-13)

## Problem statement

A large non-negative integer is given as an array of its digits, most significant first, with no leading zeros. Add one to it and return the resulting digit array.

## Examples

- `digits = [1, 2, 9] -> [1, 3, 0]`
- `digits = [9, 9] -> [1, 0, 0]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Walk from the end propagating the carry; all-9s needs a new leading 1.

</details>

## Files in this package

- `PlusOne.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `PlusOneTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
