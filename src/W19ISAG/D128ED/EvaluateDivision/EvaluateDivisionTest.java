package W19ISAG.D128ED.EvaluateDivision;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 399. Evaluate Division
 * https://leetcode.com/problems/evaluate-division/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("399. Evaluate Division")
public class EvaluateDivisionTest {

    @Test
    @DisplayName("Example 1: equations = [[\"a\",\"b\"],[\"b\",\"c\"]], values = [2.0,3.0], queries = [[\"a\",\"c\"],[\"b\",\"a\"],[\"a\",\"e\"],[\"a\",\"a\"],[\"x\",\"x\"]] -> [6.00000,0.50000,-1.00000,1.00000,-1.00000]")
    void example1() {
        List<List<String>> equations = list(list("a", "b"), list("b", "c"));
        double[] values = new double[] {2.0, 3.0};
        List<List<String>> queries = list(
                list("a", "c"),
                list("b", "a"),
                list("a", "e"),
                list("a", "a"),
                list("x", "x"));
        double[] expected = new double[] {6.0, 0.5, -1.0, 1.0, -1.0};
        double[] actual = new EvaluateDivision().calcEquation(equations, values, queries);

        assertArrayEquals(expected, actual, 1e-5);
    }

    @Test
    @DisplayName("Example 2: equations = [[\"a\",\"b\"],[\"b\",\"c\"],[\"bc\",\"cd\"]], values = [1.5,2.5,5.0], queries = [[\"a\",\"c\"],[\"c\",\"b\"],[\"bc\",\"cd\"],[\"cd\",\"bc\"]] -> [3.75000,0.40000,5.00000,0.20000]")
    void example2() {
        List<List<String>> equations = list(list("a", "b"), list("b", "c"), list("bc", "cd"));
        double[] values = new double[] {1.5, 2.5, 5.0};
        List<List<String>> queries = list(list("a", "c"), list("c", "b"), list("bc", "cd"), list("cd", "bc"));
        double[] expected = new double[] {3.75, 0.4, 5.0, 0.2};
        double[] actual = new EvaluateDivision().calcEquation(equations, values, queries);

        assertArrayEquals(expected, actual, 1e-5);
    }

    @Test
    @DisplayName("Example 3: equations = [[\"a\",\"b\"]], values = [0.5], queries = [[\"a\",\"b\"],[\"b\",\"a\"],[\"a\",\"c\"],[\"x\",\"y\"]] -> [0.50000,2.00000,-1.00000,-1.00000]")
    void example3() {
        List<List<String>> equations = list(list("a", "b"));
        double[] values = new double[] {0.5};
        List<List<String>> queries = list(list("a", "b"), list("b", "a"), list("a", "c"), list("x", "y"));
        double[] expected = new double[] {0.5, 2.0, -1.0, -1.0};
        double[] actual = new EvaluateDivision().calcEquation(equations, values, queries);

        assertArrayEquals(expected, actual, 1e-5);
    }
}
