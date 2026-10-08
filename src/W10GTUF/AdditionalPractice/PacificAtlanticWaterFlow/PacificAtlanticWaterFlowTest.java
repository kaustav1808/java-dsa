package W10GTUF.AdditionalPractice.PacificAtlanticWaterFlow;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 417. Pacific Atlantic Water Flow
 * https://leetcode.com/problems/pacific-atlantic-water-flow/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("417. Pacific Atlantic Water Flow")
public class PacificAtlanticWaterFlowTest {

    @Test
    @DisplayName("Example 1: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]] -> [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]")
    void example1() {
        int[][] heights = new int[][] {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        List<List<Integer>> expected = list(
                list(0, 4),
                list(1, 3),
                list(1, 4),
                list(2, 2),
                list(3, 0),
                list(3, 1),
                list(4, 0));
        List<List<Integer>> actual = new PacificAtlanticWaterFlow().pacificAtlantic(heights);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }

    @Test
    @DisplayName("Example 2: heights = [[1]] -> [[0,0]]")
    void example2() {
        int[][] heights = new int[][] {{1}};
        List<List<Integer>> expected = list(list(0, 0));
        List<List<Integer>> actual = new PacificAtlanticWaterFlow().pacificAtlantic(heights);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }
}
