# 141. Linked List Cycle

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/linked-list-cycle/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-46

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Day 17 - Floyd's cycle detection (SCRUM-46)

## Problem statement

Given the head of a linked list, return true if the list contains a cycle (some node can be reached again by following next pointers), otherwise false.

## Examples

- `3->2->0->-4 with the tail pointing back to the node 2 -> true`
- `1->2 with no cycle -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Floyd's tortoise and hare: slow moves 1, fast moves 2; they meet iff there is a cycle.

</details>

## Files in this package

- `LinkedListCycle.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `LinkedListCycleTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
