package W1APITTP.AdditionalPractice.MoveZeroes;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("283. Move Zeroes")
public class MoveZeroesTest {

    @Test
    @DisplayName("Example 1: nums = [0,1,0,3,12] -> [1,3,12,0,0]")
    void example1() {
        int[] nums = new int[] {0, 1, 0, 3, 12};
        int[] expected = new int[] {1, 3, 12, 0, 0};
        new MoveZeroes().moveZeroes(nums);
        int[] actual = nums; // moveZeroes changes nums in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [0] -> [0]")
    void example2() {
        int[] nums = new int[] {0};
        int[] expected = new int[] {0};
        new MoveZeroes().moveZeroes(nums);
        int[] actual = nums; // moveZeroes changes nums in place

        assertArrayEquals(expected, actual);
    }
}
