package W131DDP.D85DPFFS.MinCostClimbingStairs;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 746. Min Cost Climbing Stairs
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("746. Min Cost Climbing Stairs")
public class MinCostClimbingStairsTest {

    @Test
    @DisplayName("Example 1: cost = [10,15,20] -> 15")
    void example1() {
        int[] cost = new int[] {10, 15, 20};
        int expected = 15;
        int actual = new MinCostClimbingStairs().minCostClimbingStairs(cost);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: cost = [1,100,1,1,1,100,1,1,100,1] -> 6")
    void example2() {
        int[] cost = new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
        int actual = new MinCostClimbingStairs().minCostClimbingStairs(cost);

        assertEquals(expected, actual);
    }
}
