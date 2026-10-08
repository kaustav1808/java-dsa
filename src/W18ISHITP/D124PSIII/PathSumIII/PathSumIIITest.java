package W18ISHITP.D124PSIII.PathSumIII;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 437. Path Sum III
 * https://leetcode.com/problems/path-sum-iii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("437. Path Sum III")
public class PathSumIIITest {

    @Test
    @DisplayName("Example 1: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8 -> 3")
    void example1() {
        TreeNode root = TreeNode.of(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1);
        int targetSum = 8;
        int expected = 3;
        int actual = new PathSumIII().pathSum(root, targetSum);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22 -> 3")
    void example2() {
        TreeNode root = TreeNode.of(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1);
        int targetSum = 22;
        int expected = 3;
        int actual = new PathSumIII().pathSum(root, targetSum);

        assertEquals(expected, actual);
    }
}
