# 437. Path Sum III

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/path-sum-iii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-153

**Where it fits:** Week 18 - Interview Simulation: Heaps, Intervals & Tree Paths → Day 124 - Path Sum III (SCRUM-153)

## Problem statement

Given the root of a binary tree and a targetSum, count the paths whose node values add up to targetSum. A path must go downwards (parent to child) but may start and end at any nodes.

## Examples

- `root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8 -> 3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Prefix sums along the current root-to-node path stored in a HashMap (add on the way down, remove on the way back).

</details>

## Files in this package

- `PathSumIII.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `PathSumIIITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
