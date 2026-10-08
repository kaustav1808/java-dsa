# 721. Accounts Merge

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/accounts-merge/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-19

**Where it fits:** Week 10 - Graph Traversal & Union-Find → Additional practice (SCRUM-19)

## Problem statement

Each account is a list whose first element is a name and the rest are email addresses. Two accounts belong to the same person if they share any email (people with the same name may be different). Merge the accounts and return each person's name followed by their emails in sorted order.

## Examples

- `[["John","a@x","b@x"],["John","b@x","c@x"],["Mary","m@x"]] -> [["John","a@x","b@x","c@x"],["Mary","m@x"]]`

## Board note

DSU on strings.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Union-Find on emails (union all emails within an account), then group emails by root.

</details>

## Files in this package

- `AccountsMerge.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `AccountsMergeTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
