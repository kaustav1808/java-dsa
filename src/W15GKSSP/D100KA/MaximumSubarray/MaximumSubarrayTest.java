package W15GKSSP.D100KA.MaximumSubarray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("53. Maximum Subarray")
public class MaximumSubarrayTest {

    @Test
    @DisplayName("Example 1: nums = [-2,1,-3,4,-1,2,1,-5,4] -> 6")
    void example1() {
        int[] nums = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        int actual = new MaximumSubarray().maxSubArray(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1] -> 1")
    void example2() {
        int[] nums = new int[] {1};
        int expected = 1;
        int actual = new MaximumSubarray().maxSubArray(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [5,4,-1,7,8] -> 23")
    void example3() {
        int[] nums = new int[] {5, 4, -1, 7, 8};
        int expected = 23;
        int actual = new MaximumSubarray().maxSubArray(nums);

        assertEquals(expected, actual);
    }
}
