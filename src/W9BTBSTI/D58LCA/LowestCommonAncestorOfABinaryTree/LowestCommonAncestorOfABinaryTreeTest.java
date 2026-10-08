package W9BTBSTI.D58LCA.LowestCommonAncestorOfABinaryTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 236. Lowest Common Ancestor of a Binary Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("236. Lowest Common Ancestor of a Binary Tree")
public class LowestCommonAncestorOfABinaryTreeTest {

    @Test
    @DisplayName("Example 1: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1 -> 3")
    void example1() {
        TreeNode root = TreeNode.of(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        TreeNode p = TreeNode.find(root, 5);
        TreeNode q = TreeNode.find(root, 1);
        Integer expected = 3;
        TreeNode actual = new LowestCommonAncestorOfABinaryTree().lowestCommonAncestor(root, p, q);
        Integer actualVal = actual == null ? null : actual.val;

        assertEquals(expected, actualVal);
    }

    @Test
    @DisplayName("Example 2: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4 -> 5")
    void example2() {
        TreeNode root = TreeNode.of(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        TreeNode p = TreeNode.find(root, 5);
        TreeNode q = TreeNode.find(root, 4);
        Integer expected = 5;
        TreeNode actual = new LowestCommonAncestorOfABinaryTree().lowestCommonAncestor(root, p, q);
        Integer actualVal = actual == null ? null : actual.val;

        assertEquals(expected, actualVal);
    }

    @Test
    @DisplayName("Example 3: root = [1,2], p = 1, q = 2 -> 1")
    void example3() {
        TreeNode root = TreeNode.of(1, 2);
        TreeNode p = TreeNode.find(root, 1);
        TreeNode q = TreeNode.find(root, 2);
        Integer expected = 1;
        TreeNode actual = new LowestCommonAncestorOfABinaryTree().lowestCommonAncestor(root, p, q);
        Integer actualVal = actual == null ? null : actual.val;

        assertEquals(expected, actualVal);
    }
}
