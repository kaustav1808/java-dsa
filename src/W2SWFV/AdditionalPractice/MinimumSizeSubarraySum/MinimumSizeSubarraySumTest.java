package W2SWFV.AdditionalPractice.MinimumSizeSubarraySum;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 209. Minimum Size Subarray Sum
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("209. Minimum Size Subarray Sum")
public class MinimumSizeSubarraySumTest {

    @Test
    @DisplayName("Example 1: target = 7, nums = [2,3,1,2,4,3] -> 2")
    void example1() {
        int target = 7;
        int[] nums = new int[] {2, 3, 1, 2, 4, 3};
        int expected = 2;
        int actual = new MinimumSizeSubarraySum().minSubArrayLen(target, nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: target = 4, nums = [1,4,4] -> 1")
    void example2() {
        int target = 4;
        int[] nums = new int[] {1, 4, 4};
        int expected = 1;
        int actual = new MinimumSizeSubarraySum().minSubArrayLen(target, nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: target = 11, nums = [1,1,1,1,1,1,1,1] -> 0")
    void example3() {
        int target = 11;
        int[] nums = new int[] {1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 0;
        int actual = new MinimumSizeSubarraySum().minSubArrayLen(target, nums);

        assertEquals(expected, actual);
    }
}
