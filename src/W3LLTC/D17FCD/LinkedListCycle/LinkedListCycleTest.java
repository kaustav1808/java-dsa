package W3LLTC.D17FCD.LinkedListCycle;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 141. Linked List Cycle
 * https://leetcode.com/problems/linked-list-cycle/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("141. Linked List Cycle")
public class LinkedListCycleTest {

    @Test
    @DisplayName("Example 1: head = [3,2,0,-4], pos = 1 -> true")
    void example1() {
        ListNode head = ListNode.withCycle(new int[] {3, 2, 0, -4}, 1);
        boolean expected = true;
        boolean actual = new LinkedListCycle().hasCycle(head);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: head = [1,2], pos = 0 -> true")
    void example2() {
        ListNode head = ListNode.withCycle(new int[] {1, 2}, 0);
        boolean expected = true;
        boolean actual = new LinkedListCycle().hasCycle(head);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: head = [1], pos = -1 -> false")
    void example3() {
        ListNode head = ListNode.withCycle(new int[] {1}, -1);
        boolean expected = false;
        boolean actual = new LinkedListCycle().hasCycle(head);

        assertEquals(expected, actual);
    }
}
