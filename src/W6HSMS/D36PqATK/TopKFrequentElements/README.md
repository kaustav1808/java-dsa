# 347. Top K Frequent Elements

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/top-k-frequent-elements/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-65

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Day 36 - PriorityQueue and top-K (SCRUM-65)

## Problem statement

Given an integer array and k, return the k most frequent elements, in any order. The answer is guaranteed to be unique.

## Examples

- `nums = [1, 1, 1, 2, 2, 3], k = 2 -> [1, 2]`
- `nums = [4], k = 1 -> [4]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Count with a HashMap, then a size-k min-heap or bucket sort by frequency (O(n)).

</details>

## Files in this package

- `TopKFrequentElements.java`: the LeetCode method/class signature, write your solution here.
- `TopKFrequentElementsTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
