# 739. Daily Temperatures

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/daily-temperatures/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-67

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Day 38 - Monotonic stack and monotonic deque (SCRUM-67)

## Problem statement

Given daily temperatures, return an array where answer[i] is the number of days you must wait after day i for a warmer temperature, or 0 if no warmer day comes.

## Examples

- `temperatures = [73, 74, 75, 71, 69, 72, 76, 73] -> [1, 1, 4, 2, 1, 1, 0, 0]`
- `temperatures = [30, 60, 90] -> [1, 1, 0]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Monotonic decreasing stack of indices: when a warmer day arrives, pop and fill in the waits.

</details>

## Files in this package

- `DailyTemperatures.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `DailyTemperaturesTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
