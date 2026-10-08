package W8IB.D51RCWI.MeetingRoomsII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 253. Meeting Rooms II
 * https://leetcode.com/problems/meeting-rooms-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("253. Meeting Rooms II")
public class MeetingRoomsIITest {

    @Test
    @DisplayName("Example 1: intervals = [[0,30],[5,10],[15,20]] -> 2")
    void example1() {
        int[][] intervals = new int[][] {{0, 30}, {5, 10}, {15, 20}};
        int expected = 2;
        int actual = new MeetingRoomsII().minMeetingRooms(intervals);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: intervals = [[7,10],[2,4]] -> 1")
    void example2() {
        int[][] intervals = new int[][] {{7, 10}, {2, 4}};
        int expected = 1;
        int actual = new MeetingRoomsII().minMeetingRooms(intervals);

        assertEquals(expected, actual);
    }
}
