# 1899. Merge Triplets to Form Target Triplet

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/merge-triplets-to-form-target-triplet/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-24

**Where it fits:** Week 15 - Greedy & Kadane-Style Subarray Patterns → Additional practice (SCRUM-24)

## Problem statement

A triplet is an array of three integers. You may repeatedly pick two triplets i and j and replace triplet j with their element-wise maximum. Given the triplets and a target triplet, return true if the target can appear as one of the triplets.

## Examples

- `triplets = [[2,5,3],[1,8,4],[1,7,5]], target = [2,7,5] -> true`
- `triplets = [[3,4,5],[4,5,6]], target = [3,2,5] -> false`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Ignore any triplet with an element larger than the target's; the rest can be merged, so check that each target position is matched by some remaining triplet.

</details>

## Files in this package

- `MergeTripletsToFormTargetTriplet.java`: the LeetCode method/class signature, write your solution here.
- `MergeTripletsToFormTargetTripletTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
