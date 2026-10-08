# 234. Palindrome Linked List

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/palindrome-linked-list/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-12

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Additional practice (SCRUM-12)

## Problem statement

Given the head of a singly linked list, return true if its values read the same forwards and backwards. Aim for O(n) time and O(1) extra space.

## Examples

- `1->2->2->1  =>  true`
- `1->2  =>  false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Find the middle, reverse the second half, compare, (optionally restore).

</details>

## Files in this package

- `PalindromeLinkedList.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `PalindromeLinkedListTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
