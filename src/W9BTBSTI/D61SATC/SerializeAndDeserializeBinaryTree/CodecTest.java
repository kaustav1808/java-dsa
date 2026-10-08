package W9BTBSTI.D61SATC.SerializeAndDeserializeBinaryTree;

import common.TreeNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 297. Serialize and Deserialize Binary Tree
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("297. Serialize and Deserialize Binary Tree")
public class CodecTest {

    @Test
    @DisplayName("Example 1: root = [1,2,3,null,null,4,5] -> [1,2,3,null,null,4,5]")
    void example1() {
        TreeNode root = TreeNode.of(1, 2, 3, null, null, 4, 5);
        List<Integer> expected = list(1, 2, 3, null, null, 4, 5);
        Codec ser = new Codec();
        Codec deser = new Codec();
        TreeNode ans = deser.deserialize(ser.serialize(root));

        assertEquals(expected, TreeNode.toList(ans));
    }

    @Test
    @DisplayName("Example 2: root = [] -> []")
    void example2() {
        TreeNode root = TreeNode.of();
        List<Integer> expected = list();
        Codec ser = new Codec();
        Codec deser = new Codec();
        TreeNode ans = deser.deserialize(ser.serialize(root));

        assertEquals(expected, TreeNode.toList(ans));
    }
}
