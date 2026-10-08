# 126. Word Ladder II

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/word-ladder-ii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-28

**Where it fits:** Week 19 - Interview Simulation: Advanced Graphs → Additional practice (SCRUM-28)

## Problem statement

A transformation sequence from `beginWord` to `endWord` changes one letter at a time, and every intermediate word must be in `wordList` (beginWord itself need not be). Return all of the shortest transformation sequences, each as a list of words starting with beginWord and ending with endWord. Return an empty list if none exists.

## Examples

- `beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"] -> [["hit","hot","dot","dog","cog"], ["hit","hot","lot","log","cog"]]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- BFS level by level to build a parent graph limited to shortest distances, then DFS/backtrack from endWord to list paths.

</details>

## Files in this package

- `WordLadderII.java`: the LeetCode method/class signature, write your solution here.
- `WordLadderIITest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
