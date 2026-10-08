package W6HSMS.D38MSAMD.ValidParentheses;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("20. Valid Parentheses")
public class ValidParenthesesTest {

    @Test
    @DisplayName("Example 1: s = \"()\" -> true")
    void example1() {
        String s = "()";
        boolean expected = true;
        boolean actual = new ValidParentheses().isValid(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"()[]{}\" -> true")
    void example2() {
        String s = "()[]{}";
        boolean expected = true;
        boolean actual = new ValidParentheses().isValid(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"(]\" -> false")
    void example3() {
        String s = "(]";
        boolean expected = false;
        boolean actual = new ValidParentheses().isValid(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 4: s = \"([])\" -> true")
    void example4() {
        String s = "([])";
        boolean expected = true;
        boolean actual = new ValidParentheses().isValid(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 5: s = \"([)]\" -> false")
    void example5() {
        String s = "([)]";
        boolean expected = false;
        boolean actual = new ValidParentheses().isValid(s);

        assertEquals(expected, actual);
    }
}
