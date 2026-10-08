package W4MMGST.D22MRIP.RotateImage;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 48. Rotate Image
 * https://leetcode.com/problems/rotate-image/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("48. Rotate Image")
public class RotateImageTest {

    @Test
    @DisplayName("Example 1: matrix = [[1,2,3],[4,5,6],[7,8,9]] -> [[7,4,1],[8,5,2],[9,6,3]]")
    void example1() {
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        new RotateImage().rotate(matrix);
        int[][] actual = matrix; // rotate changes matrix in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]] -> [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]")
    void example2() {
        int[][] matrix = new int[][] {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] expected = new int[][] {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        new RotateImage().rotate(matrix);
        int[][] actual = matrix; // rotate changes matrix in place

        assertArrayEquals(expected, actual);
    }
}
