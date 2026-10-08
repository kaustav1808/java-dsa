package W4MMGST.AdditionalPractice.SearchA2DMatrixII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 240. Search a 2D Matrix II
 * https://leetcode.com/problems/search-a-2d-matrix-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("240. Search a 2D Matrix II")
public class SearchA2DMatrixIITest {

    @Test
    @DisplayName("Example 1: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5 -> true")
    void example1() {
        int[][] matrix = new int[][] {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        boolean expected = true;
        boolean actual = new SearchA2DMatrixII().searchMatrix(matrix, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20 -> false")
    void example2() {
        int[][] matrix = new int[][] {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 20;
        boolean expected = false;
        boolean actual = new SearchA2DMatrixII().searchMatrix(matrix, target);

        assertEquals(expected, actual);
    }
}
