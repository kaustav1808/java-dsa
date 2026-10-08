package W6HSMS.AdditionalPractice.LastStoneWeight;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1046. Last Stone Weight
 * https://leetcode.com/problems/last-stone-weight/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1046. Last Stone Weight")
public class LastStoneWeightTest {

    @Test
    @DisplayName("Example 1: stones = [2,7,4,1,8,1] -> 1")
    void example1() {
        int[] stones = new int[] {2, 7, 4, 1, 8, 1};
        int expected = 1;
        int actual = new LastStoneWeight().lastStoneWeight(stones);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: stones = [1] -> 1")
    void example2() {
        int[] stones = new int[] {1};
        int expected = 1;
        int actual = new LastStoneWeight().lastStoneWeight(stones);

        assertEquals(expected, actual);
    }
}
