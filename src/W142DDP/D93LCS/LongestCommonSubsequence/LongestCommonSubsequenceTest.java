package W142DDP.D93LCS.LongestCommonSubsequence;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1143. Longest Common Subsequence
 * https://leetcode.com/problems/longest-common-subsequence/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1143. Longest Common Subsequence")
public class LongestCommonSubsequenceTest {

    @Test
    @DisplayName("Example 1: text1 = \"abcde\", text2 = \"ace\" -> 3")
    void example1() {
        String text1 = "abcde";
        String text2 = "ace";
        int expected = 3;
        int actual = new LongestCommonSubsequence().longestCommonSubsequence(text1, text2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: text1 = \"abc\", text2 = \"abc\" -> 3")
    void example2() {
        String text1 = "abc";
        String text2 = "abc";
        int expected = 3;
        int actual = new LongestCommonSubsequence().longestCommonSubsequence(text1, text2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: text1 = \"abc\", text2 = \"def\" -> 0")
    void example3() {
        String text1 = "abc";
        String text2 = "def";
        int expected = 0;
        int actual = new LongestCommonSubsequence().longestCommonSubsequence(text1, text2);

        assertEquals(expected, actual);
    }
}
