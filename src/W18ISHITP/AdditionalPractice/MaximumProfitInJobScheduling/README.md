# 1235. Maximum Profit in Job Scheduling

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/maximum-profit-in-job-scheduling/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-27

**Where it fits:** Week 18 - Interview Simulation: Heaps, Intervals & Tree Paths → Additional practice (SCRUM-27)

## Problem statement

Each job has a startTime, endTime and profit. Choose a set of jobs with no overlapping time ranges to maximise total profit; a job may start exactly when another ends. Return the maximum profit.

## Examples

- `startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70] -> 120`
- `startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4] -> 6`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Sort by end time; dp[i] = max(dp[i-1], profit[i] + dp[last job ending <= start[i]]) found by binary search.

</details>

## Files in this package

- `MaximumProfitInJobScheduling.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `MaximumProfitInJobSchedulingTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
