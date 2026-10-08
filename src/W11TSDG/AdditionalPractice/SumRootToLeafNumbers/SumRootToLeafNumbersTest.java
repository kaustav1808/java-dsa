package W11TSDG.AdditionalPractice.SumRootToLeafNumbers;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 129. Sum Root to Leaf Numbers
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("129. Sum Root to Leaf Numbers")
public class SumRootToLeafNumbersTest {

    @Test
    @DisplayName("Example 1: root = [1,2,3] -> 25")
    void example1() {
        TreeNode root = TreeNode.of(1, 2, 3);
        int expected = 25;
        int actual = new SumRootToLeafNumbers().sumNumbers(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [4,9,0,5,1] -> 1026")
    void example2() {
        TreeNode root = TreeNode.of(4, 9, 0, 5, 1);
        int expected = 1026;
        int actual = new SumRootToLeafNumbers().sumNumbers(root);

        assertEquals(expected, actual);
    }
}
