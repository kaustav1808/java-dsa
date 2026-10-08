package W9BTBSTI.D61SATC.ConstructBinaryTreeFromPreorderAndInorderTraversal;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 105. Construct Binary Tree from Preorder and Inorder Traversal
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("105. Construct Binary Tree from Preorder and Inorder Traversal")
public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    @DisplayName("Example 1: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7] -> [3,9,20,null,null,15,7]")
    void example1() {
        int[] preorder = new int[] {3, 9, 20, 15, 7};
        int[] inorder = new int[] {9, 3, 15, 20, 7};
        List<Integer> expected = list(3, 9, 20, null, null, 15, 7);
        TreeNode result = new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(preorder, inorder);
        List<Integer> actual = TreeNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: preorder = [-1], inorder = [-1] -> [-1]")
    void example2() {
        int[] preorder = new int[] {-1};
        int[] inorder = new int[] {-1};
        List<Integer> expected = list(-1);
        TreeNode result = new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(preorder, inorder);
        List<Integer> actual = TreeNode.toList(result);

        assertEquals(expected, actual);
    }
}
