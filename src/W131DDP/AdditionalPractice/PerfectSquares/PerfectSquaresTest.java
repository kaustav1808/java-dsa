package W131DDP.AdditionalPractice.PerfectSquares;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 279. Perfect Squares
 * https://leetcode.com/problems/perfect-squares/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("279. Perfect Squares")
public class PerfectSquaresTest {

    @Test
    @DisplayName("Example 1: n = 12 -> 3")
    void example1() {
        int n = 12;
        int expected = 3;
        int actual = new PerfectSquares().numSquares(n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 13 -> 2")
    void example2() {
        int n = 13;
        int expected = 2;
        int actual = new PerfectSquares().numSquares(n);

        assertEquals(expected, actual);
    }
}
