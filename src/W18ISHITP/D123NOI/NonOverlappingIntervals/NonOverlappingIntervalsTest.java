package W18ISHITP.D123NOI.NonOverlappingIntervals;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 435. Non-overlapping Intervals
 * https://leetcode.com/problems/non-overlapping-intervals/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("435. Non-overlapping Intervals")
public class NonOverlappingIntervalsTest {

    @Test
    @DisplayName("Example 1: intervals = [[1,2],[2,3],[3,4],[1,3]] -> 1")
    void example1() {
        int[][] intervals = new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int expected = 1;
        int actual = new NonOverlappingIntervals().eraseOverlapIntervals(intervals);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: intervals = [[1,2],[1,2],[1,2]] -> 2")
    void example2() {
        int[][] intervals = new int[][] {{1, 2}, {1, 2}, {1, 2}};
        int expected = 2;
        int actual = new NonOverlappingIntervals().eraseOverlapIntervals(intervals);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: intervals = [[1,2],[2,3]] -> 0")
    void example3() {
        int[][] intervals = new int[][] {{1, 2}, {2, 3}};
        int expected = 0;
        int actual = new NonOverlappingIntervals().eraseOverlapIntervals(intervals);

        assertEquals(expected, actual);
    }
}
