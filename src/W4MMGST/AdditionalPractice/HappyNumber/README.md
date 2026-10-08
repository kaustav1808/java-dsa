# 202. Happy Number

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/happy-number/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-13

**Where it fits:** Week 4 - Matrix Manipulation & Grid State Tracking → Additional practice (SCRUM-13)

## Problem statement

A number is happy if repeatedly replacing it with the sum of the squares of its digits eventually reaches 1. Other numbers loop forever in a cycle that does not contain 1. Return true if `n` is happy.

## Examples

- `n = 19 -> true  (1 + 81 = 82, 64 + 4 = 68, 36 + 64 = 100, 1)`
- `n = 2 -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Detect the cycle with a HashSet or Floyd's slow/fast pointers on the sequence.

</details>

## Files in this package

- `HappyNumber.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `HappyNumberTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
