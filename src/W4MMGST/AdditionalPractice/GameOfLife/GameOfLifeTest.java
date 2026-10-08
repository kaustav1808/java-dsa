package W4MMGST.AdditionalPractice.GameOfLife;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 289. Game of Life
 * https://leetcode.com/problems/game-of-life/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("289. Game of Life")
public class GameOfLifeTest {

    @Test
    @DisplayName("Example 1: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]] -> [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]")
    void example1() {
        int[][] board = new int[][] {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected = new int[][] {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        new GameOfLife().gameOfLife(board);
        int[][] actual = board; // gameOfLife changes board in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: board = [[1,1],[1,0]] -> [[1,1],[1,1]]")
    void example2() {
        int[][] board = new int[][] {{1, 1}, {1, 0}};
        int[][] expected = new int[][] {{1, 1}, {1, 1}};
        new GameOfLife().gameOfLife(board);
        int[][] actual = board; // gameOfLife changes board in place

        assertArrayEquals(expected, actual);
    }
}
