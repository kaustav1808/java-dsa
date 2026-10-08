package W8IB.D50MAII.MergeIntervals;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 56. Merge Intervals
 * https://leetcode.com/problems/merge-intervals/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("56. Merge Intervals")
public class MergeIntervalsTest {

    @Test
    @DisplayName("Example 1: intervals = [[1,3],[2,6],[8,10],[15,18]] -> [[1,6],[8,10],[15,18]]")
    void example1() {
        int[][] intervals = new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = new int[][] {{1, 6}, {8, 10}, {15, 18}};
        int[][] actual = new MergeIntervals().merge(intervals);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: intervals = [[1,4],[4,5]] -> [[1,5]]")
    void example2() {
        int[][] intervals = new int[][] {{1, 4}, {4, 5}};
        int[][] expected = new int[][] {{1, 5}};
        int[][] actual = new MergeIntervals().merge(intervals);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: intervals = [[4,7],[1,4]] -> [[1,7]]")
    void example3() {
        int[][] intervals = new int[][] {{4, 7}, {1, 4}};
        int[][] expected = new int[][] {{1, 7}};
        int[][] actual = new MergeIntervals().merge(intervals);

        assertArrayEquals(expected, actual);
    }
}
