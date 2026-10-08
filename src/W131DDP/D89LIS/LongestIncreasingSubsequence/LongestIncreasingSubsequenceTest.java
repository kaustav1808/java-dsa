package W131DDP.D89LIS.LongestIncreasingSubsequence;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 300. Longest Increasing Subsequence
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("300. Longest Increasing Subsequence")
public class LongestIncreasingSubsequenceTest {

    @Test
    @DisplayName("Example 1: nums = [10,9,2,5,3,7,101,18] -> 4")
    void example1() {
        int[] nums = new int[] {10, 9, 2, 5, 3, 7, 101, 18};
        int expected = 4;
        int actual = new LongestIncreasingSubsequence().lengthOfLIS(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [0,1,0,3,2,3] -> 4")
    void example2() {
        int[] nums = new int[] {0, 1, 0, 3, 2, 3};
        int expected = 4;
        int actual = new LongestIncreasingSubsequence().lengthOfLIS(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [7,7,7,7,7,7,7] -> 1")
    void example3() {
        int[] nums = new int[] {7, 7, 7, 7, 7, 7, 7};
        int expected = 1;
        int actual = new LongestIncreasingSubsequence().lengthOfLIS(nums);

        assertEquals(expected, actual);
    }
}
