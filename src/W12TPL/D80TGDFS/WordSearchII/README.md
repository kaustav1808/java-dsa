# 212. Word Search II

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/word-search-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-109

**Where it fits:** Week 12 - Tries & Prefix Lookups → Day 80 - Trie + grid DFS (SCRUM-109)

## Problem statement

Given an m x n board of letters and a list of words, return every word from the list that can be traced on the board through horizontally or vertically adjacent cells, without reusing a cell within one word.

## Examples

- `board = [[o,a,a,n],[e,t,a,e],[i,h,k,r],[i,f,l,v]], words = ["oath","pea","eat","rain"] -> ["eat","oath"]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Build a trie of the words and run one DFS per cell that walks the trie; prune finished branches.

</details>

## Files in this package

- `WordSearchII.java`: the LeetCode method/class signature, write your solution here.
- `WordSearchIITest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
