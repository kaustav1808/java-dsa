package W9BTBSTI.AdditionalPractice.CountGoodNodesInBinaryTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1448. Count Good Nodes in Binary Tree
 * https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1448. Count Good Nodes in Binary Tree")
public class CountGoodNodesInBinaryTreeTest {

    @Test
    @DisplayName("Example 1: root = [3,1,4,3,null,1,5] -> 4")
    void example1() {
        TreeNode root = TreeNode.of(3, 1, 4, 3, null, 1, 5);
        int expected = 4;
        int actual = new CountGoodNodesInBinaryTree().goodNodes(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [3,3,null,4,2] -> 3")
    void example2() {
        TreeNode root = TreeNode.of(3, 3, null, 4, 2);
        int expected = 3;
        int actual = new CountGoodNodesInBinaryTree().goodNodes(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: root = [1] -> 1")
    void example3() {
        TreeNode root = TreeNode.of(1);
        int expected = 1;
        int actual = new CountGoodNodesInBinaryTree().goodNodes(root);

        assertEquals(expected, actual);
    }
}
