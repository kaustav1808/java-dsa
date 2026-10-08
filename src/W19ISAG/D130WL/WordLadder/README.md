# 127. Word Ladder

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/word-ladder/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-159

**Where it fits:** Week 19 - Interview Simulation: Advanced Graphs → Day 130 - Word Ladder (SCRUM-159)

## Problem statement

Using the same rules as above (change one letter at a time, every intermediate word must be in `wordList`), return the number of words in the shortest transformation sequence from `beginWord` to `endWord`, counting both ends, or 0 if it is impossible.

## Examples

- `beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"] -> 5`
- `same, but without "cog" in wordList -> 0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- BFS over words; generate neighbours by trying all 26 letters in each position (or use wildcard pattern buckets).

</details>

## Files in this package

- `WordLadder.java`: the LeetCode method/class signature, write your solution here.
- `WordLadderTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
