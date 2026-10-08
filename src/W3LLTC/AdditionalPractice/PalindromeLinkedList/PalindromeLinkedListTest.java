package W3LLTC.AdditionalPractice.PalindromeLinkedList;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 234. Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("234. Palindrome Linked List")
public class PalindromeLinkedListTest {

    @Test
    @DisplayName("Example 1: head = [1,2,2,1] -> true")
    void example1() {
        ListNode head = ListNode.of(1, 2, 2, 1);
        boolean expected = true;
        boolean actual = new PalindromeLinkedList().isPalindrome(head);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: head = [1,2] -> false")
    void example2() {
        ListNode head = ListNode.of(1, 2);
        boolean expected = false;
        boolean actual = new PalindromeLinkedList().isPalindrome(head);

        assertEquals(expected, actual);
    }
}
