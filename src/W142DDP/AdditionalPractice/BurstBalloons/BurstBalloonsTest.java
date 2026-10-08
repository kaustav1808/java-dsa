package W142DDP.AdditionalPractice.BurstBalloons;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 312. Burst Balloons
 * https://leetcode.com/problems/burst-balloons/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("312. Burst Balloons")
public class BurstBalloonsTest {

    @Test
    @DisplayName("Example 1: nums = [3,1,5,8] -> 167")
    void example1() {
        int[] nums = new int[] {3, 1, 5, 8};
        int expected = 167;
        int actual = new BurstBalloons().maxCoins(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,5] -> 10")
    void example2() {
        int[] nums = new int[] {1, 5};
        int expected = 10;
        int actual = new BurstBalloons().maxCoins(nums);

        assertEquals(expected, actual);
    }
}
