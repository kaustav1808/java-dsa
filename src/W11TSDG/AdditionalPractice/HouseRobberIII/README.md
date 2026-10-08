# 337. House Robber III

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/house-robber-iii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-20

**Where it fits:** Week 11 - Topological Sort & Dependency Graphs → Additional practice (SCRUM-20)

## Problem statement

All houses form a binary tree rooted at one entrance house. Robbing two directly connected houses (parent and child) on the same night triggers the alarm. Return the maximum money you can rob.

## Examples

- `root = [3, 2, 3, null, 3, null, 1] -> 7  (3 + 3 + 1)`
- `root = [3, 4, 5, 1, 3, null, 1] -> 9  (4 + 5)`

## Board note

Tree DP.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Post-order returning a pair: (best if this node is robbed, best if it is not).

</details>

## Files in this package

- `HouseRobberIII.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `HouseRobberIIITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
