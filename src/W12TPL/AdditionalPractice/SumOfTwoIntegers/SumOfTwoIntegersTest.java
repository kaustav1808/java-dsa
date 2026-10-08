package W12TPL.AdditionalPractice.SumOfTwoIntegers;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 371. Sum of Two Integers
 * https://leetcode.com/problems/sum-of-two-integers/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("371. Sum of Two Integers")
public class SumOfTwoIntegersTest {

    @Test
    @DisplayName("Example 1: a = 1, b = 2 -> 3")
    void example1() {
        int a = 1;
        int b = 2;
        int expected = 3;
        int actual = new SumOfTwoIntegers().getSum(a, b);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: a = 2, b = 3 -> 5")
    void example2() {
        int a = 2;
        int b = 3;
        int expected = 5;
        int actual = new SumOfTwoIntegers().getSum(a, b);

        assertEquals(expected, actual);
    }
}
