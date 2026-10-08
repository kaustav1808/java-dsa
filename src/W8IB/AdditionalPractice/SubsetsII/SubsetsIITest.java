package W8IB.AdditionalPractice.SubsetsII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 90. Subsets II
 * https://leetcode.com/problems/subsets-ii/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("90. Subsets II")
public class SubsetsIITest {

    @Test
    @DisplayName("Example 1: nums = [1,2,2] -> [[],[1],[1,2],[1,2,2],[2],[2,2]]")
    void example1() {
        int[] nums = new int[] {1, 2, 2};
        List<List<Integer>> expected = list(list(), list(1), list(1, 2), list(1, 2, 2), list(2), list(2, 2));
        List<List<Integer>> actual = new SubsetsII().subsetsWithDup(nums);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }

    @Test
    @DisplayName("Example 2: nums = [0] -> [[],[0]]")
    void example2() {
        int[] nums = new int[] {0};
        List<List<Integer>> expected = list(list(), list(0));
        List<List<Integer>> actual = new SubsetsII().subsetsWithDup(nums);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }
}
