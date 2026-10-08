package W11TSDG.D74TPDFSDAMPS.DiameterOfBinaryTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 543. Diameter of Binary Tree
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("543. Diameter of Binary Tree")
public class DiameterOfBinaryTreeTest {

    @Test
    @DisplayName("Example 1: root = [1,2,3,4,5] -> 3")
    void example1() {
        TreeNode root = TreeNode.of(1, 2, 3, 4, 5);
        int expected = 3;
        int actual = new DiameterOfBinaryTree().diameterOfBinaryTree(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [1,2] -> 1")
    void example2() {
        TreeNode root = TreeNode.of(1, 2);
        int expected = 1;
        int actual = new DiameterOfBinaryTree().diameterOfBinaryTree(root);

        assertEquals(expected, actual);
    }
}
