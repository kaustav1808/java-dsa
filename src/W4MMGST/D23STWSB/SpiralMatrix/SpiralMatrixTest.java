package W4MMGST.D23STWSB.SpiralMatrix;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 54. Spiral Matrix
 * https://leetcode.com/problems/spiral-matrix/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("54. Spiral Matrix")
public class SpiralMatrixTest {

    @Test
    @DisplayName("Example 1: matrix = [[1,2,3],[4,5,6],[7,8,9]] -> [1,2,3,6,9,8,7,4,5]")
    void example1() {
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> expected = list(1, 2, 3, 6, 9, 8, 7, 4, 5);
        List<Integer> actual = new SpiralMatrix().spiralOrder(matrix);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]] -> [1,2,3,4,8,12,11,10,9,5,6,7]")
    void example2() {
        int[][] matrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> expected = list(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        List<Integer> actual = new SpiralMatrix().spiralOrder(matrix);

        assertEquals(expected, actual);
    }
}
