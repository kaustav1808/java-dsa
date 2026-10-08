package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/** Small helpers shared by the generated tests. */
public final class TestUtil {
    private TestUtil() {
    }

    /** Mutable list, e.g. TestUtil.list("a", "b"). */
    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <T> List<T> list(T... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    /** Returns a copy of a list of lists with every inner list sorted, then the outer list sorted. */
    public static <T extends Comparable<T>> List<List<T>> sortAll(Collection<? extends List<T>> lists) {
        List<List<T>> out = new ArrayList<>();
        if (lists == null) {
            return null;
        }
        for (List<T> inner : lists) {
            List<T> copy = new ArrayList<>(inner);
            copy.sort(null);
            out.add(copy);
        }
        out.sort(LIST_ORDER());
        return out;
    }

    /** Returns a copy of a list of lists with only the outer order normalised (inner order kept). */
    public static <T extends Comparable<T>> List<List<T>> sortOuter(Collection<? extends List<T>> lists) {
        if (lists == null) {
            return null;
        }
        List<List<T>> out = new ArrayList<>();
        for (List<T> inner : lists) {
            out.add(new ArrayList<>(inner));
        }
        out.sort(LIST_ORDER());
        return out;
    }

    /** Returns a sorted copy of a flat list. */
    public static <T extends Comparable<T>> List<T> sorted(Collection<T> items) {
        if (items == null) {
            return null;
        }
        List<T> out = new ArrayList<>(items);
        out.sort(null);
        return out;
    }

    /** Returns a sorted copy of an int array. */
    public static int[] sorted(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] out = arr.clone();
        Arrays.sort(out);
        return out;
    }

    /** Returns a copy of a 2D int array with its rows sorted lexicographically. */
    public static int[][] sortedRows(int[][] arr) {
        if (arr == null) {
            return null;
        }
        int[][] out = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            out[i] = arr[i].clone();
        }
        Arrays.sort(out, Arrays::compare);
        return out;
    }

    private static <T extends Comparable<T>> Comparator<List<T>> LIST_ORDER() {
        return (a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                int c = a.get(i).compareTo(b.get(i));
                if (c != 0) {
                    return c;
                }
            }
            return Integer.compare(a.size(), b.size());
        };
    }

    /** Readable text for any result: arrays, nested arrays, lists, ListNode, TreeNode. */
    public static String str(Object o) {
        if (o == null) {
            return "null";
        }
        if (o instanceof int[]) {
            return Arrays.toString((int[]) o);
        }
        if (o instanceof double[]) {
            double[] d = (double[]) o;
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < d.length; i++) {
                sb.append(i > 0 ? ", " : "").append(String.format("%.5f", d[i]));
            }
            return sb.append("]").toString();
        }
        if (o instanceof Double) {
            return String.format("%.5f", (Double) o);
        }
        if (o instanceof char[]) {
            return Arrays.toString((char[]) o);
        }
        if (o instanceof long[]) {
            return Arrays.toString((long[]) o);
        }
        if (o instanceof boolean[]) {
            return Arrays.toString((boolean[]) o);
        }
        if (o instanceof Object[]) {
            return Arrays.deepToString((Object[]) o);
        }
        if (o instanceof String) {
            return "\"" + o + "\"";
        }
        return String.valueOf(o);
    }

    /** Runs a check, turning a crash (e.g. NullPointerException from an unfinished stub) into false. */
    public static boolean safe(java.util.function.BooleanSupplier check) {
        try {
            return check.getAsBoolean();
        } catch (RuntimeException e) {
            return false;
        }
    }

    // ------------------------------------------------------------------
    // Validators for problems that accept more than one correct answer
    // ------------------------------------------------------------------

    /** 5. Longest Palindromic Substring: a palindrome substring of s with the expected length. */
    public static boolean isLongestPalindrome(String s, String answer, int expectedLength) {
        if (answer == null || answer.length() != expectedLength || !s.contains(answer)) {
            return false;
        }
        return new StringBuilder(answer).reverse().toString().equals(answer);
    }

    /** 162. Find Peak Element: index i is strictly greater than its neighbours (outside = -infinity). */
    public static boolean isPeak(int[] nums, int i) {
        if (i < 0 || i >= nums.length) {
            return false;
        }
        boolean left = i == 0 || nums[i] > nums[i - 1];
        boolean right = i == nums.length - 1 || nums[i] > nums[i + 1];
        return left && right;
    }

    /** 210. Course Schedule II: order holds every course once and respects [course, prerequisite] pairs. */
    public static boolean isValidCourseOrder(int numCourses, int[][] prerequisites, int[] order, boolean expectEmpty) {
        if (order == null) {
            return false;
        }
        if (expectEmpty) {
            return order.length == 0;
        }
        if (order.length != numCourses) {
            return false;
        }
        int[] pos = new int[numCourses];
        Arrays.fill(pos, -1);
        for (int i = 0; i < order.length; i++) {
            if (order[i] < 0 || order[i] >= numCourses || pos[order[i]] != -1) {
                return false;
            }
            pos[order[i]] = i;
        }
        for (int[] p : prerequisites) {
            if (pos[p[1]] > pos[p[0]]) {
                return false;
            }
        }
        return true;
    }

    /** 269. Alien Dictionary: "" when expected is "", otherwise an ordering consistent with the word list. */
    public static boolean isValidAlienOrder(String[] words, String order, String expected) {
        if (order == null) {
            return false;
        }
        if (expected.isEmpty()) {
            return order.isEmpty();
        }
        java.util.Set<Character> letters = new java.util.TreeSet<>();
        for (String w : words) {
            for (char c : w.toCharArray()) {
                letters.add(c);
            }
        }
        java.util.Set<Character> got = new java.util.TreeSet<>();
        for (char c : order.toCharArray()) {
            got.add(c);
        }
        if (order.length() != letters.size() || !letters.equals(got)) {
            return false;
        }
        for (int i = 0; i + 1 < words.length; i++) {
            String a = words[i];
            String b = words[i + 1];
            int j = 0;
            while (j < a.length() && j < b.length() && a.charAt(j) == b.charAt(j)) {
                j++;
            }
            if (j < a.length() && j < b.length()) {
                if (order.indexOf(a.charAt(j)) > order.indexOf(b.charAt(j))) {
                    return false;
                }
            } else if (a.length() > b.length()) {
                return false;
            }
        }
        return true;
    }

    /** 943. Find the Shortest Superstring: contains every word and has the expected (shortest) length. */
    public static boolean isShortestSuperstring(String[] words, String answer, int expectedLength) {
        if (answer == null || answer.length() != expectedLength) {
            return false;
        }
        for (String w : words) {
            if (!answer.contains(w)) {
                return false;
            }
        }
        return true;
    }
}
