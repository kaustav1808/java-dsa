package W5HPSFA.D31PSWAHm.SubarraySumEqualsK;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 560. Subarray Sum Equals K
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("560. Subarray Sum Equals K")
public class SubarraySumEqualsKTest {

    @Test
    @DisplayName("Example 1: nums = [1,1,1], k = 2 -> 2")
    void example1() {
        int[] nums = new int[] {1, 1, 1};
        int k = 2;
        int expected = 2;
        int actual = new SubarraySumEqualsK().subarraySum(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,3], k = 3 -> 2")
    void example2() {
        int[] nums = new int[] {1, 2, 3};
        int k = 3;
        int expected = 2;
        int actual = new SubarraySumEqualsK().subarraySum(nums, k);

        assertEquals(expected, actual);
    }
}
