# 160. Intersection of Two Linked Lists

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/intersection-of-two-linked-lists/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-47

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Day 18 - Intersection of two lists (SCRUM-47)

## Problem statement

Given the heads of two singly linked lists, return the node at which they intersect (share the same node object from there on), or null if they never intersect. The lists must keep their structure.

## Examples

- `A = 4->1->8->4->5, B = 5->6->1->8->4->5, sharing the nodes from 8 onwards -> the node with value 8`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Two pointers that switch to the other list's head at the end both travel lenA + lenB and meet at the intersection (or both reach null).

</details>

## Files in this package

- `IntersectionOfTwoLinkedLists.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `IntersectionOfTwoLinkedListsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
