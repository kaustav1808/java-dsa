package W9BTBSTI.D59LOBFS.BinaryTreeLevelOrderTraversal;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 102. Binary Tree Level Order Traversal
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("102. Binary Tree Level Order Traversal")
public class BinaryTreeLevelOrderTraversalTest {

    @Test
    @DisplayName("Example 1: root = [3,9,20,null,null,15,7] -> [[3],[9,20],[15,7]]")
    void example1() {
        TreeNode root = TreeNode.of(3, 9, 20, null, null, 15, 7);
        List<List<Integer>> expected = list(list(3), list(9, 20), list(15, 7));
        List<List<Integer>> actual = new BinaryTreeLevelOrderTraversal().levelOrder(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [1] -> [[1]]")
    void example2() {
        TreeNode root = TreeNode.of(1);
        List<List<Integer>> expected = list(list(1));
        List<List<Integer>> actual = new BinaryTreeLevelOrderTraversal().levelOrder(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: root = [] -> []")
    void example3() {
        TreeNode root = TreeNode.of();
        List<List<Integer>> expected = list();
        List<List<Integer>> actual = new BinaryTreeLevelOrderTraversal().levelOrder(root);

        assertEquals(expected, actual);
    }
}
