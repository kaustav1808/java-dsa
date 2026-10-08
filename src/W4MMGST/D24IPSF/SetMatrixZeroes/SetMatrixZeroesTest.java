package W4MMGST.D24IPSF.SetMatrixZeroes;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 73. Set Matrix Zeroes
 * https://leetcode.com/problems/set-matrix-zeroes/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("73. Set Matrix Zeroes")
public class SetMatrixZeroesTest {

    @Test
    @DisplayName("Example 1: matrix = [[1,1,1],[1,0,1],[1,1,1]] -> [[1,0,1],[0,0,0],[1,0,1]]")
    void example1() {
        int[][] matrix = new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = new int[][] {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        new SetMatrixZeroes().setZeroes(matrix);
        int[][] actual = matrix; // setZeroes changes matrix in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]] -> [[0,0,0,0],[0,4,5,0],[0,3,1,0]]")
    void example2() {
        int[][] matrix = new int[][] {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] expected = new int[][] {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        new SetMatrixZeroes().setZeroes(matrix);
        int[][] actual = matrix; // setZeroes changes matrix in place

        assertArrayEquals(expected, actual);
    }
}
