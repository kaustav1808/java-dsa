package W16WGMST.D110BCR.SurroundedRegions;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 130. Surrounded Regions
 * https://leetcode.com/problems/surrounded-regions/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("130. Surrounded Regions")
public class SurroundedRegionsTest {

    @Test
    @DisplayName("Example 1: board = [[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"O\",\"O\",\"X\"],[\"X\",\"X\",\"O\",\"X\"],[\"X\",\"O\",\"X\",\"X\"]] -> [[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"O\",\"X\",\"X\"]]")
    void example1() {
        char[][] board = new char[][] {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] expected = new char[][] {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        new SurroundedRegions().solve(board);
        char[][] actual = board; // solve changes board in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: board = [[\"X\"]] -> [[\"X\"]]")
    void example2() {
        char[][] board = new char[][] {{'X'}};
        char[][] expected = new char[][] {{'X'}};
        new SurroundedRegions().solve(board);
        char[][] actual = board; // solve changes board in place

        assertArrayEquals(expected, actual);
    }
}
