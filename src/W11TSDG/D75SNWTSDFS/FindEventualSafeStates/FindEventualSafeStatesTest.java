package W11TSDG.D75SNWTSDFS.FindEventualSafeStates;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 802. Find Eventual Safe States
 * https://leetcode.com/problems/find-eventual-safe-states/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("802. Find Eventual Safe States")
public class FindEventualSafeStatesTest {

    @Test
    @DisplayName("Example 1: graph = [[1,2],[2,3],[5],[0],[5],[],[]] -> [2,4,5,6]")
    void example1() {
        int[][] graph = new int[][] {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        List<Integer> expected = list(2, 4, 5, 6);
        List<Integer> actual = new FindEventualSafeStates().eventualSafeNodes(graph);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]] -> [4]")
    void example2() {
        int[][] graph = new int[][] {{1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}};
        List<Integer> expected = list(4);
        List<Integer> actual = new FindEventualSafeStates().eventualSafeNodes(graph);

        assertEquals(expected, actual);
    }
}
