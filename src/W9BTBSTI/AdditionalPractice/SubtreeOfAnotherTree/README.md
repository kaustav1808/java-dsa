# 572. Subtree of Another Tree

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/subtree-of-another-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-18

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Additional practice (SCRUM-18)

## Problem statement

Given the roots of two binary trees, root and subRoot, return true if root contains a subtree with exactly the same structure and node values as subRoot (a node together with all of its descendants).

## Examples

- `root = [3, 4, 5, 1, 2], subRoot = [4, 1, 2] -> true`
- `root = [3, 4, 5, 1, 2, null, null, null, null, 0], subRoot = [4, 1, 2] -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- For each node, run a Same Tree check (O(m * n)); or serialise both trees with null markers and do a substring search.

</details>

## Files in this package

- `SubtreeOfAnotherTree.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `SubtreeOfAnotherTreeTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
