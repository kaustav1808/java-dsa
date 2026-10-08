# 23. Merge k Sorted Lists

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/merge-k-sorted-lists/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-68

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Day 39 - K-way merge with a heap (SCRUM-68)

## Problem statement

You are given an array of `k` linked lists, each sorted in ascending order. Merge all of them into a single sorted linked list and return it.

## Examples

- `lists = [1->6, 2->3->8, 4]  =>  1->2->3->4->6->8`
- `lists = []  =>  empty list`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Min-heap of the current head of each list: O(N log k).

</details>

## Files in this package

- `MergeKSortedLists.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MergeKSortedListsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
