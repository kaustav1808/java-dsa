# 981. Time Based Key-Value Store

**Difficulty:** Medium · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/time-based-key-value-store/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-16

**Where it fits:** Week 7 - Binary Search Beyond Sorted Arrays → Additional practice (SCRUM-16)

## Problem statement

Design a time-based key-value store: set(key, value, timestamp) stores a value at a time, and get(key, timestamp) returns the value set for key at the largest timestamp less than or equal to the given one, or "" if there is none. Timestamps passed to set are strictly increasing.

## Examples

- `set("foo","bar",1), get("foo",1) -> "bar", get("foo",3) -> "bar", set("foo","bar2",4), get("foo",4) -> "bar2", get("foo",5) -> "bar2"`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- HashMap key -> list of (timestamp, value) in increasing order; binary search for the last timestamp <= t (or use a TreeMap.floorEntry).

</details>

## Files in this package

- `TimeBasedKeyValueStore.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `TimeBasedKeyValueStoreTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
