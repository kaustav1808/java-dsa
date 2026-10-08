package W16WGMST.AdditionalPractice.SwimInRisingWater;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 778. Swim in Rising Water
 * https://leetcode.com/problems/swim-in-rising-water/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("778. Swim in Rising Water")
public class SwimInRisingWaterTest {

    @Test
    @DisplayName("Example 1: grid = [[0,2],[1,3]] -> 3")
    void example1() {
        int[][] grid = new int[][] {{0, 2}, {1, 3}};
        int expected = 3;
        int actual = new SwimInRisingWater().swimInWater(grid);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: grid = [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]] -> 16")
    void example2() {
        int[][] grid = new int[][] {
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}
        };
        int expected = 16;
        int actual = new SwimInRisingWater().swimInWater(grid);

        assertEquals(expected, actual);
    }
}
