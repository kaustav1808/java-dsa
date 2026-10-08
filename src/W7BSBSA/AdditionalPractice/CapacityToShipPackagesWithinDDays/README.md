# 1011. Capacity To Ship Packages Within D Days

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-16

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Additional practice (SCRUM-16)

## Problem statement

Packages with given weights must be shipped in order within days days. Each day the ship is loaded with consecutive packages up to its capacity. Return the least ship capacity that ships everything within days days.

## Examples

- `weights = [1,2,3,4,5,6,7,8,9,10], days = 5 -> 15`
- `weights = [3,2,2,4,1,4], days = 3 -> 6`
- `weights = [1,2,3,1,1], days = 4 -> 3`

## Board note

Binary search on the answer.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Binary search on capacity in [max weight, total weight]; greedily count days for a candidate capacity.

</details>

## Files in this package

- `CapacityToShipPackagesWithinDDays.java`: the LeetCode method/class signature, write your solution here.
- `CapacityToShipPackagesWithinDDaysTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
