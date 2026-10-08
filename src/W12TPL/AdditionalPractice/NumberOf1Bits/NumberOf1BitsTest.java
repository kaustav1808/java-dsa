package W12TPL.AdditionalPractice.NumberOf1Bits;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 191. Number of 1 Bits
 * https://leetcode.com/problems/number-of-1-bits/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("191. Number of 1 Bits")
public class NumberOf1BitsTest {

    @Test
    @DisplayName("Example 1: n = 11 -> 3")
    void example1() {
        int n = 11;
        int expected = 3;
        int actual = new NumberOf1Bits().hammingWeight(n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 128 -> 1")
    void example2() {
        int n = 128;
        int expected = 1;
        int actual = new NumberOf1Bits().hammingWeight(n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: n = 2147483645 -> 30")
    void example3() {
        int n = 2147483645;
        int expected = 30;
        int actual = new NumberOf1Bits().hammingWeight(n);

        assertEquals(expected, actual);
    }
}
