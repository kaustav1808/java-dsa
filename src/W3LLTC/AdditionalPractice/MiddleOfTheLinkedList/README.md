# 876. Middle of the Linked List

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/middle-of-the-linked-list/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-12

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Additional practice (SCRUM-12)

## Problem statement

Given the head of a singly linked list, return its middle node. If there are two middle nodes, return the second one.

## Examples

- `1->2->3->4->5  =>  node 3`
- `1->2->3->4->5->6  =>  node 4`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Slow and fast pointers: when fast reaches the end, slow is at the middle.

</details>

## Files in this package

- `MiddleOfTheLinkedList.java`: the LeetCode method/class signature, write your solution here.
- `MiddleOfTheLinkedListTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
