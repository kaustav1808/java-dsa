package W2SWFV.AdditionalPractice.MaxConsecutiveOnesIII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1004. Max Consecutive Ones III
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1004. Max Consecutive Ones III")
public class MaxConsecutiveOnesIIITest {

    @Test
    @DisplayName("Example 1: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2 -> 6")
    void example1() {
        int[] nums = new int[] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int expected = 6;
        int actual = new MaxConsecutiveOnesIII().longestOnes(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3 -> 10")
    void example2() {
        int[] nums = new int[] {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        int expected = 10;
        int actual = new MaxConsecutiveOnesIII().longestOnes(nums, k);

        assertEquals(expected, actual);
    }
}
