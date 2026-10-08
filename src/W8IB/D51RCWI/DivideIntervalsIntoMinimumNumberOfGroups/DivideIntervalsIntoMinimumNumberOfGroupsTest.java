package W8IB.D51RCWI.DivideIntervalsIntoMinimumNumberOfGroups;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 2406. Divide Intervals Into Minimum Number of Groups
 * https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("2406. Divide Intervals Into Minimum Number of Groups")
public class DivideIntervalsIntoMinimumNumberOfGroupsTest {

    @Test
    @DisplayName("Example 1: intervals = [[5,10],[6,8],[1,5],[2,3],[1,10]] -> 3")
    void example1() {
        int[][] intervals = new int[][] {{5, 10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}};
        int expected = 3;
        int actual = new DivideIntervalsIntoMinimumNumberOfGroups().minGroups(intervals);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: intervals = [[1,3],[5,6],[8,10],[11,13]] -> 1")
    void example2() {
        int[][] intervals = new int[][] {{1, 3}, {5, 6}, {8, 10}, {11, 13}};
        int expected = 1;
        int actual = new DivideIntervalsIntoMinimumNumberOfGroups().minGroups(intervals);

        assertEquals(expected, actual);
    }
}
