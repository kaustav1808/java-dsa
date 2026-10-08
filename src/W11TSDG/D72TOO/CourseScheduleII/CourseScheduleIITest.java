package W11TSDG.D72TOO.CourseScheduleII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 210. Course Schedule II
 * https://leetcode.com/problems/course-schedule-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("210. Course Schedule II")
public class CourseScheduleIITest {

    @Test
    @DisplayName("Example 1: numCourses = 2, prerequisites = [[1,0]] -> [0,1]")
    void example1() {
        int numCourses = 2;
        int[][] prerequisites = new int[][] {{1, 0}};
        int[] expected = new int[] {0, 1};
        int[] actual = new CourseScheduleII().findOrder(numCourses, prerequisites);

        assertTrue(TestUtil.safe(() -> TestUtil.isValidCourseOrder(numCourses, prerequisites, actual, expected.length == 0)), () -> "expected any valid order, e.g. [0,1] but got " + TestUtil.str(actual));
    }

    @Test
    @DisplayName("Example 2: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]] -> [0,2,1,3]")
    void example2() {
        int numCourses = 4;
        int[][] prerequisites = new int[][] {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] expected = new int[] {0, 2, 1, 3};
        int[] actual = new CourseScheduleII().findOrder(numCourses, prerequisites);

        assertTrue(TestUtil.safe(() -> TestUtil.isValidCourseOrder(numCourses, prerequisites, actual, expected.length == 0)), () -> "expected any valid order, e.g. [0,2,1,3] but got " + TestUtil.str(actual));
    }

    @Test
    @DisplayName("Example 3: numCourses = 1, prerequisites = [] -> [0]")
    void example3() {
        int numCourses = 1;
        int[][] prerequisites = new int[][] {};
        int[] expected = new int[] {0};
        int[] actual = new CourseScheduleII().findOrder(numCourses, prerequisites);

        assertTrue(TestUtil.safe(() -> TestUtil.isValidCourseOrder(numCourses, prerequisites, actual, expected.length == 0)), () -> "expected any valid order, e.g. [0] but got " + TestUtil.str(actual));
    }
}
