# 943. Find the Shortest Superstring

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-the-shortest-superstring/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-29

**Where it fits:** Week 20 - Interview Simulation: DP, Knapsack & Bitmask → Additional practice (SCRUM-29)

## Problem statement

Given an array of distinct strings, return the shortest string that contains each of them as a substring. You may assume no string is a substring of another. If several shortest answers exist, return any.

## Examples

- `words = ["alex","loves","leetcode"] -> "alexlovesleetcode" (any order of the three works)`
- `words = ["catg","ctaagt","gcta","ttca","atgcatc"] -> "gctaagttcatgcatc"`

## Board note

Bitmask DP.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Precompute pairwise overlaps, then bitmask DP over (set of used words, last word), like a travelling-salesman problem; rebuild the string from parent pointers.

</details>

## Files in this package

- `FindTheShortestSuperstring.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `FindTheShortestSuperstringTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
