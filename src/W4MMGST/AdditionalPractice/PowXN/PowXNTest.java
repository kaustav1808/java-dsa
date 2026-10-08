package W4MMGST.AdditionalPractice.PowXN;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 50. Pow(x, n)
 * https://leetcode.com/problems/powx-n/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("50. Pow(x, n)")
public class PowXNTest {

    @Test
    @DisplayName("Example 1: x = 2.00000, n = 10 -> 1024.00000")
    void example1() {
        double x = 2.0;
        int n = 10;
        double expected = 1024.0;
        double actual = new PowXN().myPow(x, n);

        assertEquals(expected, actual, 1e-5);
    }

    @Test
    @DisplayName("Example 2: x = 2.10000, n = 3 -> 9.26100")
    void example2() {
        double x = 2.1;
        int n = 3;
        double expected = 9.261;
        double actual = new PowXN().myPow(x, n);

        assertEquals(expected, actual, 1e-5);
    }

    @Test
    @DisplayName("Example 3: x = 2.00000, n = -2 -> 0.25000")
    void example3() {
        double x = 2.0;
        int n = -2;
        double expected = 0.25;
        double actual = new PowXN().myPow(x, n);

        assertEquals(expected, actual, 1e-5);
    }
}
