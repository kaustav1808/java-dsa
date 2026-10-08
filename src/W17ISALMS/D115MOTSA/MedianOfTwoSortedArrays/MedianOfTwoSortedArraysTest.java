package W17ISALMS.D115MOTSA.MedianOfTwoSortedArrays;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 4. Median of Two Sorted Arrays
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("4. Median of Two Sorted Arrays")
public class MedianOfTwoSortedArraysTest {

    @Test
    @DisplayName("Example 1: nums1 = [1,3], nums2 = [2] -> 2.00000")
    void example1() {
        int[] nums1 = new int[] {1, 3};
        int[] nums2 = new int[] {2};
        double expected = 2.0;
        double actual = new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2);

        assertEquals(expected, actual, 1e-5);
    }

    @Test
    @DisplayName("Example 2: nums1 = [1,2], nums2 = [3,4] -> 2.50000")
    void example2() {
        int[] nums1 = new int[] {1, 2};
        int[] nums2 = new int[] {3, 4};
        double expected = 2.5;
        double actual = new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2);

        assertEquals(expected, actual, 1e-5);
    }
}
