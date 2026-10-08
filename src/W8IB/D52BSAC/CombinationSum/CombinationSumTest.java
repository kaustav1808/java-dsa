package W8IB.D52BSAC.CombinationSum;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 39. Combination Sum
 * https://leetcode.com/problems/combination-sum/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("39. Combination Sum")
public class CombinationSumTest {

    @Test
    @DisplayName("Example 1: candidates = [2,3,6,7], target = 7 -> [[2,2,3],[7]]")
    void example1() {
        int[] candidates = new int[] {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> expected = list(list(2, 2, 3), list(7));
        List<List<Integer>> actual = new CombinationSum().combinationSum(candidates, target);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }

    @Test
    @DisplayName("Example 2: candidates = [2,3,5], target = 8 -> [[2,2,2,2],[2,3,3],[3,5]]")
    void example2() {
        int[] candidates = new int[] {2, 3, 5};
        int target = 8;
        List<List<Integer>> expected = list(list(2, 2, 2, 2), list(2, 3, 3), list(3, 5));
        List<List<Integer>> actual = new CombinationSum().combinationSum(candidates, target);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }

    @Test
    @DisplayName("Example 3: candidates = [2], target = 1 -> []")
    void example3() {
        int[] candidates = new int[] {2};
        int target = 1;
        List<List<Integer>> expected = list();
        List<List<Integer>> actual = new CombinationSum().combinationSum(candidates, target);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }
}
