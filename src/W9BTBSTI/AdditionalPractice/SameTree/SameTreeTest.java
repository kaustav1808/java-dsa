package W9BTBSTI.AdditionalPractice.SameTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 100. Same Tree
 * https://leetcode.com/problems/same-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("100. Same Tree")
public class SameTreeTest {

    @Test
    @DisplayName("Example 1: p = [1,2,3], q = [1,2,3] -> true")
    void example1() {
        TreeNode p = TreeNode.of(1, 2, 3);
        TreeNode q = TreeNode.of(1, 2, 3);
        boolean expected = true;
        boolean actual = new SameTree().isSameTree(p, q);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: p = [1,2], q = [1,null,2] -> false")
    void example2() {
        TreeNode p = TreeNode.of(1, 2);
        TreeNode q = TreeNode.of(1, null, 2);
        boolean expected = false;
        boolean actual = new SameTree().isSameTree(p, q);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: p = [1,2,1], q = [1,1,2] -> false")
    void example3() {
        TreeNode p = TreeNode.of(1, 2, 1);
        TreeNode q = TreeNode.of(1, 1, 2);
        boolean expected = false;
        boolean actual = new SameTree().isSameTree(p, q);

        assertEquals(expected, actual);
    }
}
