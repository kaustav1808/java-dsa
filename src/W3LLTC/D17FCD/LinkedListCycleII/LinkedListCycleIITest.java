package W3LLTC.D17FCD.LinkedListCycleII;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 142. Linked List Cycle II
 * https://leetcode.com/problems/linked-list-cycle-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("142. Linked List Cycle II")
public class LinkedListCycleIITest {

    @Test
    @DisplayName("Example 1: head = [3,2,0,-4], pos = 1 -> tail connects to node index 1")
    void example1() {
        ListNode head = ListNode.withCycle(new int[] {3, 2, 0, -4}, 1);
        ListNode expected = ListNode.nodeAt(head, 1);
        ListNode actual = new LinkedListCycleII().detectCycle(head);

        assertTrue(actual == expected, () -> "expected " + "node at index 1 (val 2)" + " but got " + (actual == null ? "null" : "a node with val " + actual.val));
    }

    @Test
    @DisplayName("Example 2: head = [1,2], pos = 0 -> tail connects to node index 0")
    void example2() {
        ListNode head = ListNode.withCycle(new int[] {1, 2}, 0);
        ListNode expected = ListNode.nodeAt(head, 0);
        ListNode actual = new LinkedListCycleII().detectCycle(head);

        assertTrue(actual == expected, () -> "expected " + "node at index 0 (val 1)" + " but got " + (actual == null ? "null" : "a node with val " + actual.val));
    }

    @Test
    @DisplayName("Example 3: head = [1], pos = -1 -> no cycle")
    void example3() {
        ListNode head = ListNode.withCycle(new int[] {1}, -1);
        ListNode expected = null;
        ListNode actual = new LinkedListCycleII().detectCycle(head);

        assertTrue(actual == expected, () -> "expected " + "null (no cycle)" + " but got " + (actual == null ? "null" : "a node with val " + actual.val));
    }
}
