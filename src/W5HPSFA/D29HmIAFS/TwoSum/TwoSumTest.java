package W5HPSFA.D29HmIAFS.TwoSum;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1. Two Sum")
public class TwoSumTest {

    @Test
    @DisplayName("Example 1: nums = [2,7,11,15], target = 9 -> [0,1]")
    void example1() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[] {0, 1};
        int[] actual = new TwoSum().twoSum(nums, target);

        assertArrayEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 2: nums = [3,2,4], target = 6 -> [1,2]")
    void example2() {
        int[] nums = new int[] {3, 2, 4};
        int target = 6;
        int[] expected = new int[] {1, 2};
        int[] actual = new TwoSum().twoSum(nums, target);

        assertArrayEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 3: nums = [3,3], target = 6 -> [0,1]")
    void example3() {
        int[] nums = new int[] {3, 3};
        int target = 6;
        int[] expected = new int[] {0, 1};
        int[] actual = new TwoSum().twoSum(nums, target);

        assertArrayEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }
}
