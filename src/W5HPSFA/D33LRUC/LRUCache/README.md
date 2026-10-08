# 146. LRU Cache

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/lru-cache/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-62

**Where it fits:** Week 5 - Hashing, Prefix Sums & Frequency Analysis → Day 33 - LRU Cache (SCRUM-62)

## Problem statement

Design an LRU (least recently used) cache with a fixed capacity. `get(key)` returns the value or -1 if absent; `put(key, value)` inserts or updates the key, and if the cache exceeds capacity it evicts the least recently used key. Both operations must run in O(1) average time.

## Examples

- `capacity 2: put(1,1), put(2,2), get(1) -> 1, put(3,3) evicts key 2, get(2) -> -1, get(3) -> 3`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- HashMap key -> node plus a doubly linked list ordered by recency (or LinkedHashMap with access order).

</details>

## Files in this package

- `LRUCache.java`: the LeetCode method/class signature, write your solution here.
- `LRUCacheTest.java`: JUnit 5 tests for every official example (already written); add your own edge cases.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
