package W131DDP.D86TOSDP.HouseRobber;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 198. House Robber
 * https://leetcode.com/problems/house-robber/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("198. House Robber")
public class HouseRobberTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3,1] -> 4")
    void example1() {
        int[] nums = new int[] {1, 2, 3, 1};
        int expected = 4;
        int actual = new HouseRobber().rob(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [2,7,9,3,1] -> 12")
    void example2() {
        int[] nums = new int[] {2, 7, 9, 3, 1};
        int expected = 12;
        int actual = new HouseRobber().rob(nums);

        assertEquals(expected, actual);
    }
}
