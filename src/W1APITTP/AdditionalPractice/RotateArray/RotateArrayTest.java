package W1APITTP.AdditionalPractice.RotateArray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 189. Rotate Array
 * https://leetcode.com/problems/rotate-array/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("189. Rotate Array")
public class RotateArrayTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3,4,5,6,7], k = 3 -> [5,6,7,1,2,3,4]")
    void example1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = new int[] {5, 6, 7, 1, 2, 3, 4};
        new RotateArray().rotate(nums, k);
        int[] actual = nums; // rotate changes nums in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [-1,-100,3,99], k = 2 -> [3,99,-1,-100]")
    void example2() {
        int[] nums = new int[] {-1, -100, 3, 99};
        int k = 2;
        int[] expected = new int[] {3, 99, -1, -100};
        new RotateArray().rotate(nums, k);
        int[] actual = nums; // rotate changes nums in place

        assertArrayEquals(expected, actual);
    }
}
