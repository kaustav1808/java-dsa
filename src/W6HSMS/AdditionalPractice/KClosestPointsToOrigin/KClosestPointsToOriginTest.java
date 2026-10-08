package W6HSMS.AdditionalPractice.KClosestPointsToOrigin;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 973. K Closest Points to Origin
 * https://leetcode.com/problems/k-closest-points-to-origin/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("973. K Closest Points to Origin")
public class KClosestPointsToOriginTest {

    @Test
    @DisplayName("Example 1: points = [[1,3],[-2,2]], k = 1 -> [[-2,2]]")
    void example1() {
        int[][] points = new int[][] {{1, 3}, {-2, 2}};
        int k = 1;
        int[][] expected = new int[][] {{-2, 2}};
        int[][] actual = new KClosestPointsToOrigin().kClosest(points, k);

        assertArrayEquals(TestUtil.sortedRows(expected), TestUtil.sortedRows(actual));
    }

    @Test
    @DisplayName("Example 2: points = [[3,3],[5,-1],[-2,4]], k = 2 -> [[3,3],[-2,4]]")
    void example2() {
        int[][] points = new int[][] {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        int[][] expected = new int[][] {{3, 3}, {-2, 4}};
        int[][] actual = new KClosestPointsToOrigin().kClosest(points, k);

        assertArrayEquals(TestUtil.sortedRows(expected), TestUtil.sortedRows(actual));
    }
}
