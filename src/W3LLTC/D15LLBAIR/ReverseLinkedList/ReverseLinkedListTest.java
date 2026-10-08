package W3LLTC.D15LLBAIR.ReverseLinkedList;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("206. Reverse Linked List")
public class ReverseLinkedListTest {

    @Test
    @DisplayName("Example 1: head = [1,2,3,4,5] -> [5,4,3,2,1]")
    void example1() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        List<Integer> expected = list(5, 4, 3, 2, 1);
        ListNode result = new ReverseLinkedList().reverseList(head);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: head = [1,2] -> [2,1]")
    void example2() {
        ListNode head = ListNode.of(1, 2);
        List<Integer> expected = list(2, 1);
        ListNode result = new ReverseLinkedList().reverseList(head);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: head = [] -> []")
    void example3() {
        ListNode head = ListNode.of();
        List<Integer> expected = list();
        ListNode result = new ReverseLinkedList().reverseList(head);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }
}
