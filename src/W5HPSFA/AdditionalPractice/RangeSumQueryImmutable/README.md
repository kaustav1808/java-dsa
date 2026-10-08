# 303. Range Sum Query - Immutable

**Difficulty:** Easy · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/range-sum-query-immutable/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-14

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Additional practice (SCRUM-14)

## Problem statement

Given an integer array, answer many queries sumRange(left, right): the sum of elements from index left to right inclusive. The array never changes.

## Examples

- `nums = [-2, 0, 3, -5, 2, -1]: sumRange(0, 2) -> 1, sumRange(2, 5) -> -1, sumRange(0, 5) -> -3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Precompute prefix sums; each query is prefix[right + 1] - prefix[left].

</details>

## Files in this package

- `RangeSumQueryImmutable.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `RangeSumQueryImmutableTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
