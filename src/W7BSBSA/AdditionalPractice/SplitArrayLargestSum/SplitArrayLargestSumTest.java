package W7BSBSA.AdditionalPractice.SplitArrayLargestSum;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 410. Split Array Largest Sum
 * https://leetcode.com/problems/split-array-largest-sum/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("410. Split Array Largest Sum")
public class SplitArrayLargestSumTest {

    @Test
    @DisplayName("Example 1: nums = [7,2,5,10,8], k = 2 -> 18")
    void example1() {
        int[] nums = new int[] {7, 2, 5, 10, 8};
        int k = 2;
        int expected = 18;
        int actual = new SplitArrayLargestSum().splitArray(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,3,4,5], k = 2 -> 9")
    void example2() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int k = 2;
        int expected = 9;
        int actual = new SplitArrayLargestSum().splitArray(nums, k);

        assertEquals(expected, actual);
    }
}
