package W3LLTC.D18IOTL.IntersectionOfTwoLinkedLists;

import common.ListNode;
import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 160. Intersection of Two Linked Lists
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("160. Intersection of Two Linked Lists")
public class IntersectionOfTwoLinkedListsTest {

    @Test
    @DisplayName("Example 1: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3 -> Intersected at '8'")
    void example1() {
        int[] listA = new int[] {4, 1, 8, 4, 5};
        int[] listB = new int[] {5, 6, 1, 8, 4, 5};
        ListNode[] heads = ListNode.intersecting(listA, listB, 2, 3);
        ListNode headA = heads[0];
        ListNode headB = heads[1];
        ListNode expected = ListNode.nodeAt(headA, 2); // intersectVal = 8
        ListNode actual = new IntersectionOfTwoLinkedLists().getIntersectionNode(headA, headB);

        assertTrue(actual == expected, () -> "expected " + "Intersected at '8' (the shared node itself, not a copy)" + " but got " + (actual == null ? "null" : "a node with val " + actual.val));
    }

    @Test
    @DisplayName("Example 2: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1 -> Intersected at '2'")
    void example2() {
        int[] listA = new int[] {1, 9, 1, 2, 4};
        int[] listB = new int[] {3, 2, 4};
        ListNode[] heads = ListNode.intersecting(listA, listB, 3, 1);
        ListNode headA = heads[0];
        ListNode headB = heads[1];
        ListNode expected = ListNode.nodeAt(headA, 3); // intersectVal = 2
        ListNode actual = new IntersectionOfTwoLinkedLists().getIntersectionNode(headA, headB);

        assertTrue(actual == expected, () -> "expected " + "Intersected at '2' (the shared node itself, not a copy)" + " but got " + (actual == null ? "null" : "a node with val " + actual.val));
    }

    @Test
    @DisplayName("Example 3: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2 -> No intersection")
    void example3() {
        int[] listA = new int[] {2, 6, 4};
        int[] listB = new int[] {1, 5};
        ListNode[] heads = ListNode.intersecting(listA, listB, 3, 2);
        ListNode headA = heads[0];
        ListNode headB = heads[1];
        ListNode expected = null; // no intersection
        ListNode actual = new IntersectionOfTwoLinkedLists().getIntersectionNode(headA, headB);

        assertTrue(actual == expected, () -> "expected " + "No intersection (the shared node itself, not a copy)" + " but got " + (actual == null ? "null" : "a node with val " + actual.val));
    }
}
