package W2SWFV.D12MWWMCC.MinimumWindowSubstring;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 76. Minimum Window Substring
 * https://leetcode.com/problems/minimum-window-substring/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("76. Minimum Window Substring")
public class MinimumWindowSubstringTest {

    @Test
    @DisplayName("Example 1: s = \"ADOBECODEBANC\", t = \"ABC\" -> \"BANC\"")
    void example1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String expected = "BANC";
        String actual = new MinimumWindowSubstring().minWindow(s, t);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"a\", t = \"a\" -> \"a\"")
    void example2() {
        String s = "a";
        String t = "a";
        String expected = "a";
        String actual = new MinimumWindowSubstring().minWindow(s, t);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"a\", t = \"aa\" -> \"\"")
    void example3() {
        String s = "a";
        String t = "aa";
        String expected = "";
        String actual = new MinimumWindowSubstring().minWindow(s, t);

        assertEquals(expected, actual);
    }
}
