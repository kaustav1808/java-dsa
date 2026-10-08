package W142DDP.D96PSS.LongestPalindromicSubsequence;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 516. Longest Palindromic Subsequence
 * https://leetcode.com/problems/longest-palindromic-subsequence/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("516. Longest Palindromic Subsequence")
public class LongestPalindromicSubsequenceTest {

    @Test
    @DisplayName("Example 1: s = \"bbbab\" -> 4")
    void example1() {
        String s = "bbbab";
        int expected = 4;
        int actual = new LongestPalindromicSubsequence().longestPalindromeSubseq(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"cbbd\" -> 2")
    void example2() {
        String s = "cbbd";
        int expected = 2;
        int actual = new LongestPalindromicSubsequence().longestPalindromeSubseq(s);

        assertEquals(expected, actual);
    }
}
