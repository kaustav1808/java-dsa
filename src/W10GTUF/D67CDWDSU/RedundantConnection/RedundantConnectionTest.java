package W10GTUF.D67CDWDSU.RedundantConnection;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 684. Redundant Connection
 * https://leetcode.com/problems/redundant-connection/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("684. Redundant Connection")
public class RedundantConnectionTest {

    @Test
    @DisplayName("Example 1: edges = [[1,2],[1,3],[2,3]] -> [2,3]")
    void example1() {
        int[][] edges = new int[][] {{1, 2}, {1, 3}, {2, 3}};
        int[] expected = new int[] {2, 3};
        int[] actual = new RedundantConnection().findRedundantConnection(edges);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]] -> [1,4]")
    void example2() {
        int[][] edges = new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        int[] expected = new int[] {1, 4};
        int[] actual = new RedundantConnection().findRedundantConnection(edges);

        assertArrayEquals(expected, actual);
    }
}
