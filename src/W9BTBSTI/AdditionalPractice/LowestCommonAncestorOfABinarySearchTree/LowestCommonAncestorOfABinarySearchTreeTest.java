package W9BTBSTI.AdditionalPractice.LowestCommonAncestorOfABinarySearchTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 235. Lowest Common Ancestor of a Binary Search Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("235. Lowest Common Ancestor of a Binary Search Tree")
public class LowestCommonAncestorOfABinarySearchTreeTest {

    @Test
    @DisplayName("Example 1: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8 -> 6")
    void example1() {
        TreeNode root = TreeNode.of(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        TreeNode p = TreeNode.find(root, 2);
        TreeNode q = TreeNode.find(root, 8);
        Integer expected = 6;
        TreeNode actual = new LowestCommonAncestorOfABinarySearchTree().lowestCommonAncestor(root, p, q);
        Integer actualVal = actual == null ? null : actual.val;

        assertEquals(expected, actualVal);
    }

    @Test
    @DisplayName("Example 2: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4 -> 2")
    void example2() {
        TreeNode root = TreeNode.of(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        TreeNode p = TreeNode.find(root, 2);
        TreeNode q = TreeNode.find(root, 4);
        Integer expected = 2;
        TreeNode actual = new LowestCommonAncestorOfABinarySearchTree().lowestCommonAncestor(root, p, q);
        Integer actualVal = actual == null ? null : actual.val;

        assertEquals(expected, actualVal);
    }

    @Test
    @DisplayName("Example 3: root = [2,1], p = 2, q = 1 -> 2")
    void example3() {
        TreeNode root = TreeNode.of(2, 1);
        TreeNode p = TreeNode.find(root, 2);
        TreeNode q = TreeNode.find(root, 1);
        Integer expected = 2;
        TreeNode actual = new LowestCommonAncestorOfABinarySearchTree().lowestCommonAncestor(root, p, q);
        Integer actualVal = actual == null ? null : actual.val;

        assertEquals(expected, actualVal);
    }
}
