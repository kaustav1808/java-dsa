package W3LLTC.AdditionalPractice.CopyListWithRandomPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode's node for 138. Copy List with Random Pointer (already defined on LeetCode - do not paste it).
 * The static helpers below are only for the local tests.
 */
public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    /** Builds the list from LeetCode's [[val, randomIndex], ...] format. */
    public static Node fromPairs(Integer[][] pairs) {
        Node[] nodes = new Node[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            nodes[i] = new Node(pairs[i][0]);
        }
        for (int i = 0; i < pairs.length; i++) {
            if (i + 1 < pairs.length) {
                nodes[i].next = nodes[i + 1];
            }
            if (pairs[i][1] != null) {
                nodes[i].random = nodes[pairs[i][1]];
            }
        }
        return pairs.length == 0 ? null : nodes[0];
    }

    /** Converts the list back to [[val, randomIndex], ...]. */
    public static List<List<Integer>> toPairs(Node head) {
        Map<Node, Integer> index = new IdentityHashMap<>();
        int i = 0;
        for (Node cur = head; cur != null && i < 10_000; cur = cur.next) {
            index.put(cur, i++);
        }
        List<List<Integer>> out = new ArrayList<>();
        for (Node cur = head; cur != null && out.size() < 10_000; cur = cur.next) {
            out.add(new ArrayList<>(Arrays.asList(cur.val, cur.random == null ? null : index.get(cur.random))));
        }
        return out;
    }

    /** True when no node of the copy is a node of the original list. */
    public static boolean isDeepCopy(Node original, Node copy) {
        Map<Node, Boolean> orig = new IdentityHashMap<>();
        for (Node cur = original; cur != null; cur = cur.next) {
            orig.put(cur, true);
        }
        int steps = 0;
        for (Node cur = copy; cur != null && steps++ < 10_000; cur = cur.next) {
            if (orig.containsKey(cur) || (cur.random != null && orig.containsKey(cur.random))) {
                return false;
            }
        }
        return true;
    }
}
