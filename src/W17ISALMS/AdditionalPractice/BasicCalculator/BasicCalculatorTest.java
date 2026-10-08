package W17ISALMS.AdditionalPractice.BasicCalculator;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 224. Basic Calculator
 * https://leetcode.com/problems/basic-calculator/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("224. Basic Calculator")
public class BasicCalculatorTest {

    @Test
    @DisplayName("Example 1: s = \"1 + 1\" -> 2")
    void example1() {
        String s = "1 + 1";
        int expected = 2;
        int actual = new BasicCalculator().calculate(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \" 2-1 + 2 \" -> 3")
    void example2() {
        String s = " 2-1 + 2 ";
        int expected = 3;
        int actual = new BasicCalculator().calculate(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"(1+(4+5+2)-3)+(6+8)\" -> 23")
    void example3() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int expected = 23;
        int actual = new BasicCalculator().calculate(s);

        assertEquals(expected, actual);
    }
}
