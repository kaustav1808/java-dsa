package W16WGMST.AdditionalPractice.FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance
 * https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance")
public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistanceTest {

    @Test
    @DisplayName("Example 1: n = 4, edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold = 4 -> 3")
    void example1() {
        int n = 4;
        int[][] edges = new int[][] {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        int distanceThreshold = 4;
        int expected = 3;
        int actual = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance().findTheCity(n, edges, distanceThreshold);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 5, edges = [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], distanceThreshold = 2 -> 0")
    void example2() {
        int n = 5;
        int[][] edges = new int[][] {{0, 1, 2}, {0, 4, 8}, {1, 2, 3}, {1, 4, 2}, {2, 3, 1}, {3, 4, 1}};
        int distanceThreshold = 2;
        int expected = 0;
        int actual = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance().findTheCity(n, edges, distanceThreshold);

        assertEquals(expected, actual);
    }
}
