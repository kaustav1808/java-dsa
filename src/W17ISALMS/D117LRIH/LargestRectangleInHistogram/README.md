# 84. Largest Rectangle in Histogram

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/largest-rectangle-in-histogram/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-146

**Where it fits:** Week 17 - Interview Simulation: Arrays, Lists & Monotonic Structures → Day 117 - Largest Rectangle in Histogram (SCRUM-146)

## Problem statement

Given an array of bar heights for a histogram where every bar has width 1, return the area of the largest rectangle that fits entirely inside the histogram.

## Examples

- `heights = [2, 1, 5, 6, 2, 3] -> 10  (bars 5 and 6, height 5, width 2)`
- `heights = [2, 4] -> 4`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Monotonic increasing stack: when a bar is popped, its width extends between the new stack top and the current index.

</details>

## Files in this package

- `LargestRectangleInHistogram.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `LargestRectangleInHistogramTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
