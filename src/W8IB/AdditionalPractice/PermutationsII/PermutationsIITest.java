package W8IB.AdditionalPractice.PermutationsII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 47. Permutations II
 * https://leetcode.com/problems/permutations-ii/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("47. Permutations II")
public class PermutationsIITest {

    @Test
    @DisplayName("Example 1: nums = [1,1,2] -> [[1,1,2], [1,2,1], [2,1,1]]")
    void example1() {
        int[] nums = new int[] {1, 1, 2};
        List<List<Integer>> expected = list(list(1, 1, 2), list(1, 2, 1), list(2, 1, 1));
        List<List<Integer>> actual = new PermutationsII().permuteUnique(nums);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,3] -> [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]")
    void example2() {
        int[] nums = new int[] {1, 2, 3};
        List<List<Integer>> expected = list(
                list(1, 2, 3),
                list(1, 3, 2),
                list(2, 1, 3),
                list(2, 3, 1),
                list(3, 1, 2),
                list(3, 2, 1));
        List<List<Integer>> actual = new PermutationsII().permuteUnique(nums);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }
}
