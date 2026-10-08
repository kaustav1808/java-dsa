package W3LLTC.D19RNIKG.ReverseNodesInKGroup;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 25. Reverse Nodes in k-Group
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("25. Reverse Nodes in k-Group")
public class ReverseNodesInKGroupTest {

    @Test
    @DisplayName("Example 1: head = [1,2,3,4,5], k = 2 -> [2,1,4,3,5]")
    void example1() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        int k = 2;
        List<Integer> expected = list(2, 1, 4, 3, 5);
        ListNode result = new ReverseNodesInKGroup().reverseKGroup(head, k);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: head = [1,2,3,4,5], k = 3 -> [3,2,1,4,5]")
    void example2() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        int k = 3;
        List<Integer> expected = list(3, 2, 1, 4, 5);
        ListNode result = new ReverseNodesInKGroup().reverseKGroup(head, k);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }
}
