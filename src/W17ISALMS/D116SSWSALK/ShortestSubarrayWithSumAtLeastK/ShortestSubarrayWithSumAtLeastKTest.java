package W17ISALMS.D116SSWSALK.ShortestSubarrayWithSumAtLeastK;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 862. Shortest Subarray with Sum at Least K
 * https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("862. Shortest Subarray with Sum at Least K")
public class ShortestSubarrayWithSumAtLeastKTest {

    @Test
    @DisplayName("Example 1: nums = [1], k = 1 -> 1")
    void example1() {
        int[] nums = new int[] {1};
        int k = 1;
        int expected = 1;
        int actual = new ShortestSubarrayWithSumAtLeastK().shortestSubarray(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,2], k = 4 -> -1")
    void example2() {
        int[] nums = new int[] {1, 2};
        int k = 4;
        int expected = -1;
        int actual = new ShortestSubarrayWithSumAtLeastK().shortestSubarray(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [2,-1,2], k = 3 -> 3")
    void example3() {
        int[] nums = new int[] {2, -1, 2};
        int k = 3;
        int expected = 3;
        int actual = new ShortestSubarrayWithSumAtLeastK().shortestSubarray(nums, k);

        assertEquals(expected, actual);
    }
}
