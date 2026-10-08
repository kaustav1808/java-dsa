package W19ISAG.D129BR.BusRoutes;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 815. Bus Routes
 * https://leetcode.com/problems/bus-routes/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("815. Bus Routes")
public class BusRoutesTest {

    @Test
    @DisplayName("Example 1: routes = [[1,2,7],[3,6,7]], source = 1, target = 6 -> 2")
    void example1() {
        int[][] routes = new int[][] {{1, 2, 7}, {3, 6, 7}};
        int source = 1;
        int target = 6;
        int expected = 2;
        int actual = new BusRoutes().numBusesToDestination(routes, source, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12 -> -1")
    void example2() {
        int[][] routes = new int[][] {{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}};
        int source = 15;
        int target = 12;
        int expected = -1;
        int actual = new BusRoutes().numBusesToDestination(routes, source, target);

        assertEquals(expected, actual);
    }
}
