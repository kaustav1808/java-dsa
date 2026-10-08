package W2SWFV.D11CSWAMW.SubarrayProductLessThanK;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 713. Subarray Product Less Than K
 * https://leetcode.com/problems/subarray-product-less-than-k/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("713. Subarray Product Less Than K")
public class SubarrayProductLessThanKTest {

    @Test
    @DisplayName("Example 1: nums = [10,5,2,6], k = 100 -> 8")
    void example1() {
        int[] nums = new int[] {10, 5, 2, 6};
        int k = 100;
        int expected = 8;
        int actual = new SubarrayProductLessThanK().numSubarrayProductLessThanK(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,3], k = 0 -> 0")
    void example2() {
        int[] nums = new int[] {1, 2, 3};
        int k = 0;
        int expected = 0;
        int actual = new SubarrayProductLessThanK().numSubarrayProductLessThanK(nums, k);

        assertEquals(expected, actual);
    }
}
