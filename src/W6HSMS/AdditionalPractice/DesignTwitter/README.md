# 355. Design Twitter

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/design-twitter/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-15

**Where it fits:** Week 6 - Heaps, Stacks & Monotonic Structures → Additional practice (SCRUM-15)

## Problem statement

Design a simplified Twitter: users can post tweets (with unique ids), follow and unfollow other users, and fetch their news feed: the 10 most recent tweet ids posted by themselves or anyone they follow, newest first.

## Examples

- `postTweet(1, 5), getNewsFeed(1) -> [5], follow(1, 2), postTweet(2, 6), getNewsFeed(1) -> [6, 5], unfollow(1, 2), getNewsFeed(1) -> [5]`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Store each user's tweets with a global timestamp; merge followees' lists with a max-heap (k-way merge) to get 10 items.

</details>

## Files in this package

- `Twitter.java`: the LeetCode method/class signature, write your solution here.
- `TwitterTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
