package W6HSMS.D40GSWTH.IPO;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 502. IPO
 * https://leetcode.com/problems/ipo/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("502. IPO")
public class IPOTest {

    @Test
    @DisplayName("Example 1: k = 2, w = 0, profits = [1,2,3], capital = [0,1,1] -> 4")
    void example1() {
        int k = 2;
        int w = 0;
        int[] profits = new int[] {1, 2, 3};
        int[] capital = new int[] {0, 1, 1};
        int expected = 4;
        int actual = new IPO().findMaximizedCapital(k, w, profits, capital);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: k = 3, w = 0, profits = [1,2,3], capital = [0,1,2] -> 6")
    void example2() {
        int k = 3;
        int w = 0;
        int[] profits = new int[] {1, 2, 3};
        int[] capital = new int[] {0, 1, 2};
        int expected = 6;
        int actual = new IPO().findMaximizedCapital(k, w, profits, capital);

        assertEquals(expected, actual);
    }
}
