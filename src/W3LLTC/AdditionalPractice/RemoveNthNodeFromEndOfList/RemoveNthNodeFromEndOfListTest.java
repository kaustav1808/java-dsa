package W3LLTC.AdditionalPractice.RemoveNthNodeFromEndOfList;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 19. Remove Nth Node From End of List
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("19. Remove Nth Node From End of List")
public class RemoveNthNodeFromEndOfListTest {

    @Test
    @DisplayName("Example 1: head = [1,2,3,4,5], n = 2 -> [1,2,3,5]")
    void example1() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        int n = 2;
        List<Integer> expected = list(1, 2, 3, 5);
        ListNode result = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, n);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: head = [1], n = 1 -> []")
    void example2() {
        ListNode head = ListNode.of(1);
        int n = 1;
        List<Integer> expected = list();
        ListNode result = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, n);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: head = [1,2], n = 1 -> [1]")
    void example3() {
        ListNode head = ListNode.of(1, 2);
        int n = 1;
        List<Integer> expected = list(1);
        ListNode result = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, n);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }
}
