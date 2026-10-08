package W10GTUF.AdditionalPractice.MaxAreaOfIsland;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 695. Max Area of Island
 * https://leetcode.com/problems/max-area-of-island/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("695. Max Area of Island")
public class MaxAreaOfIslandTest {

    @Test
    @DisplayName("Example 1: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,... -> 6")
    void example1() {
        int[][] grid = new int[][] {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        int expected = 6;
        int actual = new MaxAreaOfIsland().maxAreaOfIsland(grid);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: grid = [[0,0,0,0,0,0,0,0]] -> 0")
    void example2() {
        int[][] grid = new int[][] {{0, 0, 0, 0, 0, 0, 0, 0}};
        int expected = 0;
        int actual = new MaxAreaOfIsland().maxAreaOfIsland(grid);

        assertEquals(expected, actual);
    }
}
