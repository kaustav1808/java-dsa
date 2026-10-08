# 648. Replace Words

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/replace-words/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-111

**Where it fits:** Week 12 - Tries & Prefix Lookups → Day 82 - Trie for prefix replacement (SCRUM-111)

## Problem statement

A dictionary contains 'roots'. In a sentence, replace every word that starts with a root by the shortest root it starts with; leave other words unchanged. Return the new sentence.

## Examples

- `dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery" -> "the cat was rat by the bat"`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Insert roots into a trie; for each word walk the trie and stop at the first end-of-word node.

</details>

## Files in this package

- `ReplaceWords.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ReplaceWordsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
