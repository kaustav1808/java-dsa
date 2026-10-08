package W5HPSFA.AdditionalPractice.ContinuousSubarraySum;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 523. Continuous Subarray Sum
 * https://leetcode.com/problems/continuous-subarray-sum/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("523. Continuous Subarray Sum")
public class ContinuousSubarraySumTest {

    @Test
    @DisplayName("Example 1: nums = [23,2,4,6,7], k = 6 -> true")
    void example1() {
        int[] nums = new int[] {23, 2, 4, 6, 7};
        int k = 6;
        boolean expected = true;
        boolean actual = new ContinuousSubarraySum().checkSubarraySum(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [23,2,6,4,7], k = 6 -> true")
    void example2() {
        int[] nums = new int[] {23, 2, 6, 4, 7};
        int k = 6;
        boolean expected = true;
        boolean actual = new ContinuousSubarraySum().checkSubarraySum(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [23,2,6,4,7], k = 13 -> false")
    void example3() {
        int[] nums = new int[] {23, 2, 6, 4, 7};
        int k = 13;
        boolean expected = false;
        boolean actual = new ContinuousSubarraySum().checkSubarraySum(nums, k);

        assertEquals(expected, actual);
    }
}
