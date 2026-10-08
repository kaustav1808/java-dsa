package W17ISALMS.D114SL.SortList;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 148. Sort List
 * https://leetcode.com/problems/sort-list/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("148. Sort List")
public class SortListTest {

    @Test
    @DisplayName("Example 1: head = [4,2,1,3] -> [1,2,3,4]")
    void example1() {
        ListNode head = ListNode.of(4, 2, 1, 3);
        List<Integer> expected = list(1, 2, 3, 4);
        ListNode result = new SortList().sortList(head);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: head = [-1,5,3,4,0] -> [-1,0,3,4,5]")
    void example2() {
        ListNode head = ListNode.of(-1, 5, 3, 4, 0);
        List<Integer> expected = list(-1, 0, 3, 4, 5);
        ListNode result = new SortList().sortList(head);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: head = [] -> []")
    void example3() {
        ListNode head = ListNode.of();
        List<Integer> expected = list();
        ListNode result = new SortList().sortList(head);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }
}
