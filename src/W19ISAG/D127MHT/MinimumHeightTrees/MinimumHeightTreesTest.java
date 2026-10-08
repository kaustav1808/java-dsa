package W19ISAG.D127MHT.MinimumHeightTrees;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 310. Minimum Height Trees
 * https://leetcode.com/problems/minimum-height-trees/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("310. Minimum Height Trees")
public class MinimumHeightTreesTest {

    @Test
    @DisplayName("Example 1: n = 4, edges = [[1,0],[1,2],[1,3]] -> [1]")
    void example1() {
        int n = 4;
        int[][] edges = new int[][] {{1, 0}, {1, 2}, {1, 3}};
        List<Integer> expected = list(1);
        List<Integer> actual = new MinimumHeightTrees().findMinHeightTrees(n, edges);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 2: n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]] -> [3,4]")
    void example2() {
        int n = 6;
        int[][] edges = new int[][] {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        List<Integer> expected = list(3, 4);
        List<Integer> actual = new MinimumHeightTrees().findMinHeightTrees(n, edges);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }
}
