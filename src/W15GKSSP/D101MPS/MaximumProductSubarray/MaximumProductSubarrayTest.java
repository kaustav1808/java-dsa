package W15GKSSP.D101MPS.MaximumProductSubarray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 152. Maximum Product Subarray
 * https://leetcode.com/problems/maximum-product-subarray/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("152. Maximum Product Subarray")
public class MaximumProductSubarrayTest {

    @Test
    @DisplayName("Example 1: nums = [2,3,-2,4] -> 6")
    void example1() {
        int[] nums = new int[] {2, 3, -2, 4};
        int expected = 6;
        int actual = new MaximumProductSubarray().maxProduct(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [-2,0,-1] -> 0")
    void example2() {
        int[] nums = new int[] {-2, 0, -1};
        int expected = 0;
        int actual = new MaximumProductSubarray().maxProduct(nums);

        assertEquals(expected, actual);
    }
}
