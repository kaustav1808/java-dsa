package W16WGMST.D107SPWAMKS.CheapestFlightsWithinKStops;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 787. Cheapest Flights Within K Stops
 * https://leetcode.com/problems/cheapest-flights-within-k-stops/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("787. Cheapest Flights Within K Stops")
public class CheapestFlightsWithinKStopsTest {

    @Test
    @DisplayName("Example 1: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1 -> 700")
    void example1() {
        int n = 4;
        int[][] flights = new int[][] {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0;
        int dst = 3;
        int k = 1;
        int expected = 700;
        int actual = new CheapestFlightsWithinKStops().findCheapestPrice(n, flights, src, dst, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1 -> 200")
    void example2() {
        int n = 3;
        int[][] flights = new int[][] {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int k = 1;
        int expected = 200;
        int actual = new CheapestFlightsWithinKStops().findCheapestPrice(n, flights, src, dst, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0 -> 500")
    void example3() {
        int n = 3;
        int[][] flights = new int[][] {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int k = 0;
        int expected = 500;
        int actual = new CheapestFlightsWithinKStops().findCheapestPrice(n, flights, src, dst, k);

        assertEquals(expected, actual);
    }
}
