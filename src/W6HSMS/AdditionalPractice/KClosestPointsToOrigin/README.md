# 973. K Closest Points to Origin

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/k-closest-points-to-origin/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-15

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Additional practice (SCRUM-15)

## Problem statement

Given an array of points [x, y] on a plane and k, return the k points closest to the origin (0, 0) by Euclidean distance, in any order.

## Examples

- `points = [[1,3],[-2,2]], k = 1 -> [[-2,2]]`
- `points = [[3,3],[5,-1],[-2,4]], k = 2 -> [[3,3],[-2,4]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Compare squared distances; max-heap of size k, or Quickselect.

</details>

## Files in this package

- `KClosestPointsToOrigin.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `KClosestPointsToOriginTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
