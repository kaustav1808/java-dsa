package W7BSBSA.AdditionalPractice.SqrtX;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 69. Sqrt(x)
 * https://leetcode.com/problems/sqrtx/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("69. Sqrt(x)")
public class SqrtXTest {

    @Test
    @DisplayName("Example 1: x = 4 -> 2")
    void example1() {
        int x = 4;
        int expected = 2;
        int actual = new SqrtX().mySqrt(x);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: x = 8 -> 2")
    void example2() {
        int x = 8;
        int expected = 2;
        int actual = new SqrtX().mySqrt(x);

        assertEquals(expected, actual);
    }
}
