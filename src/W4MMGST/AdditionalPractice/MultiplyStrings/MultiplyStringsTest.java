package W4MMGST.AdditionalPractice.MultiplyStrings;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 43. Multiply Strings
 * https://leetcode.com/problems/multiply-strings/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("43. Multiply Strings")
public class MultiplyStringsTest {

    @Test
    @DisplayName("Example 1: num1 = \"2\", num2 = \"3\" -> \"6\"")
    void example1() {
        String num1 = "2";
        String num2 = "3";
        String expected = "6";
        String actual = new MultiplyStrings().multiply(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: num1 = \"123\", num2 = \"456\" -> \"56088\"")
    void example2() {
        String num1 = "123";
        String num2 = "456";
        String expected = "56088";
        String actual = new MultiplyStrings().multiply(num1, num2);

        assertEquals(expected, actual);
    }
}
