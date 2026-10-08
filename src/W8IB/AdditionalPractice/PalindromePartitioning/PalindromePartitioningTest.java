package W8IB.AdditionalPractice.PalindromePartitioning;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 131. Palindrome Partitioning
 * https://leetcode.com/problems/palindrome-partitioning/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("131. Palindrome Partitioning")
public class PalindromePartitioningTest {

    @Test
    @DisplayName("Example 1: s = \"aab\" -> [[\"a\",\"a\",\"b\"],[\"aa\",\"b\"]]")
    void example1() {
        String s = "aab";
        List<List<String>> expected = list(list("a", "a", "b"), list("aa", "b"));
        List<List<String>> actual = new PalindromePartitioning().partition(s);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }

    @Test
    @DisplayName("Example 2: s = \"a\" -> [[\"a\"]]")
    void example2() {
        String s = "a";
        List<List<String>> expected = list(list("a"));
        List<List<String>> actual = new PalindromePartitioning().partition(s);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }
}
