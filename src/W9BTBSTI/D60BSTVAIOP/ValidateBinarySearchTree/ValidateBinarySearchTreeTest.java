package W9BTBSTI.D60BSTVAIOP.ValidateBinarySearchTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 98. Validate Binary Search Tree
 * https://leetcode.com/problems/validate-binary-search-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("98. Validate Binary Search Tree")
public class ValidateBinarySearchTreeTest {

    @Test
    @DisplayName("Example 1: root = [2,1,3] -> true")
    void example1() {
        TreeNode root = TreeNode.of(2, 1, 3);
        boolean expected = true;
        boolean actual = new ValidateBinarySearchTree().isValidBST(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [5,1,4,null,null,3,6] -> false")
    void example2() {
        TreeNode root = TreeNode.of(5, 1, 4, null, null, 3, 6);
        boolean expected = false;
        boolean actual = new ValidateBinarySearchTree().isValidBST(root);

        assertEquals(expected, actual);
    }
}
