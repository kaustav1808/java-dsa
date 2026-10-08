package W131DDP.AdditionalPractice.DeleteAndEarn;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 740. Delete and Earn
 * https://leetcode.com/problems/delete-and-earn/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("740. Delete and Earn")
public class DeleteAndEarnTest {

    @Test
    @DisplayName("Example 1: nums = [3,4,2] -> 6")
    void example1() {
        int[] nums = new int[] {3, 4, 2};
        int expected = 6;
        int actual = new DeleteAndEarn().deleteAndEarn(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [2,2,3,3,3,4] -> 9")
    void example2() {
        int[] nums = new int[] {2, 2, 3, 3, 3, 4};
        int expected = 9;
        int actual = new DeleteAndEarn().deleteAndEarn(nums);

        assertEquals(expected, actual);
    }
}
