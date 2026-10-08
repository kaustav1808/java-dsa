package W131DDP.AdditionalPractice.PalindromicSubstrings;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 647. Palindromic Substrings
 * https://leetcode.com/problems/palindromic-substrings/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("647. Palindromic Substrings")
public class PalindromicSubstringsTest {

    @Test
    @DisplayName("Example 1: s = \"abc\" -> 3")
    void example1() {
        String s = "abc";
        int expected = 3;
        int actual = new PalindromicSubstrings().countSubstrings(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"aaa\" -> 6")
    void example2() {
        String s = "aaa";
        int expected = 6;
        int actual = new PalindromicSubstrings().countSubstrings(s);

        assertEquals(expected, actual);
    }
}
