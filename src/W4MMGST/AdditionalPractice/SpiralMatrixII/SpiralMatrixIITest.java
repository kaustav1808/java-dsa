package W4MMGST.AdditionalPractice.SpiralMatrixII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 59. Spiral Matrix II
 * https://leetcode.com/problems/spiral-matrix-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("59. Spiral Matrix II")
public class SpiralMatrixIITest {

    @Test
    @DisplayName("Example 1: n = 3 -> [[1,2,3],[8,9,4],[7,6,5]]")
    void example1() {
        int n = 3;
        int[][] expected = new int[][] {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        int[][] actual = new SpiralMatrixII().generateMatrix(n);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 1 -> [[1]]")
    void example2() {
        int n = 1;
        int[][] expected = new int[][] {{1}};
        int[][] actual = new SpiralMatrixII().generateMatrix(n);

        assertArrayEquals(expected, actual);
    }
}
