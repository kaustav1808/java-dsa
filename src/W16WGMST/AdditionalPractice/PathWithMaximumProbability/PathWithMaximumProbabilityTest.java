package W16WGMST.AdditionalPractice.PathWithMaximumProbability;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1514. Path with Maximum Probability
 * https://leetcode.com/problems/path-with-maximum-probability/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1514. Path with Maximum Probability")
public class PathWithMaximumProbabilityTest {

    @Test
    @DisplayName("Example 1: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2 -> 0.25000")
    void example1() {
        int n = 3;
        int[][] edges = new int[][] {{0, 1}, {1, 2}, {0, 2}};
        double[] succProb = new double[] {0.5, 0.5, 0.2};
        int start_node = 0;
        int end_node = 2;
        double expected = 0.25;
        double actual = new PathWithMaximumProbability().maxProbability(n, edges, succProb, start_node, end_node);

        assertEquals(expected, actual, 1e-5);
    }

    @Test
    @DisplayName("Example 2: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.3], start = 0, end = 2 -> 0.30000")
    void example2() {
        int n = 3;
        int[][] edges = new int[][] {{0, 1}, {1, 2}, {0, 2}};
        double[] succProb = new double[] {0.5, 0.5, 0.3};
        int start_node = 0;
        int end_node = 2;
        double expected = 0.3;
        double actual = new PathWithMaximumProbability().maxProbability(n, edges, succProb, start_node, end_node);

        assertEquals(expected, actual, 1e-5);
    }

    @Test
    @DisplayName("Example 3: n = 3, edges = [[0,1]], succProb = [0.5], start = 0, end = 2 -> 0.00000")
    void example3() {
        int n = 3;
        int[][] edges = new int[][] {{0, 1}};
        double[] succProb = new double[] {0.5};
        int start_node = 0;
        int end_node = 2;
        double expected = 0.0;
        double actual = new PathWithMaximumProbability().maxProbability(n, edges, succProb, start_node, end_node);

        assertEquals(expected, actual, 1e-5);
    }
}
