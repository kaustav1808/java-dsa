package W9BTBSTI.D57TRDAB.MaximumDepthOfBinaryTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("104. Maximum Depth of Binary Tree")
public class MaximumDepthOfBinaryTreeTest {

    @Test
    @DisplayName("Example 1: root = [3,9,20,null,null,15,7] -> 3")
    void example1() {
        TreeNode root = TreeNode.of(3, 9, 20, null, null, 15, 7);
        int expected = 3;
        int actual = new MaximumDepthOfBinaryTree().maxDepth(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [1,null,2] -> 2")
    void example2() {
        TreeNode root = TreeNode.of(1, null, 2);
        int expected = 2;
        int actual = new MaximumDepthOfBinaryTree().maxDepth(root);

        assertEquals(expected, actual);
    }
}
