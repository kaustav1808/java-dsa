package W131DDP.AdditionalPractice.CombinationSumIV;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 377. Combination Sum IV
 * https://leetcode.com/problems/combination-sum-iv/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("377. Combination Sum IV")
public class CombinationSumIVTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3], target = 4 -> 7")
    void example1() {
        int[] nums = new int[] {1, 2, 3};
        int target = 4;
        int expected = 7;
        int actual = new CombinationSumIV().combinationSum4(nums, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [9], target = 3 -> 0")
    void example2() {
        int[] nums = new int[] {9};
        int target = 3;
        int expected = 0;
        int actual = new CombinationSumIV().combinationSum4(nums, target);

        assertEquals(expected, actual);
    }
}
