package W3LLTC.AdditionalPractice.AddTwoNumbers;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 2. Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("2. Add Two Numbers")
public class AddTwoNumbersTest {

    @Test
    @DisplayName("Example 1: l1 = [2,4,3], l2 = [5,6,4] -> [7,0,8]")
    void example1() {
        ListNode l1 = ListNode.of(2, 4, 3);
        ListNode l2 = ListNode.of(5, 6, 4);
        List<Integer> expected = list(7, 0, 8);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: l1 = [0], l2 = [0] -> [0]")
    void example2() {
        ListNode l1 = ListNode.of(0);
        ListNode l2 = ListNode.of(0);
        List<Integer> expected = list(0);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] -> [8,9,9,9,0,0,0,1]")
    void example3() {
        ListNode l1 = ListNode.of(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = ListNode.of(9, 9, 9, 9);
        List<Integer> expected = list(8, 9, 9, 9, 0, 0, 0, 1);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        List<Integer> actual = ListNode.toList(result);

        assertEquals(expected, actual);
    }
}
