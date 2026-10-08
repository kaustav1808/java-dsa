package W17ISALMS.AdditionalPractice.LongestValidParentheses;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 32. Longest Valid Parentheses
 * https://leetcode.com/problems/longest-valid-parentheses/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("32. Longest Valid Parentheses")
public class LongestValidParenthesesTest {

    @Test
    @DisplayName("Example 1: s = \"(()\" -> 2")
    void example1() {
        String s = "(()";
        int expected = 2;
        int actual = new LongestValidParentheses().longestValidParentheses(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \")()())\" -> 4")
    void example2() {
        String s = ")()())";
        int expected = 4;
        int actual = new LongestValidParentheses().longestValidParentheses(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"\" -> 0")
    void example3() {
        String s = "";
        int expected = 0;
        int actual = new LongestValidParentheses().longestValidParentheses(s);

        assertEquals(expected, actual);
    }
}
