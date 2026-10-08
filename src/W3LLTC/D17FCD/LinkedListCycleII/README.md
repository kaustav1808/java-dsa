# 142. Linked List Cycle II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/linked-list-cycle-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-46

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Day 17 - Floyd's cycle detection (SCRUM-46)

## Problem statement

Given the head of a linked list, return the node where a cycle begins, or null if there is no cycle. Do not modify the list.

## Examples

- `3->2->0->-4 with the tail pointing back to node 2 -> returns the node with value 2`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- After slow and fast meet, restart one pointer from head; moving both one step at a time, they meet at the cycle start.

</details>

## Files in this package

- `LinkedListCycleII.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `LinkedListCycleIITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
