# 502. IPO

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/ipo/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-69

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Day 40 - Greedy selection with two heaps (SCRUM-69)

## Problem statement

You may finish at most k distinct projects before an IPO. Project i needs at least capital[i] to start and adds profits[i] to your capital when finished. Starting with capital w, choose projects to maximise your final capital and return it.

## Examples

- `k = 2, w = 0, profits = [1, 2, 3], capital = [0, 1, 1] -> 4`
- `k = 3, w = 0, profits = [1, 2, 3], capital = [0, 1, 2] -> 6`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sort projects by required capital; push affordable ones into a max-heap by profit and take the best k times.

</details>

## Files in this package

- `IPO.java`: the LeetCode method/class signature, write your solution here.
- `IPOTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
