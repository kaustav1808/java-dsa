package W1APITTP.D3FSRWPAIPP.RemoveDuplicatesFromSortedArrayII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 80. Remove Duplicates from Sorted Array II
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("80. Remove Duplicates from Sorted Array II")
public class RemoveDuplicatesFromSortedArrayIITest {

    @Test
    @DisplayName("Example 1: nums = [1,1,1,2,2,3] -> 5, nums = [1,1,2,2,3,_]")
    void example1() {
        int[] nums = new int[] {1, 1, 1, 2, 2, 3};
        int expectedK = 5;
        int[] expectedNums = new int[] {1, 1, 2, 2, 3}; // first k elements
        int k = new RemoveDuplicatesFromSortedArrayII().removeDuplicates(nums);
        int[] firstK = Arrays.copyOf(nums, Math.max(0, Math.min(k, nums.length)));

        assertEquals(expectedK, k);
        assertArrayEquals(expectedNums, firstK);
    }

    @Test
    @DisplayName("Example 2: nums = [0,0,1,1,1,1,2,3,3] -> 7, nums = [0,0,1,1,2,3,3,_,_]")
    void example2() {
        int[] nums = new int[] {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int expectedK = 7;
        int[] expectedNums = new int[] {0, 0, 1, 1, 2, 3, 3}; // first k elements
        int k = new RemoveDuplicatesFromSortedArrayII().removeDuplicates(nums);
        int[] firstK = Arrays.copyOf(nums, Math.max(0, Math.min(k, nums.length)));

        assertEquals(expectedK, k);
        assertArrayEquals(expectedNums, firstK);
    }
}
