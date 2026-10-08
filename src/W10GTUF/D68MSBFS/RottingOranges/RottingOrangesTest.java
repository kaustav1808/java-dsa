package W10GTUF.D68MSBFS.RottingOranges;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 994. Rotting Oranges
 * https://leetcode.com/problems/rotting-oranges/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("994. Rotting Oranges")
public class RottingOrangesTest {

    @Test
    @DisplayName("Example 1: grid = [[2,1,1],[1,1,0],[0,1,1]] -> 4")
    void example1() {
        int[][] grid = new int[][] {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int expected = 4;
        int actual = new RottingOranges().orangesRotting(grid);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: grid = [[2,1,1],[0,1,1],[1,0,1]] -> -1")
    void example2() {
        int[][] grid = new int[][] {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int expected = -1;
        int actual = new RottingOranges().orangesRotting(grid);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: grid = [[0,2]] -> 0")
    void example3() {
        int[][] grid = new int[][] {{0, 2}};
        int expected = 0;
        int actual = new RottingOranges().orangesRotting(grid);

        assertEquals(expected, actual);
    }
}
