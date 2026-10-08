# 692. Top K Frequent Words

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/top-k-frequent-words/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-27

**Where it fits:** Week 18 - Interview Simulation: Heaps, Intervals & Tree Paths → Additional practice (SCRUM-27)

## Problem statement

Given an array of words and k, return the k most frequent words, sorted by frequency from highest to lowest; words with equal frequency are sorted alphabetically.

## Examples

- `words = ["i","love","leetcode","i","love","coding"], k = 2 -> ["i","love"]`
- `words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4 -> ["the","is","sunny","day"]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Count with a HashMap; use a size-k min-heap whose comparator puts lower frequency (then alphabetically larger) on top.

</details>

## Files in this package

- `TopKFrequentWords.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `TopKFrequentWordsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
