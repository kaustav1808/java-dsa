# 143. Reorder List

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/reorder-list/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-12

**Where it fits:** Week 3 - Linked List Transformations & Cycles → Additional practice (SCRUM-12)

## Problem statement

Given a list L0 -> L1 -> ... -> Ln-1 -> Ln, reorder it in place to L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 -> ... by changing links only, not values.

## Examples

- `1->2->3->4  =>  1->4->2->3`
- `1->2->3->4->5  =>  1->5->2->4->3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Find the middle, reverse the second half, then merge the two halves alternately.

</details>

## Files in this package

- `ReorderList.java`: the LeetCode method/class signature, write your solution here.
- `ReorderListTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
