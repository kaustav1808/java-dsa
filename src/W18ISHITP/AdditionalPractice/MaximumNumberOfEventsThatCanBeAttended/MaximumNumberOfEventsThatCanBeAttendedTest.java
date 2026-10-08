package W18ISHITP.AdditionalPractice.MaximumNumberOfEventsThatCanBeAttended;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1353. Maximum Number of Events That Can Be Attended
 * https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1353. Maximum Number of Events That Can Be Attended")
public class MaximumNumberOfEventsThatCanBeAttendedTest {

    @Test
    @DisplayName("Example 1: events = [[1,2],[2,3],[3,4]] -> 3")
    void example1() {
        int[][] events = new int[][] {{1, 2}, {2, 3}, {3, 4}};
        int expected = 3;
        int actual = new MaximumNumberOfEventsThatCanBeAttended().maxEvents(events);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: events= [[1,2],[2,3],[3,4],[1,2]] -> 4")
    void example2() {
        int[][] events = new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        int expected = 4;
        int actual = new MaximumNumberOfEventsThatCanBeAttended().maxEvents(events);

        assertEquals(expected, actual);
    }
}
