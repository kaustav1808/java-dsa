package W2SWFV.D8FSSW.MaximumAverageSubarrayI;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 643. Maximum Average Subarray I
 * https://leetcode.com/problems/maximum-average-subarray-i/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("643. Maximum Average Subarray I")
public class MaximumAverageSubarrayITest {

    @Test
    @DisplayName("Example 1: nums = [1,12,-5,-6,50,3], k = 4 -> 12.75000")
    void example1() {
        int[] nums = new int[] {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected = 12.75;
        double actual = new MaximumAverageSubarrayI().findMaxAverage(nums, k);

        assertEquals(expected, actual, 1e-5);
    }

    @Test
    @DisplayName("Example 2: nums = [5], k = 1 -> 5.00000")
    void example2() {
        int[] nums = new int[] {5};
        int k = 1;
        double expected = 5.0;
        double actual = new MaximumAverageSubarrayI().findMaxAverage(nums, k);

        assertEquals(expected, actual, 1e-5);
    }
}
