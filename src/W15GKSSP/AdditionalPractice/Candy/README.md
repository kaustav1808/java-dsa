# 135. Candy

**Difficulty:** Hard · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/candy/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-24

**Where it fits:** Week 15 - Greedy & Kadane-Style Subarray Patterns → Additional practice (SCRUM-24)

## Problem statement

Children stand in a line, each with a rating. Give each child at least one candy, and any child with a higher rating than an immediate neighbour must get more candies than that neighbour. Return the minimum total number of candies.

## Examples

- `ratings = [1, 0, 2] -> 5  (2, 1, 2)`
- `ratings = [1, 2, 2] -> 4  (1, 2, 1)`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Two passes: left-to-right for the left neighbour rule, right-to-left for the right neighbour rule, take the max.

</details>

## Files in this package

- `Candy.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `CandyTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
