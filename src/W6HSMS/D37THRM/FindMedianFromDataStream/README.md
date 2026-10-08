# 295. Find Median from Data Stream

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-median-from-data-stream/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-66

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Day 37 - Two heaps: running median (SCRUM-66)

## Problem statement

Design a structure that receives a stream of integers and can report the median of all numbers added so far. Support `addNum(num)` and `findMedian()`; for an even count the median is the average of the two middle values.

## Examples

- `addNum(1), addNum(2), findMedian() -> 1.5, addNum(3), findMedian() -> 2.0`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Two heaps: a max-heap for the lower half and a min-heap for the upper half, kept balanced in size.

</details>

## Files in this package

- `MedianFinder.java`: the LeetCode method/class signature, write your solution here.
- `MedianFinderTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
