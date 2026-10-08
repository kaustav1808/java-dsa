package W9BTBSTI.AdditionalPractice.FlattenBinaryTreeToLinkedList;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 114. Flatten Binary Tree to Linked List
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("114. Flatten Binary Tree to Linked List")
public class FlattenBinaryTreeToLinkedListTest {

    @Test
    @DisplayName("Example 1: root = [1,2,5,3,4,null,6] -> [1,null,2,null,3,null,4,null,5,null,6]")
    void example1() {
        TreeNode root = TreeNode.of(1, 2, 5, 3, 4, null, 6);
        List<Integer> expected = list(1, null, 2, null, 3, null, 4, null, 5, null, 6);
        new FlattenBinaryTreeToLinkedList().flatten(root);
        List<Integer> actual = TreeNode.toList(root); // flatten changes root in place

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [] -> []")
    void example2() {
        TreeNode root = TreeNode.of();
        List<Integer> expected = list();
        new FlattenBinaryTreeToLinkedList().flatten(root);
        List<Integer> actual = TreeNode.toList(root); // flatten changes root in place

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: root = [0] -> [0]")
    void example3() {
        TreeNode root = TreeNode.of(0);
        List<Integer> expected = list(0);
        new FlattenBinaryTreeToLinkedList().flatten(root);
        List<Integer> actual = TreeNode.toList(root); // flatten changes root in place

        assertEquals(expected, actual);
    }
}
