package W8IB.AdditionalPractice.IntervalListIntersections;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 986. Interval List Intersections
 * https://leetcode.com/problems/interval-list-intersections/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("986. Interval List Intersections")
public class IntervalListIntersectionsTest {

    @Test
    @DisplayName("Example 1: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]] -> [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]")
    void example1() {
        int[][] firstList = new int[][] {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = new int[][] {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] expected = new int[][] {{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};
        int[][] actual = new IntervalListIntersections().intervalIntersection(firstList, secondList);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: firstList = [[1,3],[5,9]], secondList = [] -> []")
    void example2() {
        int[][] firstList = new int[][] {{1, 3}, {5, 9}};
        int[][] secondList = new int[][] {};
        int[][] expected = new int[][] {};
        int[][] actual = new IntervalListIntersections().intervalIntersection(firstList, secondList);

        assertArrayEquals(expected, actual);
    }
}
