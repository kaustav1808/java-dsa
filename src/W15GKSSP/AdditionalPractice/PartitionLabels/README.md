# 763. Partition Labels

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/partition-labels/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-24

**Where it fits:** Week 15 - Greedy & Kadane-Style Subarray Patterns → Additional practice (SCRUM-24)

## Problem statement

Partition a string into as many parts as possible so that each letter appears in at most one part. Return the sizes of the parts in order.

## Examples

- `s = "ababcbacadefegdehijhklij" -> [9, 7, 8]`
- `s = "eccbbbbdec" -> [10]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Record the last index of each letter; extend the current part's end to the max last index seen and cut when i reaches it.

</details>

## Files in this package

- `PartitionLabels.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `PartitionLabelsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
