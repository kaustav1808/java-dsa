package W1APITTP.D3FSRWPAIPP.SortColors;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 75. Sort Colors
 * https://leetcode.com/problems/sort-colors/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("75. Sort Colors")
public class SortColorsTest {

    @Test
    @DisplayName("Example 1: nums = [2,0,2,1,1,0] -> [0,0,1,1,2,2]")
    void example1() {
        int[] nums = new int[] {2, 0, 2, 1, 1, 0};
        int[] expected = new int[] {0, 0, 1, 1, 2, 2};
        new SortColors().sortColors(nums);
        int[] actual = nums; // sortColors changes nums in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [2,0,1] -> [0,1,2]")
    void example2() {
        int[] nums = new int[] {2, 0, 1};
        int[] expected = new int[] {0, 1, 2};
        new SortColors().sortColors(nums);
        int[] actual = nums; // sortColors changes nums in place

        assertArrayEquals(expected, actual);
    }
}
