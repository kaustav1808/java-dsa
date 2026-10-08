package W16WGMST.D109DFSWMOAG.LongestIncreasingPathInAMatrix;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 329. Longest Increasing Path in a Matrix
 * https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("329. Longest Increasing Path in a Matrix")
public class LongestIncreasingPathInAMatrixTest {

    @Test
    @DisplayName("Example 1: matrix = [[9,9,4],[6,6,8],[2,1,1]] -> 4")
    void example1() {
        int[][] matrix = new int[][] {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        int expected = 4;
        int actual = new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: matrix = [[3,4,5],[3,2,6],[2,2,1]] -> 4")
    void example2() {
        int[][] matrix = new int[][] {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
        int expected = 4;
        int actual = new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: matrix = [[1]] -> 1")
    void example3() {
        int[][] matrix = new int[][] {{1}};
        int expected = 1;
        int actual = new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix);

        assertEquals(expected, actual);
    }
}
