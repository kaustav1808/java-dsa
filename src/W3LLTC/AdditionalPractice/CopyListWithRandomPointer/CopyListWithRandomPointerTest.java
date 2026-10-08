package W3LLTC.AdditionalPractice.CopyListWithRandomPointer;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 138. Copy List with Random Pointer
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("138. Copy List with Random Pointer")
public class CopyListWithRandomPointerTest {

    @Test
    @DisplayName("Example 1: head = [[7,null],[13,0],[11,4],[10,2],[1,0]] -> [[7,null],[13,0],[11,4],[10,2],[1,0]]")
    void example1() {
        Node head = Node.fromPairs(new Integer[][] {{7, null}, {13, 0}, {11, 4}, {10, 2}, {1, 0}});
        List<List<Integer>> expected = list(list(7, null), list(13, 0), list(11, 4), list(10, 2), list(1, 0));
        Node actual = new CopyListWithRandomPointer().copyRandomList(head);

        assertTrue(Node.isDeepCopy(head, actual), "must return new nodes, not the original ones");
        assertEquals(expected, Node.toPairs(actual));
    }

    @Test
    @DisplayName("Example 2: head = [[1,1],[2,1]] -> [[1,1],[2,1]]")
    void example2() {
        Node head = Node.fromPairs(new Integer[][] {{1, 1}, {2, 1}});
        List<List<Integer>> expected = list(list(1, 1), list(2, 1));
        Node actual = new CopyListWithRandomPointer().copyRandomList(head);

        assertTrue(Node.isDeepCopy(head, actual), "must return new nodes, not the original ones");
        assertEquals(expected, Node.toPairs(actual));
    }

    @Test
    @DisplayName("Example 3: head = [[3,null],[3,0],[3,null]] -> [[3,null],[3,0],[3,null]]")
    void example3() {
        Node head = Node.fromPairs(new Integer[][] {{3, null}, {3, 0}, {3, null}});
        List<List<Integer>> expected = list(list(3, null), list(3, 0), list(3, null));
        Node actual = new CopyListWithRandomPointer().copyRandomList(head);

        assertTrue(Node.isDeepCopy(head, actual), "must return new nodes, not the original ones");
        assertEquals(expected, Node.toPairs(actual));
    }
}
