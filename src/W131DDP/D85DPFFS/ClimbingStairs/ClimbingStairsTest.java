package W131DDP.D85DPFFS.ClimbingStairs;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("70. Climbing Stairs")
public class ClimbingStairsTest {

    @Test
    @DisplayName("Example 1: n = 2 -> 2")
    void example1() {
        int n = 2;
        int expected = 2;
        int actual = new ClimbingStairs().climbStairs(n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 3 -> 3")
    void example2() {
        int n = 3;
        int expected = 3;
        int actual = new ClimbingStairs().climbStairs(n);

        assertEquals(expected, actual);
    }
}
