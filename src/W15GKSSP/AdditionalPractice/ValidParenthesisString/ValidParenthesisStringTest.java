package W15GKSSP.AdditionalPractice.ValidParenthesisString;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 678. Valid Parenthesis String
 * https://leetcode.com/problems/valid-parenthesis-string/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("678. Valid Parenthesis String")
public class ValidParenthesisStringTest {

    @Test
    @DisplayName("Example 1: s = \"()\" -> true")
    void example1() {
        String s = "()";
        boolean expected = true;
        boolean actual = new ValidParenthesisString().checkValidString(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"(*)\" -> true")
    void example2() {
        String s = "(*)";
        boolean expected = true;
        boolean actual = new ValidParenthesisString().checkValidString(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"(*))\" -> true")
    void example3() {
        String s = "(*))";
        boolean expected = true;
        boolean actual = new ValidParenthesisString().checkValidString(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 4: s = \"(\" -> false")
    void example4() {
        String s = "(";
        boolean expected = false;
        boolean actual = new ValidParenthesisString().checkValidString(s);

        assertEquals(expected, actual);
    }
}
