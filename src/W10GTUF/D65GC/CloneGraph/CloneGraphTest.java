package W10GTUF.D65GC.CloneGraph;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 133. Clone Graph
 * https://leetcode.com/problems/clone-graph/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("133. Clone Graph")
public class CloneGraphTest {

    @Test
    @DisplayName("Example 1: adjList = [[2,4],[1,3],[2,4],[1,3]] -> [[2,4],[1,3],[2,4],[1,3]]")
    void example1() {
        Node node = Node.fromAdjacency(new int[][] {{2, 4}, {1, 3}, {2, 4}, {1, 3}});
        List<List<Integer>> expected = list(list(2, 4), list(1, 3), list(2, 4), list(1, 3));
        Node actual = new CloneGraph().cloneGraph(node);

        assertTrue(node == null || actual != node, "must return a deep copy, not the original node");
        assertEquals(expected, Node.toAdjacency(actual));
    }

    @Test
    @DisplayName("Example 2: adjList = [[]] -> [[]]")
    void example2() {
        Node node = Node.fromAdjacency(new int[][] {{}});
        List<List<Integer>> expected = list(list());
        Node actual = new CloneGraph().cloneGraph(node);

        assertTrue(node == null || actual != node, "must return a deep copy, not the original node");
        assertEquals(expected, Node.toAdjacency(actual));
    }

    @Test
    @DisplayName("Example 3: adjList = [] -> []")
    void example3() {
        Node node = Node.fromAdjacency(new int[][] {});
        List<List<Integer>> expected = list();
        Node actual = new CloneGraph().cloneGraph(node);

        assertTrue(node == null || actual != node, "must return a deep copy, not the original node");
        assertEquals(expected, Node.toAdjacency(actual));
    }
}
