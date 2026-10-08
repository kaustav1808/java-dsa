# 2. Add Two Numbers

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/add-two-numbers/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-12

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Additional practice (SCRUM-12)

## Problem statement

Two non-negative integers are stored as singly linked lists with their digits in reverse order (the head holds the ones digit). Add the two numbers and return the sum as a linked list in the same reversed format. Neither number has leading zeros except the number 0 itself.

## Examples

- `l1 = 3->4, l2 = 9->8  (43 + 89)  =>  2->3->1  (132)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Carry the overflow digit forward; a final carry adds one more node.
- Lists can have different lengths.

</details>

## Files in this package

- `AddTwoNumbers.java`: the LeetCode method/class signature, write your solution here.
- `AddTwoNumbersTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
