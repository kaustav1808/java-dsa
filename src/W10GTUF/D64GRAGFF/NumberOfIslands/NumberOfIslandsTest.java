package W10GTUF.D64GRAGFF.NumberOfIslands;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 200. Number of Islands
 * https://leetcode.com/problems/number-of-islands/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("200. Number of Islands")
public class NumberOfIslandsTest {

    @Test
    @DisplayName("Example 1: grid = [[\"1\",\"1\",\"1\",\"1\",\"0\"], [\"1\",\"1\",\"0\",\"1\",\"0\"], [\"1\",\"1\",\"0\",\"0\",\"0\"], [\"0\",\"0\",\"0\",\"0\",\"0\"]] -> 1")
    void example1() {
        char[][] grid = new char[][] {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int expected = 1;
        int actual = new NumberOfIslands().numIslands(grid);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: grid = [[\"1\",\"1\",\"0\",\"0\",\"0\"], [\"1\",\"1\",\"0\",\"0\",\"0\"], [\"0\",\"0\",\"1\",\"0\",\"0\"], [\"0\",\"0\",\"0\",\"1\",\"1\"]] -> 3")
    void example2() {
        char[][] grid = new char[][] {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int expected = 3;
        int actual = new NumberOfIslands().numIslands(grid);

        assertEquals(expected, actual);
    }
}
