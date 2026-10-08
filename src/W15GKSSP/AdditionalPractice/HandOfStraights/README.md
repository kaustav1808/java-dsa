# 846. Hand of Straights

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/hand-of-straights/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-24

**Where it fits:** Week 15 - Greedy & Kadane-Style Subarray Patterns → Additional practice (SCRUM-24)

## Problem statement

Alice wants to rearrange her cards into groups of exactly groupSize consecutive values (like 3, 4, 5). Given the card values hand, return true if she can do it using every card.

## Examples

- `hand = [1, 2, 3, 6, 2, 3, 4, 7, 8], groupSize = 3 -> true  ([1,2,3], [2,3,4], [6,7,8])`
- `hand = [1, 2, 3, 4, 5], groupSize = 4 -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Count values in a TreeMap; repeatedly start a group at the smallest remaining value and consume the next groupSize - 1 values.

</details>

## Files in this package

- `HandOfStraights.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `HandOfStraightsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
