package W131DDP.D86TOSDP.HouseRobberII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 213. House Robber II
 * https://leetcode.com/problems/house-robber-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("213. House Robber II")
public class HouseRobberIITest {

    @Test
    @DisplayName("Example 1: nums = [2,3,2] -> 3")
    void example1() {
        int[] nums = new int[] {2, 3, 2};
        int expected = 3;
        int actual = new HouseRobberII().rob(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,3,1] -> 4")
    void example2() {
        int[] nums = new int[] {1, 2, 3, 1};
        int expected = 4;
        int actual = new HouseRobberII().rob(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [1,2,3] -> 3")
    void example3() {
        int[] nums = new int[] {1, 2, 3};
        int expected = 3;
        int actual = new HouseRobberII().rob(nums);

        assertEquals(expected, actual);
    }
}
