# 190. Reverse Bits

**Difficulty:** Easy · **Source:** LeetCode · ★ Blind 75 / NeetCode 150 (do not skip)

## Links

- LeetCode: https://leetcode.com/problems/reverse-bits/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-21

**Where it fits:** Week 12 - Tries & Prefix Lookups → Additional practice (SCRUM-21)

## Problem statement

Reverse the bit order of a 32-bit unsigned integer (bit 0 becomes bit 31 and so on) and return the result. In Java, treat the int as unsigned.

## Examples

- `n = 0b00000000000000000000000000001011 (11) -> 0b11010000000000000000000000000000`

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Loop 32 times: result = (result << 1) | (n & 1); n >>>= 1.

</details>

## Files in this package

- `ReverseBits.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `ReverseBitsTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
