package W5HPSFA.D32PSVBAR.SubarraySumsDivisibleByK;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 974. Subarray Sums Divisible by K
 * https://leetcode.com/problems/subarray-sums-divisible-by-k/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("974. Subarray Sums Divisible by K")
public class SubarraySumsDivisibleByKTest {

    @Test
    @DisplayName("Example 1: nums = [4,5,0,-2,-3,1], k = 5 -> 7")
    void example1() {
        int[] nums = new int[] {4, 5, 0, -2, -3, 1};
        int k = 5;
        int expected = 7;
        int actual = new SubarraySumsDivisibleByK().subarraysDivByK(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [5], k = 9 -> 0")
    void example2() {
        int[] nums = new int[] {5};
        int k = 9;
        int expected = 0;
        int actual = new SubarraySumsDivisibleByK().subarraysDivByK(nums, k);

        assertEquals(expected, actual);
    }
}
