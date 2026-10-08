package W142DDP.D96PSS.LongestPalindromicSubstring;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("5. Longest Palindromic Substring")
public class LongestPalindromicSubstringTest {

    @Test
    @DisplayName("Example 1: s = \"babad\" -> \"bab\"")
    void example1() {
        String s = "babad";
        String expected = "bab";
        String actual = new LongestPalindromicSubstring().longestPalindrome(s);

        assertTrue(TestUtil.safe(() -> TestUtil.isLongestPalindrome(s, actual, expected.length())), () -> "expected a longest palindromic substring, e.g. \"bab\" but got " + TestUtil.str(actual));
    }

    @Test
    @DisplayName("Example 2: s = \"cbbd\" -> \"bb\"")
    void example2() {
        String s = "cbbd";
        String expected = "bb";
        String actual = new LongestPalindromicSubstring().longestPalindrome(s);

        assertTrue(TestUtil.safe(() -> TestUtil.isLongestPalindrome(s, actual, expected.length())), () -> "expected a longest palindromic substring, e.g. \"bb\" but got " + TestUtil.str(actual));
    }
}
