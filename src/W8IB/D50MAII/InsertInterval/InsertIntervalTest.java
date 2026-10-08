package W8IB.D50MAII.InsertInterval;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 57. Insert Interval
 * https://leetcode.com/problems/insert-interval/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("57. Insert Interval")
public class InsertIntervalTest {

    @Test
    @DisplayName("Example 1: intervals = [[1,3],[6,9]], newInterval = [2,5] -> [[1,5],[6,9]]")
    void example1() {
        int[][] intervals = new int[][] {{1, 3}, {6, 9}};
        int[] newInterval = new int[] {2, 5};
        int[][] expected = new int[][] {{1, 5}, {6, 9}};
        int[][] actual = new InsertInterval().insert(intervals, newInterval);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8] -> [[1,2],[3,10],[12,16]]")
    void example2() {
        int[][] intervals = new int[][] {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = new int[] {4, 8};
        int[][] expected = new int[][] {{1, 2}, {3, 10}, {12, 16}};
        int[][] actual = new InsertInterval().insert(intervals, newInterval);

        assertArrayEquals(expected, actual);
    }
}
