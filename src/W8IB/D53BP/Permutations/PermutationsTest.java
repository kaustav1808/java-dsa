package W8IB.D53BP.Permutations;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 46. Permutations
 * https://leetcode.com/problems/permutations/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("46. Permutations")
public class PermutationsTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3] -> [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]")
    void example1() {
        int[] nums = new int[] {1, 2, 3};
        List<List<Integer>> expected = list(
                list(1, 2, 3),
                list(1, 3, 2),
                list(2, 1, 3),
                list(2, 3, 1),
                list(3, 1, 2),
                list(3, 2, 1));
        List<List<Integer>> actual = new Permutations().permute(nums);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }

    @Test
    @DisplayName("Example 2: nums = [0,1] -> [[0,1],[1,0]]")
    void example2() {
        int[] nums = new int[] {0, 1};
        List<List<Integer>> expected = list(list(0, 1), list(1, 0));
        List<List<Integer>> actual = new Permutations().permute(nums);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }

    @Test
    @DisplayName("Example 3: nums = [1] -> [[1]]")
    void example3() {
        int[] nums = new int[] {1};
        List<List<Integer>> expected = list(list(1));
        List<List<Integer>> actual = new Permutations().permute(nums);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }
}
