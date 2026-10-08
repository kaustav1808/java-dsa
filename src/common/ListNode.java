package common;

import java.util.ArrayList;
import java.util.List;

/**
 * Same definition LeetCode uses for singly linked lists:
 * {@code int val; ListNode next; ListNode(); ListNode(int val); ListNode(int val, ListNode next)}.
 * The static helpers below are only for building and checking lists in the tests.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /** Builds a list from values, e.g. ListNode.of(1, 2, 3). Returns null for no values. */
    public static ListNode of(int... vals) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for (int v : vals) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    /** Builds a list and links the tail back to the node at index pos (pos = -1 means no cycle). */
    public static ListNode withCycle(int[] vals, int pos) {
        ListNode head = of(vals);
        if (pos < 0 || head == null) {
            return head;
        }
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = nodeAt(head, pos);
        return head;
    }

    /** Returns the node at index i (0-based), or null if the list is shorter. */
    public static ListNode nodeAt(ListNode head, int i) {
        ListNode cur = head;
        while (cur != null && i-- > 0) {
            cur = cur.next;
        }
        return cur;
    }

    /** Converts a list to a java.util.List of values (stops after 10,000 nodes to survive cycles). */
    /**
     * 160. Builds two lists that share their tail: listA's node at index skipA is the same object
     * as listB's node at index skipB. With skipA == listA.length the lists do not intersect.
     * Returns {headA, headB}.
     */
    public static ListNode[] intersecting(int[] listA, int[] listB, int skipA, int skipB) {
        ListNode headA = of(listA);
        if (skipA >= listA.length) {
            return new ListNode[] {headA, of(listB)};
        }
        ListNode shared = nodeAt(headA, skipA);
        ListNode headB = of(java.util.Arrays.copyOf(listB, skipB));
        if (headB == null) {
            headB = shared;
        } else {
            nodeAt(headB, skipB - 1).next = shared;
        }
        return new ListNode[] {headA, headB};
    }

    public static List<Integer> toList(ListNode head) {
        List<Integer> out = new ArrayList<>();
        int guard = 0;
        for (ListNode cur = head; cur != null && guard < 10_000; cur = cur.next, guard++) {
            out.add(cur.val);
        }
        return out;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        java.util.Set<ListNode> seen = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap<>());
        for (ListNode cur = this; cur != null; cur = cur.next) {
            if (!seen.add(cur)) {
                return sb.append(" -> back to node with val ").append(cur.val).append(" (cycle)]").toString();
            }
            sb.append(sb.length() > 1 ? ", " : "").append(cur.val);
        }
        return sb.append("]").toString();
    }
}
