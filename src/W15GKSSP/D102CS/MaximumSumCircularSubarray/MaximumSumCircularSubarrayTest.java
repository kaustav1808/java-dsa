package W15GKSSP.D102CS.MaximumSumCircularSubarray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 918. Maximum Sum Circular Subarray
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("918. Maximum Sum Circular Subarray")
public class MaximumSumCircularSubarrayTest {

    @Test
    @DisplayName("Example 1: nums = [1,-2,3,-2] -> 3")
    void example1() {
        int[] nums = new int[] {1, -2, 3, -2};
        int expected = 3;
        int actual = new MaximumSumCircularSubarray().maxSubarraySumCircular(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [5,-3,5] -> 10")
    void example2() {
        int[] nums = new int[] {5, -3, 5};
        int expected = 10;
        int actual = new MaximumSumCircularSubarray().maxSubarraySumCircular(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [-3,-2,-3] -> -2")
    void example3() {
        int[] nums = new int[] {-3, -2, -3};
        int expected = -2;
        int actual = new MaximumSumCircularSubarray().maxSubarraySumCircular(nums);

        assertEquals(expected, actual);
    }
}
