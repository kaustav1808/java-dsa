# 269. Alien Dictionary

**Difficulty:** Hard · **Source:** LeetCode Premium (paid)

## Links

- LeetCode: https://leetcode.com/problems/alien-dictionary/ (requires LeetCode Premium)
- NeetCode (free): https://neetcode.io/problems/foreign-dictionary/question
- GeeksforGeeks (free): https://www.geeksforgeeks.org/problems/alien-dictionary/1
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-102

**Where it fits:** Week 11 - Topological Sort & Dependency Graphs → Day 73 - Alien Dictionary (SCRUM-102)

## Problem statement

(LeetCode Premium) A new alien language uses lowercase English letters in an unknown order. You are given a list of words that is sorted according to that alien alphabet. Derive a possible order of the letters that appear and return it as a string. If the input is inconsistent (no valid order exists) return "". If several orders are valid, any one is accepted.

## Examples

- `words = ["wrt","wrf","er","ett","rftt"] -> "wertf"`
- `words = ["z","x","z"] -> "" (cycle)`
- `words = ["abc","ab"] -> "" (a longer word cannot come before its own prefix)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Compare adjacent words to get one edge from the first differing letter; then topological sort the letters.

</details>

## Files in this package

- `AlienDictionary.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `AlienDictionaryTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
