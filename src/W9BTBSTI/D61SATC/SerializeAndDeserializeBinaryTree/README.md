# 297. Serialize and Deserialize Binary Tree

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-90

**Where it fits:** Week 9 - Binary Trees & BST Invariants → Day 61 - Serialization and tree construction (SCRUM-90)

## Problem statement

Design a pair of functions: one that serializes a binary tree to a string, and one that deserializes that string back into the identical tree. Any format is allowed as long as the round trip restores the tree.

## Examples

- `root = [1, 2, 3, null, null, 4, 5] -> serialize -> deserialize -> the same tree`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Pre-order with a null marker (e.g. "1,2,#,#,3,4,#,#,5,#,#") and a recursive reader.

</details>

## Files in this package

- `Codec.java`: the LeetCode method/class signature, write your solution here.
- `CodecTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
