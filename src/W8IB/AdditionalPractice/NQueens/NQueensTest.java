package W8IB.AdditionalPractice.NQueens;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 51. N-Queens
 * https://leetcode.com/problems/n-queens/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("51. N-Queens")
public class NQueensTest {

    @Test
    @DisplayName("Example 1: n = 4 -> [[\".Q..\",\"...Q\",\"Q...\",\"..Q.\"],[\"..Q.\",\"Q...\",\"...Q\",\".Q..\"]]")
    void example1() {
        int n = 4;
        List<List<String>> expected = list(
                list(".Q..", "...Q", "Q...", "..Q."),
                list("..Q.", "Q...", "...Q", ".Q.."));
        List<List<String>> actual = new NQueens().solveNQueens(n);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }

    @Test
    @DisplayName("Example 2: n = 1 -> [[\"Q\"]]")
    void example2() {
        int n = 1;
        List<List<String>> expected = list(list("Q"));
        List<List<String>> actual = new NQueens().solveNQueens(n);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }
}
