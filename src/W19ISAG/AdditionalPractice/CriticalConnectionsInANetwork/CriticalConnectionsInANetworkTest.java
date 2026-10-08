package W19ISAG.AdditionalPractice.CriticalConnectionsInANetwork;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1192. Critical Connections in a Network
 * https://leetcode.com/problems/critical-connections-in-a-network/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1192. Critical Connections in a Network")
public class CriticalConnectionsInANetworkTest {

    @Test
    @DisplayName("Example 1: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]] -> [[1,3]]")
    void example1() {
        int n = 4;
        List<List<Integer>> connections = list(list(0, 1), list(1, 2), list(2, 0), list(1, 3));
        List<List<Integer>> expected = list(list(1, 3));
        List<List<Integer>> actual = new CriticalConnectionsInANetwork().criticalConnections(n, connections);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }

    @Test
    @DisplayName("Example 2: n = 2, connections = [[0,1]] -> [[0,1]]")
    void example2() {
        int n = 2;
        List<List<Integer>> connections = list(list(0, 1));
        List<List<Integer>> expected = list(list(0, 1));
        List<List<Integer>> actual = new CriticalConnectionsInANetwork().criticalConnections(n, connections);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }
}
