package W142DDP.AdditionalPractice.TargetSum;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 494. Target Sum
 * https://leetcode.com/problems/target-sum/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("494. Target Sum")
public class TargetSumTest {

    @Test
    @DisplayName("Example 1: nums = [1,1,1,1,1], target = 3 -> 5")
    void example1() {
        int[] nums = new int[] {1, 1, 1, 1, 1};
        int target = 3;
        int expected = 5;
        int actual = new TargetSum().findTargetSumWays(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1], target = 1 -> 1")
    void example2() {
        int[] nums = new int[] {1};
        int target = 1;
        int expected = 1;
        int actual = new TargetSum().findTargetSumWays(nums, target);

        assertEquals(expected, actual);
    }
}
