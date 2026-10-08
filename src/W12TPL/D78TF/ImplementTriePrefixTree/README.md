# 208. Implement Trie (Prefix Tree)

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/implement-trie-prefix-tree/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-107

**Where it fits:** Week 12 - Tries & Prefix Lookups → Day 78 - Trie fundamentals (SCRUM-107)

## Problem statement

Implement a trie (prefix tree) with three operations: `insert(word)`, `search(word)` returning whether the exact word was inserted, and `startsWith(prefix)` returning whether any inserted word begins with the prefix. Words are lowercase English letters.

## Examples

- `insert("apple"), search("apple") -> true, search("app") -> false, startsWith("app") -> true, insert("app"), search("app") -> true`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Each node has 26 children and an end-of-word flag.

</details>

## Files in this package

- `Trie.java`: the LeetCode method/class signature, write your solution here.
- `TrieTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
