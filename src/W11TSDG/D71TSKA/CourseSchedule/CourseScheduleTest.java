package W11TSDG.D71TSKA.CourseSchedule;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 207. Course Schedule
 * https://leetcode.com/problems/course-schedule/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("207. Course Schedule")
public class CourseScheduleTest {

    @Test
    @DisplayName("Example 1: numCourses = 2, prerequisites = [[1,0]] -> true")
    void example1() {
        int numCourses = 2;
        int[][] prerequisites = new int[][] {{1, 0}};
        boolean expected = true;
        boolean actual = new CourseSchedule().canFinish(numCourses, prerequisites);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: numCourses = 2, prerequisites = [[1,0],[0,1]] -> false")
    void example2() {
        int numCourses = 2;
        int[][] prerequisites = new int[][] {{1, 0}, {0, 1}};
        boolean expected = false;
        boolean actual = new CourseSchedule().canFinish(numCourses, prerequisites);

        assertEquals(expected, actual);
    }
}
