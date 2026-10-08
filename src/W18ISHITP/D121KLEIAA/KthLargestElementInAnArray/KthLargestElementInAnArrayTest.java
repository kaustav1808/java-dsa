package W18ISHITP.D121KLEIAA.KthLargestElementInAnArray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 215. Kth Largest Element in an Array
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("215. Kth Largest Element in an Array")
public class KthLargestElementInAnArrayTest {

    @Test
    @DisplayName("Example 1: nums = [3,2,1,5,6,4], k = 2 -> 5")
    void example1() {
        int[] nums = new int[] {3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        int actual = new KthLargestElementInAnArray().findKthLargest(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [3,2,3,1,2,4,5,5,6], k = 4 -> 4")
    void example2() {
        int[] nums = new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 4;
        int actual = new KthLargestElementInAnArray().findKthLargest(nums, k);

        assertEquals(expected, actual);
    }
}
