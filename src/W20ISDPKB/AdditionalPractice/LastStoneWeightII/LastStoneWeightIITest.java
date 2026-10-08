package W20ISDPKB.AdditionalPractice.LastStoneWeightII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1049. Last Stone Weight II
 * https://leetcode.com/problems/last-stone-weight-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1049. Last Stone Weight II")
public class LastStoneWeightIITest {

    @Test
    @DisplayName("Example 1: stones = [2,7,4,1,8,1] -> 1")
    void example1() {
        int[] stones = new int[] {2, 7, 4, 1, 8, 1};
        int expected = 1;
        int actual = new LastStoneWeightII().lastStoneWeightII(stones);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: stones = [31,26,33,21,40] -> 5")
    void example2() {
        int[] stones = new int[] {31, 26, 33, 21, 40};
        int expected = 5;
        int actual = new LastStoneWeightII().lastStoneWeightII(stones);

        assertEquals(expected, actual);
    }
}
