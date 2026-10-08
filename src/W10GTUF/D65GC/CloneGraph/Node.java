package W10GTUF.D65GC.CloneGraph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * LeetCode's graph node for 133. Clone Graph (already defined on LeetCode - do not paste it).
 * The static helpers below are only for the local tests.
 */
public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    /** Builds the graph from LeetCode's adjacency list (node i + 1 lists its neighbours); returns node 1. */
    public static Node fromAdjacency(int[][] adjList) {
        if (adjList.length == 0) {
            return null;
        }
        Node[] nodes = new Node[adjList.length + 1];
        for (int i = 1; i <= adjList.length; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 1; i <= adjList.length; i++) {
            for (int nb : adjList[i - 1]) {
                nodes[i].neighbors.add(nodes[nb]);
            }
        }
        return nodes[1];
    }

    /** Converts a graph back to LeetCode's adjacency-list format. */
    public static List<List<Integer>> toAdjacency(Node node) {
        List<List<Integer>> out = new ArrayList<>();
        if (node == null) {
            return out;
        }
        Map<Integer, Node> seen = new HashMap<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        seen.put(node.val, node);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (Node nb : cur.neighbors) {
                if (nb != null && !seen.containsKey(nb.val)) {
                    seen.put(nb.val, nb);
                    queue.add(nb);
                }
            }
        }
        for (int v = 1; v <= seen.size(); v++) {
            List<Integer> row = new ArrayList<>();
            Node cur = seen.get(v);
            if (cur != null) {
                for (Node nb : cur.neighbors) {
                    row.add(nb == null ? null : nb.val);
                }
            }
            out.add(row);
        }
        return out;
    }
}
