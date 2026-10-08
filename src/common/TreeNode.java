package common;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Same definition LeetCode uses for binary trees:
 * {@code int val; TreeNode left; TreeNode right; TreeNode(); TreeNode(int val); TreeNode(int val, TreeNode left, TreeNode right)}.
 * The static helpers below are only for building and checking trees in the tests.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /** Builds a tree from LeetCode's level-order format, e.g. TreeNode.of(3, 9, 20, null, null, 15, 7). */
    public static TreeNode of(Integer... vals) {
        if (vals.length == 0 || vals[0] == null) {
            return null;
        }
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < vals.length) {
            TreeNode node = queue.poll();
            if (i < vals.length && vals[i] != null) {
                node.left = new TreeNode(vals[i]);
                queue.add(node.left);
            }
            i++;
            if (i < vals.length && vals[i] != null) {
                node.right = new TreeNode(vals[i]);
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }

    /** Converts a tree back to LeetCode's level-order format (trailing nulls removed). */
    public static List<Integer> toList(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                out.add(null);
            } else {
                out.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        while (!out.isEmpty() && out.get(out.size() - 1) == null) {
            out.remove(out.size() - 1);
        }
        return out;
    }

    /** Finds the first node with the given value (used for problems that pass nodes p and q). */
    public static TreeNode find(TreeNode root, int val) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val == val) {
                return node;
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return toList(this).toString();
    }
}
