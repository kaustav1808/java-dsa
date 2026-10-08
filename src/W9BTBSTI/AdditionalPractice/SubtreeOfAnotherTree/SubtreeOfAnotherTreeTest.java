package W9BTBSTI.AdditionalPractice.SubtreeOfAnotherTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 572. Subtree of Another Tree
 * https://leetcode.com/problems/subtree-of-another-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("572. Subtree of Another Tree")
public class SubtreeOfAnotherTreeTest {

    @Test
    @DisplayName("Example 1: root = [3,4,5,1,2], subRoot = [4,1,2] -> true")
    void example1() {
        TreeNode root = TreeNode.of(3, 4, 5, 1, 2);
        TreeNode subRoot = TreeNode.of(4, 1, 2);
        boolean expected = true;
        boolean actual = new SubtreeOfAnotherTree().isSubtree(root, subRoot);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2] -> false")
    void example2() {
        TreeNode root = TreeNode.of(3, 4, 5, 1, 2, null, null, null, null, 0);
        TreeNode subRoot = TreeNode.of(4, 1, 2);
        boolean expected = false;
        boolean actual = new SubtreeOfAnotherTree().isSubtree(root, subRoot);

        assertEquals(expected, actual);
    }
}
