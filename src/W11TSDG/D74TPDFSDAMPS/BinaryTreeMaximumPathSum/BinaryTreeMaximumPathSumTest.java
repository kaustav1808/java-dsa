package W11TSDG.D74TPDFSDAMPS.BinaryTreeMaximumPathSum;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 124. Binary Tree Maximum Path Sum
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("124. Binary Tree Maximum Path Sum")
public class BinaryTreeMaximumPathSumTest {

    @Test
    @DisplayName("Example 1: root = [1,2,3] -> 6")
    void example1() {
        TreeNode root = TreeNode.of(1, 2, 3);
        int expected = 6;
        int actual = new BinaryTreeMaximumPathSum().maxPathSum(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [-10,9,20,null,null,15,7] -> 42")
    void example2() {
        TreeNode root = TreeNode.of(-10, 9, 20, null, null, 15, 7);
        int expected = 42;
        int actual = new BinaryTreeMaximumPathSum().maxPathSum(root);

        assertEquals(expected, actual);
    }
}
