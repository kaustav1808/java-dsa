# 1046. Last Stone Weight

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/last-stone-weight/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-15

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Additional practice (SCRUM-15)

## Problem statement

You have stones with positive weights. Each turn, smash the two heaviest stones x <= y together: if equal both are destroyed, otherwise the lighter is destroyed and the heavier becomes y - x. Return the weight of the last remaining stone, or 0 if none remain.

## Examples

- `stones = [2, 7, 4, 1, 8, 1] -> 1`
- `stones = [1] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Max-heap simulation.

</details>

## Files in this package

- `LastStoneWeight.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `LastStoneWeightTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
