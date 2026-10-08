package W3LLTC.AdditionalPractice.ReorderList;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 143. Reorder List
 * https://leetcode.com/problems/reorder-list/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("143. Reorder List")
public class ReorderListTest {

    @Test
    @DisplayName("Example 1: head = [1,2,3,4] -> [1,4,2,3]")
    void example1() {
        ListNode head = ListNode.of(1, 2, 3, 4);
        List<Integer> expected = list(1, 4, 2, 3);
        new ReorderList().reorderList(head);
        List<Integer> actual = ListNode.toList(head); // reorderList changes head in place

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: head = [1,2,3,4,5] -> [1,5,2,4,3]")
    void example2() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        List<Integer> expected = list(1, 5, 2, 4, 3);
        new ReorderList().reorderList(head);
        List<Integer> actual = ListNode.toList(head); // reorderList changes head in place

        assertEquals(expected, actual);
    }
}
