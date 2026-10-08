# 703. Kth Largest Element in a Stream

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/kth-largest-element-in-a-stream/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-65

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Day 36 - PriorityQueue and top-K (SCRUM-65)

## Problem statement

Design a class that is constructed with k and an initial array, and whose add(val) method adds a value to the stream and returns the current k-th largest element.

## Examples

- `k = 3, nums = [4, 5, 8, 2]: add(3) -> 4, add(5) -> 5, add(10) -> 5, add(9) -> 8, add(4) -> 8`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Keep a min-heap of the k largest values; its top is the answer.

</details>

## Files in this package

- `KthLargest.java`: the LeetCode method/class signature, write your solution here.
- `KthLargestTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
