package W142DDP.AdditionalPractice.MinimumPathSum;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 64. Minimum Path Sum
 * https://leetcode.com/problems/minimum-path-sum/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("64. Minimum Path Sum")
public class MinimumPathSumTest {

    @Test
    @DisplayName("Example 1: grid = [[1,3,1],[1,5,1],[4,2,1]] -> 7")
    void example1() {
        int[][] grid = new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int expected = 7;
        int actual = new MinimumPathSum().minPathSum(grid);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: grid = [[1,2,3],[4,5,6]] -> 12")
    void example2() {
        int[][] grid = new int[][] {{1, 2, 3}, {4, 5, 6}};
        int expected = 12;
        int actual = new MinimumPathSum().minPathSum(grid);

        assertEquals(expected, actual);
    }
}
