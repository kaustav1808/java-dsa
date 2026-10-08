package W20ISDPKB.D138REM.RegularExpressionMatching;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 10. Regular Expression Matching
 * https://leetcode.com/problems/regular-expression-matching/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("10. Regular Expression Matching")
public class RegularExpressionMatchingTest {

    @Test
    @DisplayName("Example 1: s = \"aa\", p = \"a\" -> false")
    void example1() {
        String s = "aa";
        String p = "a";
        boolean expected = false;
        boolean actual = new RegularExpressionMatching().isMatch(s, p);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"aa\", p = \"a*\" -> true")
    void example2() {
        String s = "aa";
        String p = "a*";
        boolean expected = true;
        boolean actual = new RegularExpressionMatching().isMatch(s, p);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"ab\", p = \".*\" -> true")
    void example3() {
        String s = "ab";
        String p = ".*";
        boolean expected = true;
        boolean actual = new RegularExpressionMatching().isMatch(s, p);

        assertEquals(expected, actual);
    }
}
