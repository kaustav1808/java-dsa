package W1APITTP.D2ODPAAT.ThreeSum;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 15. 3Sum
 * https://leetcode.com/problems/3sum/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("15. 3Sum")
public class ThreeSumTest {

    @Test
    @DisplayName("Example 1: nums = [-1,0,1,2,-1,-4] -> [[-1,-1,2],[-1,0,1]]")
    void example1() {
        int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = list(list(-1, -1, 2), list(-1, 0, 1));
        List<List<Integer>> actual = new ThreeSum().threeSum(nums);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }

    @Test
    @DisplayName("Example 2: nums = [0,1,1] -> []")
    void example2() {
        int[] nums = new int[] {0, 1, 1};
        List<List<Integer>> expected = list();
        List<List<Integer>> actual = new ThreeSum().threeSum(nums);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }

    @Test
    @DisplayName("Example 3: nums = [0,0,0] -> [[0,0,0]]")
    void example3() {
        int[] nums = new int[] {0, 0, 0};
        List<List<Integer>> expected = list(list(0, 0, 0));
        List<List<Integer>> actual = new ThreeSum().threeSum(nums);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }
}
