package W20ISDPKB.AdditionalPractice.ShortestPathVisitingAllNodes;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 847. Shortest Path Visiting All Nodes
 * https://leetcode.com/problems/shortest-path-visiting-all-nodes/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("847. Shortest Path Visiting All Nodes")
public class ShortestPathVisitingAllNodesTest {

    @Test
    @DisplayName("Example 1: graph = [[1,2,3],[0],[0],[0]] -> 4")
    void example1() {
        int[][] graph = new int[][] {{1, 2, 3}, {0}, {0}, {0}};
        int expected = 4;
        int actual = new ShortestPathVisitingAllNodes().shortestPathLength(graph);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: graph = [[1],[0,2,4],[1,3,4],[2],[1,2]] -> 4")
    void example2() {
        int[][] graph = new int[][] {{1}, {0, 2, 4}, {1, 3, 4}, {2}, {1, 2}};
        int expected = 4;
        int actual = new ShortestPathVisitingAllNodes().shortestPathLength(graph);

        assertEquals(expected, actual);
    }
}
