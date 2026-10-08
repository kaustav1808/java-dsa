package W3LLTC.D16DNP.PartitionList;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 86. Partition List
 * https://leetcode.com/problems/partition-list/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("86. Partition List")
public class PartitionListTest {

    @Test
    @DisplayName("Example 1: head = [1,4,3,2,5,2], x = 3 -> [1,2,2,4,3,5]")
    void example1() {
        ListNode head = ListNode.of(1, 4, 3, 2, 5, 2);
        int x = 3;
        List<Integer> expected = list(1, 2, 2, 4, 3, 5);
        ListNode result = new PartitionList().partition(head, x);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: head = [2,1], x = 2 -> [1,2]")
    void example2() {
        ListNode head = ListNode.of(2, 1);
        int x = 2;
        List<Integer> expected = list(1, 2);
        ListNode result = new PartitionList().partition(head, x);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }
}
