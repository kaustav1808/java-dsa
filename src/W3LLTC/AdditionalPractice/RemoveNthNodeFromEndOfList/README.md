# 19. Remove Nth Node From End of List

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-12

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Additional practice (SCRUM-12)

## Problem statement

Given the head of a linked list, delete the n-th node counted from the end of the list and return the (possibly new) head. Ideally do it in a single pass.

## Examples

- `head = 10->20->30->40, n = 3  =>  10->30->40`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Use a dummy node and move a fast pointer n steps ahead, then advance both together.

</details>

## Files in this package

- `RemoveNthNodeFromEndOfList.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `RemoveNthNodeFromEndOfListTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
