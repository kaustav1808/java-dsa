package W142DDP.D92GDP.UniquePaths;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 62. Unique Paths
 * https://leetcode.com/problems/unique-paths/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("62. Unique Paths")
public class UniquePathsTest {

    @Test
    @DisplayName("Example 1: m = 3, n = 7 -> 28")
    void example1() {
        int m = 3;
        int n = 7;
        int expected = 28;
        int actual = new UniquePaths().uniquePaths(m, n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: m = 3, n = 2 -> 3")
    void example2() {
        int m = 3;
        int n = 2;
        int expected = 3;
        int actual = new UniquePaths().uniquePaths(m, n);

        assertEquals(expected, actual);
    }
}
