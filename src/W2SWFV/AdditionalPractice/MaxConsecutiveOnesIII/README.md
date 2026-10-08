# 1004. Max Consecutive Ones III

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/max-consecutive-ones-iii/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-11

**Where it fits:** Week 2 - Sliding Window (Fixed & Variable) → Additional practice (SCRUM-11)

## Problem statement

Given a binary array and an integer k, return the maximum number of consecutive 1s you can get if you are allowed to flip at most k zeros to ones.

## Examples

- `nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2 -> 6`
- `nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3 -> 10`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sliding window that holds at most k zeros.

</details>

## Files in this package

- `MaxConsecutiveOnesIII.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MaxConsecutiveOnesIIITest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
