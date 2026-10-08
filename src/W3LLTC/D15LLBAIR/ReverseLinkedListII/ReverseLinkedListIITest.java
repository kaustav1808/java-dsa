package W3LLTC.D15LLBAIR.ReverseLinkedListII;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 92. Reverse Linked List II
 * https://leetcode.com/problems/reverse-linked-list-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("92. Reverse Linked List II")
public class ReverseLinkedListIITest {

    @Test
    @DisplayName("Example 1: head = [1,2,3,4,5], left = 2, right = 4 -> [1,4,3,2,5]")
    void example1() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        int left = 2;
        int right = 4;
        List<Integer> expected = list(1, 4, 3, 2, 5);
        ListNode result = new ReverseLinkedListII().reverseBetween(head, left, right);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: head = [5], left = 1, right = 1 -> [5]")
    void example2() {
        ListNode head = ListNode.of(5);
        int left = 1;
        int right = 1;
        List<Integer> expected = list(5);
        ListNode result = new ReverseLinkedListII().reverseBetween(head, left, right);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }
}
