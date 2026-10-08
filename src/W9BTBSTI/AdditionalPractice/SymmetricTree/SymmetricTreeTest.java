package W9BTBSTI.AdditionalPractice.SymmetricTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 101. Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("101. Symmetric Tree")
public class SymmetricTreeTest {

    @Test
    @DisplayName("Example 1: root = [1,2,2,3,4,4,3] -> true")
    void example1() {
        TreeNode root = TreeNode.of(1, 2, 2, 3, 4, 4, 3);
        boolean expected = true;
        boolean actual = new SymmetricTree().isSymmetric(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [1,2,2,null,3,null,3] -> false")
    void example2() {
        TreeNode root = TreeNode.of(1, 2, 2, null, 3, null, 3);
        boolean expected = false;
        boolean actual = new SymmetricTree().isSymmetric(root);

        assertEquals(expected, actual);
    }
}
