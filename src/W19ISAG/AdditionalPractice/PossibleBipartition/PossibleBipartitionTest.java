package W19ISAG.AdditionalPractice.PossibleBipartition;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 886. Possible Bipartition
 * https://leetcode.com/problems/possible-bipartition/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("886. Possible Bipartition")
public class PossibleBipartitionTest {

    @Test
    @DisplayName("Example 1: n = 4, dislikes = [[1,2],[1,3],[2,4]] -> true")
    void example1() {
        int n = 4;
        int[][] dislikes = new int[][] {{1, 2}, {1, 3}, {2, 4}};
        boolean expected = true;
        boolean actual = new PossibleBipartition().possibleBipartition(n, dislikes);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 3, dislikes = [[1,2],[1,3],[2,3]] -> false")
    void example2() {
        int n = 3;
        int[][] dislikes = new int[][] {{1, 2}, {1, 3}, {2, 3}};
        boolean expected = false;
        boolean actual = new PossibleBipartition().possibleBipartition(n, dislikes);

        assertEquals(expected, actual);
    }
}
