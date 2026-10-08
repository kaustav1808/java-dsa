package W18ISHITP.D122TSP.TheSkylineProblem;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 218. The Skyline Problem
 * https://leetcode.com/problems/the-skyline-problem/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("218. The Skyline Problem")
public class TheSkylineProblemTest {

    @Test
    @DisplayName("Example 1: buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]] -> [[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]")
    void example1() {
        int[][] buildings = new int[][] {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        List<List<Integer>> expected = list(
                list(2, 10),
                list(3, 15),
                list(7, 12),
                list(12, 0),
                list(15, 10),
                list(20, 8),
                list(24, 0));
        List<List<Integer>> actual = new TheSkylineProblem().getSkyline(buildings);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: buildings = [[0,2,3],[2,5,3]] -> [[0,3],[5,0]]")
    void example2() {
        int[][] buildings = new int[][] {{0, 2, 3}, {2, 5, 3}};
        List<List<Integer>> expected = list(list(0, 3), list(5, 0));
        List<List<Integer>> actual = new TheSkylineProblem().getSkyline(buildings);

        assertEquals(expected, actual);
    }
}
