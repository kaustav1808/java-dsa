package W6HSMS.D39KWMWAH.MergeKSortedLists;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 23. Merge k Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("23. Merge k Sorted Lists")
public class MergeKSortedListsTest {

    @Test
    @DisplayName("Example 1: lists = [[1,4,5],[1,3,4],[2,6]] -> [1,1,2,3,4,4,5,6]")
    void example1() {
        ListNode[] lists = new ListNode[] {ListNode.of(1, 4, 5), ListNode.of(1, 3, 4), ListNode.of(2, 6)};
        List<Integer> expected = list(1, 1, 2, 3, 4, 4, 5, 6);
        ListNode result = new MergeKSortedLists().mergeKLists(lists);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: lists = [] -> []")
    void example2() {
        ListNode[] lists = new ListNode[] {};
        List<Integer> expected = list();
        ListNode result = new MergeKSortedLists().mergeKLists(lists);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: lists = [[]] -> []")
    void example3() {
        ListNode[] lists = new ListNode[] {ListNode.of()};
        List<Integer> expected = list();
        ListNode result = new MergeKSortedLists().mergeKLists(lists);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }
}
