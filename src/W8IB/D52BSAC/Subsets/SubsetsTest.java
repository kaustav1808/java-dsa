package W8IB.D52BSAC.Subsets;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 78. Subsets
 * https://leetcode.com/problems/subsets/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("78. Subsets")
public class SubsetsTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3] -> [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]")
    void example1() {
        int[] nums = new int[] {1, 2, 3};
        List<List<Integer>> expected = list(
                list(),
                list(1),
                list(2),
                list(1, 2),
                list(3),
                list(1, 3),
                list(2, 3),
                list(1, 2, 3));
        List<List<Integer>> actual = new Subsets().subsets(nums);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }

    @Test
    @DisplayName("Example 2: nums = [0] -> [[],[0]]")
    void example2() {
        int[] nums = new int[] {0};
        List<List<Integer>> expected = list(list(), list(0));
        List<List<Integer>> actual = new Subsets().subsets(nums);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }
}
