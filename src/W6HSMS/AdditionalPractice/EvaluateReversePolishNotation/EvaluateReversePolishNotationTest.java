package W6HSMS.AdditionalPractice.EvaluateReversePolishNotation;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 150. Evaluate Reverse Polish Notation
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("150. Evaluate Reverse Polish Notation")
public class EvaluateReversePolishNotationTest {

    @Test
    @DisplayName("Example 1: tokens = [\"2\",\"1\",\"+\",\"3\",\"*\"] -> 9")
    void example1() {
        String[] tokens = new String[] {"2", "1", "+", "3", "*"};
        int expected = 9;
        int actual = new EvaluateReversePolishNotation().evalRPN(tokens);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: tokens = [\"4\",\"13\",\"5\",\"/\",\"+\"] -> 6")
    void example2() {
        String[] tokens = new String[] {"4", "13", "5", "/", "+"};
        int expected = 6;
        int actual = new EvaluateReversePolishNotation().evalRPN(tokens);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: tokens = [\"10\",\"6\",\"9\",\"3\",\"+\",\"-11\",\"*\",\"/\",\"*\",\"17\",\"+\",\"5\",\"+\"] -> 22")
    void example3() {
        String[] tokens = new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int expected = 22;
        int actual = new EvaluateReversePolishNotation().evalRPN(tokens);

        assertEquals(expected, actual);
    }
}
