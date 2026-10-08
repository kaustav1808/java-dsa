package W142DDP.AdditionalPractice.MaximalSquare;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 221. Maximal Square
 * https://leetcode.com/problems/maximal-square/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("221. Maximal Square")
public class MaximalSquareTest {

    @Test
    @DisplayName("Example 1: matrix = [[\"1\",\"0\",\"1\",\"0\",\"0\"],[\"1\",\"0\",\"1\",\"1\",\"1\"],[\"1\",\"1\",\"1\",\"1\",\"1\"],[\"1\",\"0\",\"0\",\"1\",\"0\"]] -> 4")
    void example1() {
        char[][] matrix = new char[][] {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        int expected = 4;
        int actual = new MaximalSquare().maximalSquare(matrix);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: matrix = [[\"0\",\"1\"],[\"1\",\"0\"]] -> 1")
    void example2() {
        char[][] matrix = new char[][] {{'0', '1'}, {'1', '0'}};
        int expected = 1;
        int actual = new MaximalSquare().maximalSquare(matrix);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: matrix = [[\"0\"]] -> 0")
    void example3() {
        char[][] matrix = new char[][] {{'0'}};
        int expected = 0;
        int actual = new MaximalSquare().maximalSquare(matrix);

        assertEquals(expected, actual);
    }
}
