package W9BTBSTI.D59LOBFS.BinaryTreeRightSideView;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 199. Binary Tree Right Side View
 * https://leetcode.com/problems/binary-tree-right-side-view/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("199. Binary Tree Right Side View")
public class BinaryTreeRightSideViewTest {

    @Test
    @DisplayName("Example 1: root = [1,2,3,null,5,null,4] -> [1,3,4]")
    void example1() {
        TreeNode root = TreeNode.of(1, 2, 3, null, 5, null, 4);
        List<Integer> expected = list(1, 3, 4);
        List<Integer> actual = new BinaryTreeRightSideView().rightSideView(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [1,2,3,4,null,null,null,5] -> [1,3,4,5]")
    void example2() {
        TreeNode root = TreeNode.of(1, 2, 3, 4, null, null, null, 5);
        List<Integer> expected = list(1, 3, 4, 5);
        List<Integer> actual = new BinaryTreeRightSideView().rightSideView(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: root = [1,null,3] -> [1,3]")
    void example3() {
        TreeNode root = TreeNode.of(1, null, 3);
        List<Integer> expected = list(1, 3);
        List<Integer> actual = new BinaryTreeRightSideView().rightSideView(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 4: root = [] -> []")
    void example4() {
        TreeNode root = TreeNode.of();
        List<Integer> expected = list();
        List<Integer> actual = new BinaryTreeRightSideView().rightSideView(root);

        assertEquals(expected, actual);
    }
}
