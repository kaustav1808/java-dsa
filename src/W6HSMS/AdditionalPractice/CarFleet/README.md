# 853. Car Fleet

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/car-fleet/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-15

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Additional practice (SCRUM-15)

## Problem statement

n cars drive toward a target along a one-lane road; position[i] and speed[i] are given. A car can never pass the one ahead of it; when it catches up it slows and they continue as one fleet. A car catching up exactly at the target also joins the fleet. Return how many fleets arrive at the target.

## Examples

- `target = 12, position = [10, 8, 0, 5, 3], speed = [2, 4, 1, 1, 3] -> 3`
- `target = 10, position = [3], speed = [3] -> 1`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sort by position descending and compute each arrival time; a car whose time is greater than the current fleet's time starts a new fleet (monotonic stack).

</details>

## Files in this package

- `CarFleet.java`: the LeetCode method/class signature, write your solution here.
- `CarFleetTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
