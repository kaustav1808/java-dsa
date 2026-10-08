package W7BSBSA.D43CBSAB.BinarySearch;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 704. Binary Search
 * https://leetcode.com/problems/binary-search/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("704. Binary Search")
public class BinarySearchTest {

    @Test
    @DisplayName("Example 1: nums = [-1,0,3,5,9,12], target = 9 -> 4")
    void example1() {
        int[] nums = new int[] {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expected = 4;
        int actual = new BinarySearch().search(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [-1,0,3,5,9,12], target = 2 -> -1")
    void example2() {
        int[] nums = new int[] {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expected = -1;
        int actual = new BinarySearch().search(nums, target);

        assertEquals(expected, actual);
    }
}
