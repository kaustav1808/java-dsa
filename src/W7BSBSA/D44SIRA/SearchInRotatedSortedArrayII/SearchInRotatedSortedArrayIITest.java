package W7BSBSA.D44SIRA.SearchInRotatedSortedArrayII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 81. Search in Rotated Sorted Array II
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("81. Search in Rotated Sorted Array II")
public class SearchInRotatedSortedArrayIITest {

    @Test
    @DisplayName("Example 1: nums = [2,5,6,0,0,1,2], target = 0 -> true")
    void example1() {
        int[] nums = new int[] {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        boolean expected = true;
        boolean actual = new SearchInRotatedSortedArrayII().search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [2,5,6,0,0,1,2], target = 3 -> false")
    void example2() {
        int[] nums = new int[] {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        boolean expected = false;
        boolean actual = new SearchInRotatedSortedArrayII().search(nums, target);

        assertEquals(expected, actual);
    }
}
