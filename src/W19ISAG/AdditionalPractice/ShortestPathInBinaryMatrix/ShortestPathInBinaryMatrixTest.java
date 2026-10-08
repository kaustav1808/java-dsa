package W19ISAG.AdditionalPractice.ShortestPathInBinaryMatrix;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1091. Shortest Path in Binary Matrix
 * https://leetcode.com/problems/shortest-path-in-binary-matrix/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1091. Shortest Path in Binary Matrix")
public class ShortestPathInBinaryMatrixTest {

    @Test
    @DisplayName("Example 1: grid = [[0,1],[1,0]] -> 2")
    void example1() {
        int[][] grid = new int[][] {{0, 1}, {1, 0}};
        int expected = 2;
        int actual = new ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(grid);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: grid = [[0,0,0],[1,1,0],[1,1,0]] -> 4")
    void example2() {
        int[][] grid = new int[][] {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int expected = 4;
        int actual = new ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(grid);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: grid = [[1,0,0],[1,1,0],[1,1,0]] -> -1")
    void example3() {
        int[][] grid = new int[][] {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int expected = -1;
        int actual = new ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(grid);

        assertEquals(expected, actual);
    }
}
