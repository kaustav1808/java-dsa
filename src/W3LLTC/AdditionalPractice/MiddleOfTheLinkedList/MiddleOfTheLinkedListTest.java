package W3LLTC.AdditionalPractice.MiddleOfTheLinkedList;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("876. Middle of the Linked List")
public class MiddleOfTheLinkedListTest {

    @Test
    @DisplayName("Example 1: head = [1,2,3,4,5] -> [3,4,5]")
    void example1() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        List<Integer> expected = list(3, 4, 5);
        ListNode result = new MiddleOfTheLinkedList().middleNode(head);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: head = [1,2,3,4,5,6] -> [4,5,6]")
    void example2() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5, 6);
        List<Integer> expected = list(4, 5, 6);
        ListNode result = new MiddleOfTheLinkedList().middleNode(head);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }
}
