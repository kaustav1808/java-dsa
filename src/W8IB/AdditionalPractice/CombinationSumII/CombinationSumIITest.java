package W8IB.AdditionalPractice.CombinationSumII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 40. Combination Sum II
 * https://leetcode.com/problems/combination-sum-ii/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("40. Combination Sum II")
public class CombinationSumIITest {

    @Test
    @DisplayName("Example 1: candidates = [10,1,2,7,6,1,5], target = 8 -> [[1,1,6], [1,2,5], [1,7], [2,6]]")
    void example1() {
        int[] candidates = new int[] {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> expected = list(list(1, 1, 6), list(1, 2, 5), list(1, 7), list(2, 6));
        List<List<Integer>> actual = new CombinationSumII().combinationSum2(candidates, target);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }

    @Test
    @DisplayName("Example 2: candidates = [2,5,2,1,2], target = 5 -> [[1,2,2], [5]]")
    void example2() {
        int[] candidates = new int[] {2, 5, 2, 1, 2};
        int target = 5;
        List<List<Integer>> expected = list(list(1, 2, 2), list(5));
        List<List<Integer>> actual = new CombinationSumII().combinationSum2(candidates, target);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }
}
