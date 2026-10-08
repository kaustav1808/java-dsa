package W18ISHITP.AdditionalPractice.MinimumIntervalToIncludeEachQuery;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1851. Minimum Interval to Include Each Query
 * https://leetcode.com/problems/minimum-interval-to-include-each-query/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1851. Minimum Interval to Include Each Query")
public class MinimumIntervalToIncludeEachQueryTest {

    @Test
    @DisplayName("Example 1: intervals = [[1,4],[2,4],[3,6],[4,4]], queries = [2,3,4,5] -> [3,3,1,4]")
    void example1() {
        int[][] intervals = new int[][] {{1, 4}, {2, 4}, {3, 6}, {4, 4}};
        int[] queries = new int[] {2, 3, 4, 5};
        int[] expected = new int[] {3, 3, 1, 4};
        int[] actual = new MinimumIntervalToIncludeEachQuery().minInterval(intervals, queries);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: intervals = [[2,3],[2,5],[1,8],[20,25]], queries = [2,19,5,22] -> [2,-1,4,6]")
    void example2() {
        int[][] intervals = new int[][] {{2, 3}, {2, 5}, {1, 8}, {20, 25}};
        int[] queries = new int[] {2, 19, 5, 22};
        int[] expected = new int[] {2, -1, 4, 6};
        int[] actual = new MinimumIntervalToIncludeEachQuery().minInterval(intervals, queries);

        assertArrayEquals(expected, actual);
    }
}
