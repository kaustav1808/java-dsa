package W20ISDPKB.AdditionalPractice.WildcardMatching;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 44. Wildcard Matching
 * https://leetcode.com/problems/wildcard-matching/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("44. Wildcard Matching")
public class WildcardMatchingTest {

    @Test
    @DisplayName("Example 1: s = \"aa\", p = \"a\" -> false")
    void example1() {
        String s = "aa";
        String p = "a";
        boolean expected = false;
        boolean actual = new WildcardMatching().isMatch(s, p);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"aa\", p = \"*\" -> true")
    void example2() {
        String s = "aa";
        String p = "*";
        boolean expected = true;
        boolean actual = new WildcardMatching().isMatch(s, p);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"cb\", p = \"?a\" -> false")
    void example3() {
        String s = "cb";
        String p = "?a";
        boolean expected = false;
        boolean actual = new WildcardMatching().isMatch(s, p);

        assertEquals(expected, actual);
    }
}
