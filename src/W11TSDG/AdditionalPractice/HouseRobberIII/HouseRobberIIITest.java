package W11TSDG.AdditionalPractice.HouseRobberIII;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 337. House Robber III
 * https://leetcode.com/problems/house-robber-iii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("337. House Robber III")
public class HouseRobberIIITest {

    @Test
    @DisplayName("Example 1: root = [3,2,3,null,3,null,1] -> 7")
    void example1() {
        TreeNode root = TreeNode.of(3, 2, 3, null, 3, null, 1);
        int expected = 7;
        int actual = new HouseRobberIII().rob(root);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [3,4,5,1,3,null,1] -> 9")
    void example2() {
        TreeNode root = TreeNode.of(3, 4, 5, 1, 3, null, 1);
        int expected = 9;
        int actual = new HouseRobberIII().rob(root);

        assertEquals(expected, actual);
    }
}
