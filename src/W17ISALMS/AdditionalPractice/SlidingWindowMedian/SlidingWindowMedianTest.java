package W17ISALMS.AdditionalPractice.SlidingWindowMedian;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 480. Sliding Window Median
 * https://leetcode.com/problems/sliding-window-median/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("480. Sliding Window Median")
public class SlidingWindowMedianTest {

    @Test
    @DisplayName("Example 1: nums = [1,3,-1,-3,5,3,6,7], k = 3 -> [1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000]")
    void example1() {
        int[] nums = new int[] {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        double[] expected = new double[] {1.0, -1.0, -1.0, 3.0, 5.0, 6.0};
        double[] actual = new SlidingWindowMedian().medianSlidingWindow(nums, k);

        assertArrayEquals(expected, actual, 1e-5);
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,3,4,2,3,1,4,2], k = 3 -> [2.00000,3.00000,3.00000,3.00000,2.00000,3.00000,2.00000]")
    void example2() {
        int[] nums = new int[] {1, 2, 3, 4, 2, 3, 1, 4, 2};
        int k = 3;
        double[] expected = new double[] {2.0, 3.0, 3.0, 3.0, 2.0, 3.0, 2.0};
        double[] actual = new SlidingWindowMedian().medianSlidingWindow(nums, k);

        assertArrayEquals(expected, actual, 1e-5);
    }
}
