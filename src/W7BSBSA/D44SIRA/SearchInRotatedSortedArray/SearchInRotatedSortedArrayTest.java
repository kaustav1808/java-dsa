package W7BSBSA.D44SIRA.SearchInRotatedSortedArray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 33. Search in Rotated Sorted Array
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("33. Search in Rotated Sorted Array")
public class SearchInRotatedSortedArrayTest {

    @Test
    @DisplayName("Example 1: nums = [4,5,6,7,0,1,2], target = 0 -> 4")
    void example1() {
        int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int expected = 4;
        int actual = new SearchInRotatedSortedArray().search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [4,5,6,7,0,1,2], target = 3 -> -1")
    void example2() {
        int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int expected = -1;
        int actual = new SearchInRotatedSortedArray().search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [1], target = 0 -> -1")
    void example3() {
        int[] nums = new int[] {1};
        int target = 0;
        int expected = -1;
        int actual = new SearchInRotatedSortedArray().search(nums, target);

        assertEquals(expected, actual);
    }
}
