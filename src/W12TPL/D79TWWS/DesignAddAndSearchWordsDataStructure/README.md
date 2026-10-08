# 211. Design Add and Search Words Data Structure

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/design-add-and-search-words-data-structure/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-108

**Where it fits:** Week 12 - Tries & Prefix Lookups → Day 79 - Trie with wildcard search (SCRUM-108)

## Problem statement

Design a data structure that supports `addWord(word)` and `search(word)`, where the search pattern may contain '.' characters that match any single letter.

## Examples

- `addWord("bad"), addWord("dad"), addWord("mad"), search("pad") -> false, search("bad") -> true, search(".ad") -> true, search("b..") -> true`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Trie; on '.', recurse into every existing child.

</details>

## Files in this package

- `DesignAddAndSearchWordsDataStructure.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `DesignAddAndSearchWordsDataStructureTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
