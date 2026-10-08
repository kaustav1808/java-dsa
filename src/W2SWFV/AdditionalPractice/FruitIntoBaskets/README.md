# 904. Fruit Into Baskets

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/fruit-into-baskets/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-11

**Where it fits:** Week 2 - Sliding Window (Fixed & Variable) → Additional practice (SCRUM-11)

## Problem statement

Trees stand in a row and fruits[i] is the fruit type of tree i. You have two baskets, each holding a single fruit type (any amount). Starting at any tree, you pick one fruit from every tree moving right, and must stop when a tree's fruit fits neither basket. Return the maximum number of fruits you can pick.

## Examples

- `fruits = [1, 2, 1] -> 3`
- `fruits = [0, 1, 2, 2] -> 3`
- `fruits = [1, 2, 3, 2, 2] -> 4`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Longest subarray with at most 2 distinct values: sliding window with a count map.

</details>

## Files in this package

- `FruitIntoBaskets.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `FruitIntoBasketsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
