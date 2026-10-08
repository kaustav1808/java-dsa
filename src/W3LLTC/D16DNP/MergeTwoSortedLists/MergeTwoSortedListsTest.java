package W3LLTC.D16DNP.MergeTwoSortedLists;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("21. Merge Two Sorted Lists")
public class MergeTwoSortedListsTest {

    @Test
    @DisplayName("Example 1: list1 = [1,2,4], list2 = [1,3,4] -> [1,1,2,3,4,4]")
    void example1() {
        ListNode list1 = ListNode.of(1, 2, 4);
        ListNode list2 = ListNode.of(1, 3, 4);
        List<Integer> expected = list(1, 1, 2, 3, 4, 4);
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: list1 = [], list2 = [] -> []")
    void example2() {
        ListNode list1 = ListNode.of();
        ListNode list2 = ListNode.of();
        List<Integer> expected = list();
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: list1 = [], list2 = [0] -> [0]")
    void example3() {
        ListNode list1 = ListNode.of();
        ListNode list2 = ListNode.of(0);
        List<Integer> expected = list(0);
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }
}
