package W9BTBSTI.D60BSTVAIOP.KthSmallestElementInABST;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 230. Kth Smallest Element in a BST
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("230. Kth Smallest Element in a BST")
public class KthSmallestElementInABSTTest {

    @Test
    @DisplayName("Example 1: root = [3,1,4,null,2], k = 1 -> 1")
    void example1() {
        TreeNode root = TreeNode.of(3, 1, 4, null, 2);
        int k = 1;
        int expected = 1;
        int actual = new KthSmallestElementInABST().kthSmallest(root, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [5,3,6,2,4,null,null,1], k = 3 -> 3")
    void example2() {
        TreeNode root = TreeNode.of(5, 3, 6, 2, 4, null, null, 1);
        int k = 3;
        int expected = 3;
        int actual = new KthSmallestElementInABST().kthSmallest(root, k);

        assertEquals(expected, actual);
    }
}
