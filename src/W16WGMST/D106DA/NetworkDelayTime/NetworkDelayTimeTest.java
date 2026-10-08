package W16WGMST.D106DA.NetworkDelayTime;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 743. Network Delay Time
 * https://leetcode.com/problems/network-delay-time/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("743. Network Delay Time")
public class NetworkDelayTimeTest {

    @Test
    @DisplayName("Example 1: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2 -> 2")
    void example1() {
        int[][] times = new int[][] {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        int expected = 2;
        int actual = new NetworkDelayTime().networkDelayTime(times, n, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: times = [[1,2,1]], n = 2, k = 1 -> 1")
    void example2() {
        int[][] times = new int[][] {{1, 2, 1}};
        int n = 2;
        int k = 1;
        int expected = 1;
        int actual = new NetworkDelayTime().networkDelayTime(times, n, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: times = [[1,2,1]], n = 2, k = 2 -> -1")
    void example3() {
        int[][] times = new int[][] {{1, 2, 1}};
        int n = 2;
        int k = 2;
        int expected = -1;
        int actual = new NetworkDelayTime().networkDelayTime(times, n, k);

        assertEquals(expected, actual);
    }
}
