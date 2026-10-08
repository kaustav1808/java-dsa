package W9BTBSTI.AdditionalPractice.InvertBinaryTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("226. Invert Binary Tree")
public class InvertBinaryTreeTest {

    @Test
    @DisplayName("Example 1: root = [4,2,7,1,3,6,9] -> [4,7,2,9,6,3,1]")
    void example1() {
        TreeNode root = TreeNode.of(4, 2, 7, 1, 3, 6, 9);
        List<Integer> expected = list(4, 7, 2, 9, 6, 3, 1);
        TreeNode result = new InvertBinaryTree().invertTree(root);
        List<Integer> actual = TreeNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [2,1,3] -> [2,3,1]")
    void example2() {
        TreeNode root = TreeNode.of(2, 1, 3);
        List<Integer> expected = list(2, 3, 1);
        TreeNode result = new InvertBinaryTree().invertTree(root);
        List<Integer> actual = TreeNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: root = [] -> []")
    void example3() {
        TreeNode root = TreeNode.of();
        List<Integer> expected = list();
        TreeNode result = new InvertBinaryTree().invertTree(root);
        List<Integer> actual = TreeNode.toList(result);

        assertEquals(expected, actual);
    }
}
