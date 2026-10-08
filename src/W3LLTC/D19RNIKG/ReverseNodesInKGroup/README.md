# 25. Reverse Nodes in k-Group

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/reverse-nodes-in-k-group/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-48

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Day 19 - Reverse nodes in k-group (SCRUM-48)

## Problem statement

Given the head of a linked list and a positive integer `k`, reverse the nodes of the list `k` at a time and return the new head. If the number of nodes left at the end is less than `k`, leave them in their original order. Only node links may be changed, not node values.

## Examples

- `head = 1->2->3->4->5->6->7, k = 3  =>  3->2->1->6->5->4->7`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Check that k nodes remain before reversing each group; reconnect group tails carefully.

</details>

## Files in this package

- `ReverseNodesInKGroup.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ReverseNodesInKGroupTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
