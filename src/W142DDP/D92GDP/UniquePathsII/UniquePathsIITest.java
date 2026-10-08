package W142DDP.D92GDP.UniquePathsII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 63. Unique Paths II
 * https://leetcode.com/problems/unique-paths-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("63. Unique Paths II")
public class UniquePathsIITest {

    @Test
    @DisplayName("Example 1: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]] -> 2")
    void example1() {
        int[][] obstacleGrid = new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int expected = 2;
        int actual = new UniquePathsII().uniquePathsWithObstacles(obstacleGrid);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: obstacleGrid = [[0,1],[0,0]] -> 1")
    void example2() {
        int[][] obstacleGrid = new int[][] {{0, 1}, {0, 0}};
        int expected = 1;
        int actual = new UniquePathsII().uniquePathsWithObstacles(obstacleGrid);

        assertEquals(expected, actual);
    }
}
