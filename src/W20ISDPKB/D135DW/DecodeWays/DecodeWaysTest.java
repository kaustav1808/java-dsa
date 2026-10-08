package W20ISDPKB.D135DW.DecodeWays;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 91. Decode Ways
 * https://leetcode.com/problems/decode-ways/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("91. Decode Ways")
public class DecodeWaysTest {

    @Test
    @DisplayName("Example 1: s = \"12\" -> 2")
    void example1() {
        String s = "12";
        int expected = 2;
        int actual = new DecodeWays().numDecodings(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"226\" -> 3")
    void example2() {
        String s = "226";
        int expected = 3;
        int actual = new DecodeWays().numDecodings(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"06\" -> 0")
    void example3() {
        String s = "06";
        int expected = 0;
        int actual = new DecodeWays().numDecodings(s);

        assertEquals(expected, actual);
    }
}
