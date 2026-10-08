# 1268. Search Suggestions System

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/search-suggestions-system/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-21

**Where it fits:** Week 12 - Tries & Prefix Lookups → Additional practice (SCRUM-21)

## Problem statement

Given a list of products and a searchWord, after each character typed suggest at most three products that start with the typed prefix, choosing the alphabetically smallest ones. Return the list of suggestion lists, one per typed character.

## Examples

- `products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse" -> [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]`

## Board note

Trie.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sort products and binary search for each prefix, or a trie whose nodes keep up to 3 sorted suggestions.

</details>

## Files in this package

- `SearchSuggestionsSystem.java`: the LeetCode method/class signature, write your solution here.
- `SearchSuggestionsSystemTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
