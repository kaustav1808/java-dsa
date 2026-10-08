package W1APITTP.D3FSRWPAIPP.RemoveDuplicatesFromSortedArray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("26. Remove Duplicates from Sorted Array")
public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    @DisplayName("Example 1: nums = [1,1,2] -> 2, nums = [1,2,_]")
    void example1() {
        int[] nums = new int[] {1, 1, 2};
        int expectedK = 2;
        int[] expectedNums = new int[] {1, 2}; // first k elements
        int k = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        int[] firstK = Arrays.copyOf(nums, Math.max(0, Math.min(k, nums.length)));

        assertEquals(expectedK, k);
        assertArrayEquals(expectedNums, firstK);
    }

    @Test
    @DisplayName("Example 2: nums = [0,0,1,1,1,2,2,3,3,4] -> 5, nums = [0,1,2,3,4,_,_,_,_,_]")
    void example2() {
        int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedK = 5;
        int[] expectedNums = new int[] {0, 1, 2, 3, 4}; // first k elements
        int k = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        int[] firstK = Arrays.copyOf(nums, Math.max(0, Math.min(k, nums.length)));

        assertEquals(expectedK, k);
        assertArrayEquals(expectedNums, firstK);
    }
}
