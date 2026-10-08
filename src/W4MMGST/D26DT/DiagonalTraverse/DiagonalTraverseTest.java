package W4MMGST.D26DT.DiagonalTraverse;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 498. Diagonal Traverse
 * https://leetcode.com/problems/diagonal-traverse/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("498. Diagonal Traverse")
public class DiagonalTraverseTest {

    @Test
    @DisplayName("Example 1: mat = [[1,2,3],[4,5,6],[7,8,9]] -> [1,2,4,7,5,3,6,8,9]")
    void example1() {
        int[][] mat = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = new int[] {1, 2, 4, 7, 5, 3, 6, 8, 9};
        int[] actual = new DiagonalTraverse().findDiagonalOrder(mat);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: mat = [[1,2],[3,4]] -> [1,2,3,4]")
    void example2() {
        int[][] mat = new int[][] {{1, 2}, {3, 4}};
        int[] expected = new int[] {1, 2, 3, 4};
        int[] actual = new DiagonalTraverse().findDiagonalOrder(mat);

        assertArrayEquals(expected, actual);
    }
}
