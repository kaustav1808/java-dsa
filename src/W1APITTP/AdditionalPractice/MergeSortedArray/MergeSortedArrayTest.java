package W1APITTP.AdditionalPractice.MergeSortedArray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("88. Merge Sorted Array")
public class MergeSortedArrayTest {

    @Test
    @DisplayName("Example 1: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 -> [1,2,2,3,5,6]")
    void example1() {
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[] {2, 5, 6};
        int n = 3;
        int[] expected = new int[] {1, 2, 2, 3, 5, 6};
        new MergeSortedArray().merge(nums1, m, nums2, n);
        int[] actual = nums1; // merge changes nums1 in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums1 = [1], m = 1, nums2 = [], n = 0 -> [1]")
    void example2() {
        int[] nums1 = new int[] {1};
        int m = 1;
        int[] nums2 = new int[] {};
        int n = 0;
        int[] expected = new int[] {1};
        new MergeSortedArray().merge(nums1, m, nums2, n);
        int[] actual = nums1; // merge changes nums1 in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums1 = [0], m = 0, nums2 = [1], n = 1 -> [1]")
    void example3() {
        int[] nums1 = new int[] {0};
        int m = 0;
        int[] nums2 = new int[] {1};
        int n = 1;
        int[] expected = new int[] {1};
        new MergeSortedArray().merge(nums1, m, nums2, n);
        int[] actual = nums1; // merge changes nums1 in place

        assertArrayEquals(expected, actual);
    }
}
