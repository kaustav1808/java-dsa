# 875. Koko Eating Bananas

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/koko-eating-bananas/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-75

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Day 46 - Binary search on the answer (SCRUM-75)

## Problem statement

Koko has piles of bananas and h hours. Each hour she picks one pile and eats k bananas from it (or the whole pile if it has fewer than k). Return the minimum integer speed k that lets her finish all piles within h hours.

## Examples

- `piles = [3, 6, 7, 11], h = 8 -> 4`
- `piles = [30, 11, 23, 4, 20], h = 5 -> 30`
- `piles = [30, 11, 23, 4, 20], h = 6 -> 23`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Binary search on k in [1, max pile]; hours needed = sum of ceil(pile / k).

</details>

## Files in this package

- `KokoEatingBananas.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `KokoEatingBananasTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
