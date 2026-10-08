# 1049. Last Stone Weight II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/last-stone-weight-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-29

**Where it fits:** Week 20 - Interview Simulation: DP, Knapsack & Bitmask → Additional practice (SCRUM-29)

## Problem statement

Same smashing rule as Last Stone Weight, but you may choose ANY two stones each turn. Return the smallest possible weight of the final stone (0 if none remain).

## Examples

- `stones = [2, 7, 4, 1, 8, 1] -> 1`
- `stones = [31, 26, 33, 21, 40] -> 5`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Equivalent to splitting stones into two groups with sums as close as possible: 0/1 knapsack up to total / 2; answer = total - 2 * best.

</details>

## Files in this package

- `LastStoneWeightII.java`: the LeetCode method/class signature, write your solution here.
- `LastStoneWeightIITest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
