package W16WGMST.D108MST.MinCostToConnectAllPoints;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1584. Min Cost to Connect All Points
 * https://leetcode.com/problems/min-cost-to-connect-all-points/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1584. Min Cost to Connect All Points")
public class MinCostToConnectAllPointsTest {

    @Test
    @DisplayName("Example 1: points = [[0,0],[2,2],[3,10],[5,2],[7,0]] -> 20")
    void example1() {
        int[][] points = new int[][] {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        int expected = 20;
        int actual = new MinCostToConnectAllPoints().minCostConnectPoints(points);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: points = [[3,12],[-2,5],[-4,1]] -> 18")
    void example2() {
        int[][] points = new int[][] {{3, 12}, {-2, 5}, {-4, 1}};
        int expected = 18;
        int actual = new MinCostToConnectAllPoints().minCostConnectPoints(points);

        assertEquals(expected, actual);
    }
}
