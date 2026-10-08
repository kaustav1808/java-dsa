package W17ISALMS.AdditionalPractice.LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
 * https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit")
public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimitTest {

    @Test
    @DisplayName("Example 1: nums = [8,2,4,7], limit = 4 -> 2")
    void example1() {
        int[] nums = new int[] {8, 2, 4, 7};
        int limit = 4;
        int expected = 2;
        int actual = new LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit().longestSubarray(nums, limit);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [10,1,2,4,7,2], limit = 5 -> 4")
    void example2() {
        int[] nums = new int[] {10, 1, 2, 4, 7, 2};
        int limit = 5;
        int expected = 4;
        int actual = new LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit().longestSubarray(nums, limit);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [4,2,2,2,4,4,2,2], limit = 0 -> 3")
    void example3() {
        int[] nums = new int[] {4, 2, 2, 2, 4, 4, 2, 2};
        int limit = 0;
        int expected = 3;
        int actual = new LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit().longestSubarray(nums, limit);

        assertEquals(expected, actual);
    }
}
