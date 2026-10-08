package W7BSBSA.D45MIARA.FindMinimumInRotatedSortedArray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 153. Find Minimum in Rotated Sorted Array
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("153. Find Minimum in Rotated Sorted Array")
public class FindMinimumInRotatedSortedArrayTest {

    @Test
    @DisplayName("Example 1: nums = [3,4,5,1,2] -> 1")
    void example1() {
        int[] nums = new int[] {3, 4, 5, 1, 2};
        int expected = 1;
        int actual = new FindMinimumInRotatedSortedArray().findMin(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [4,5,6,7,0,1,2] -> 0")
    void example2() {
        int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        int expected = 0;
        int actual = new FindMinimumInRotatedSortedArray().findMin(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [11,13,15,17] -> 11")
    void example3() {
        int[] nums = new int[] {11, 13, 15, 17};
        int expected = 11;
        int actual = new FindMinimumInRotatedSortedArray().findMin(nums);

        assertEquals(expected, actual);
    }
}
