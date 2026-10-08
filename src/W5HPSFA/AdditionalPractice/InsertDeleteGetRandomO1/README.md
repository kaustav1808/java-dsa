# 380. Insert Delete GetRandom O(1)

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/insert-delete-getrandom-o1/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-14

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Additional practice (SCRUM-14)

## Problem statement

Design a set supporting insert(val), remove(val) and getRandom() (return a uniformly random current element), all in average O(1) time. insert and remove return whether the operation changed the set.

## Examples

- `insert(1) -> true, remove(2) -> false, insert(2) -> true, getRandom() -> 1 or 2, remove(1) -> true, insert(2) -> false, getRandom() -> 2`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- ArrayList of values plus a HashMap value -> index; remove by swapping with the last element.

</details>

## Files in this package

- `InsertDeleteGetRandomO1.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `InsertDeleteGetRandomO1Test.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
