package W142DDP.AdditionalPractice.DistinctSubsequences;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 115. Distinct Subsequences
 * https://leetcode.com/problems/distinct-subsequences/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("115. Distinct Subsequences")
public class DistinctSubsequencesTest {

    @Test
    @DisplayName("Example 1: s = \"rabbbit\", t = \"rabbit\" -> 3")
    void example1() {
        String s = "rabbbit";
        String t = "rabbit";
        int expected = 3;
        int actual = new DistinctSubsequences().numDistinct(s, t);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"babgbag\", t = \"bag\" -> 5")
    void example2() {
        String s = "babgbag";
        String t = "bag";
        int expected = 5;
        int actual = new DistinctSubsequences().numDistinct(s, t);

        assertEquals(expected, actual);
    }
}
