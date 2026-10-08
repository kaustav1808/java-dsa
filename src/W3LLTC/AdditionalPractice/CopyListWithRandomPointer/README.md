# 138. Copy List with Random Pointer

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/copy-list-with-random-pointer/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-12

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Additional practice (SCRUM-12)

## Problem statement

A linked list has nodes with a `next` pointer and an extra `random` pointer that can point to any node in the list or be null. Return a deep copy of the list, where no pointer in the copy refers to a node of the original list.

## Examples

- `[[7,null],[13,0],[11,4],[10,2],[1,0]] (value, random index) -> an identical, independent list`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- HashMap original -> copy, or interleave copies between originals (O(1) extra space).

</details>

## Files in this package

- `CopyListWithRandomPointer.java`: the LeetCode method/class signature, write your solution here.
- `CopyListWithRandomPointerTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.
- `Node.java`: LeetCode's Node class (already defined on LeetCode, do not paste it).

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
