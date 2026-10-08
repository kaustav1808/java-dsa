# 886. Possible Bipartition

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/possible-bipartition/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-28

**Where it fits:** Week 19 - Interview Simulation: Advanced Graphs → Additional practice (SCRUM-28)

## Problem statement

n people (labelled 1..n) must be split into two groups. dislikes[i] = [a, b] means a and b must not be in the same group. Return true if such a split is possible.

## Examples

- `n = 4, dislikes = [[1,2],[1,3],[2,4]] -> true  ({1,4}, {2,3})`
- `n = 3, dislikes = [[1,2],[1,3],[2,3]] -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- It is a bipartite check: two-colour the dislike graph with BFS/DFS or Union-Find.

</details>

## Files in this package

- `PossibleBipartition.java`: the LeetCode method/class signature, write your solution here.
- `PossibleBipartitionTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
