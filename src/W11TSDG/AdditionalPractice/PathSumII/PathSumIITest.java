package W11TSDG.AdditionalPractice.PathSumII;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 113. Path Sum II
 * https://leetcode.com/problems/path-sum-ii/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("113. Path Sum II")
public class PathSumIITest {

    @Test
    @DisplayName("Example 1: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22 -> [[5,4,11,2],[5,8,4,5]]")
    void example1() {
        TreeNode root = TreeNode.of(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1);
        int targetSum = 22;
        List<List<Integer>> expected = list(list(5, 4, 11, 2), list(5, 8, 4, 5));
        List<List<Integer>> actual = new PathSumII().pathSum(root, targetSum);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }

    @Test
    @DisplayName("Example 2: root = [1,2,3], targetSum = 5 -> []")
    void example2() {
        TreeNode root = TreeNode.of(1, 2, 3);
        int targetSum = 5;
        List<List<Integer>> expected = list();
        List<List<Integer>> actual = new PathSumII().pathSum(root, targetSum);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }

    @Test
    @DisplayName("Example 3: root = [1,2], targetSum = 0 -> []")
    void example3() {
        TreeNode root = TreeNode.of(1, 2);
        int targetSum = 0;
        List<List<Integer>> expected = list();
        List<List<Integer>> actual = new PathSumII().pathSum(root, targetSum);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }
}
