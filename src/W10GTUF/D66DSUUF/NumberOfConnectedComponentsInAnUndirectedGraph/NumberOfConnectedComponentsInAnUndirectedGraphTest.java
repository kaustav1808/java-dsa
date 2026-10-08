package W10GTUF.D66DSUUF.NumberOfConnectedComponentsInAnUndirectedGraph;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 323. Number of Connected Components in an Undirected Graph
 * https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("323. Number of Connected Components in an Undirected Graph")
public class NumberOfConnectedComponentsInAnUndirectedGraphTest {

    @Test
    @DisplayName("Example 1: n = 5, edges = [[0,1],[1,2],[3,4]] -> 2")
    void example1() {
        int n = 5;
        int[][] edges = new int[][] {{0, 1}, {1, 2}, {3, 4}};
        int expected = 2;
        int actual = new NumberOfConnectedComponentsInAnUndirectedGraph().countComponents(n, edges);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 5, edges = [[0,1],[1,2],[2,3],[3,4]] -> 1")
    void example2() {
        int n = 5;
        int[][] edges = new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        int expected = 1;
        int actual = new NumberOfConnectedComponentsInAnUndirectedGraph().countComponents(n, edges);

        assertEquals(expected, actual);
    }
}
