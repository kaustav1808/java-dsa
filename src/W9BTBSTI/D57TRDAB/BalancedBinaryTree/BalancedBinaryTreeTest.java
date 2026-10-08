package W9BTBSTI.D57TRDAB.BalancedBinaryTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 110. Balanced Binary Tree
 * https://leetcode.com/problems/balanced-binary-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("110. Balanced Binary Tree")
public class BalancedBinaryTreeTest {

    @Test
    @DisplayName("Example 1: root = [3,9,20,null,null,15,7] -> true")
    void example1() {
        TreeNode root = TreeNode.of(3, 9, 20, null, null, 15, 7);
        boolean expected = true;
        boolean actual = new BalancedBinaryTree().isBalanced(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [1,2,2,3,3,null,null,4,4] -> false")
    void example2() {
        TreeNode root = TreeNode.of(1, 2, 2, 3, 3, null, null, 4, 4);
        boolean expected = false;
        boolean actual = new BalancedBinaryTree().isBalanced(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: root = [] -> true")
    void example3() {
        TreeNode root = TreeNode.of();
        boolean expected = true;
        boolean actual = new BalancedBinaryTree().isBalanced(root);

        assertEquals(expected, actual);
    }
}
