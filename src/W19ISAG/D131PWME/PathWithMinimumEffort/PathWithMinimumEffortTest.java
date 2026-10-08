package W19ISAG.D131PWME.PathWithMinimumEffort;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1631. Path With Minimum Effort
 * https://leetcode.com/problems/path-with-minimum-effort/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1631. Path With Minimum Effort")
public class PathWithMinimumEffortTest {

    @Test
    @DisplayName("Example 1: heights = [[1,2,2],[3,8,2],[5,3,5]] -> 2")
    void example1() {
        int[][] heights = new int[][] {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        int expected = 2;
        int actual = new PathWithMinimumEffort().minimumEffortPath(heights);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: heights = [[1,2,3],[3,8,4],[5,3,5]] -> 1")
    void example2() {
        int[][] heights = new int[][] {{1, 2, 3}, {3, 8, 4}, {5, 3, 5}};
        int expected = 1;
        int actual = new PathWithMinimumEffort().minimumEffortPath(heights);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]] -> 0")
    void example3() {
        int[][] heights = new int[][] {
                {1, 2, 1, 1, 1},
                {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 1, 1, 2, 1}
        };
        int expected = 0;
        int actual = new PathWithMinimumEffort().minimumEffortPath(heights);

        assertEquals(expected, actual);
    }
}
