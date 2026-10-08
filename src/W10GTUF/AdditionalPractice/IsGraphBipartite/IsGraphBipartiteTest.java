package W10GTUF.AdditionalPractice.IsGraphBipartite;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 785. Is Graph Bipartite
 * https://leetcode.com/problems/is-graph-bipartite/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("785. Is Graph Bipartite")
public class IsGraphBipartiteTest {

    @Test
    @DisplayName("Example 1: graph = [[1,2,3],[0,2],[0,1,3],[0,2]] -> false")
    void example1() {
        int[][] graph = new int[][] {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        boolean expected = false;
        boolean actual = new IsGraphBipartite().isBipartite(graph);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: graph = [[1,3],[0,2],[1,3],[0,2]] -> true")
    void example2() {
        int[][] graph = new int[][] {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        boolean expected = true;
        boolean actual = new IsGraphBipartite().isBipartite(graph);

        assertEquals(expected, actual);
    }
}
