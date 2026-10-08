package W7BSBSA.D47BSIA2DM.SearchA2DMatrix;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 74. Search a 2D Matrix
 * https://leetcode.com/problems/search-a-2d-matrix/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("74. Search a 2D Matrix")
public class SearchA2DMatrixTest {

    @Test
    @DisplayName("Example 1: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3 -> true")
    void example1() {
        int[][] matrix = new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean expected = true;
        boolean actual = new SearchA2DMatrix().searchMatrix(matrix, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13 -> false")
    void example2() {
        int[][] matrix = new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        boolean expected = false;
        boolean actual = new SearchA2DMatrix().searchMatrix(matrix, target);

        assertEquals(expected, actual);
    }
}
