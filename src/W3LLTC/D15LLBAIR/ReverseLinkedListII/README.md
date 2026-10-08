# 92. Reverse Linked List II

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/reverse-linked-list-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-44

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Day 15 - Linked list basics and iterative reversal (SCRUM-44)

## Problem statement

Given the head of a linked list and two positions `left <= right` (1-indexed), reverse only the nodes from position left to position right, and return the head of the modified list.

## Examples

- `head = 1->2->3->4->5, left = 2, right = 4  =>  1->4->3->2->5`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Dummy node, walk to the node before 'left', then head-insert each following node.

</details>

## Files in this package

- `ReverseLinkedListII.java`: the LeetCode method/class signature, write your solution here.
- `ReverseLinkedListIITest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
