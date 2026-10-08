package W7BSBSA.D43CBSAB.FindFirstAndLastPositionOfElementInSortedArray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 34. Find First and Last Position of Element in Sorted Array
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("34. Find First and Last Position of Element in Sorted Array")
public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    @DisplayName("Example 1: nums = [5,7,7,8,8,10], target = 8 -> [3,4]")
    void example1() {
        int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = new int[] {3, 4};
        int[] actual = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [5,7,7,8,8,10], target = 6 -> [-1,-1]")
    void example2() {
        int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = new int[] {-1, -1};
        int[] actual = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [], target = 0 -> [-1,-1]")
    void example3() {
        int[] nums = new int[] {};
        int target = 0;
        int[] expected = new int[] {-1, -1};
        int[] actual = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(expected, actual);
    }
}
