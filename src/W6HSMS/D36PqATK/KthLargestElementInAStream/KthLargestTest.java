package W6HSMS.D36PqATK.KthLargestElementInAStream;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 703. Kth Largest Element in a Stream
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("703. Kth Largest Element in a Stream")
public class KthLargestTest {

    @Test
    @DisplayName("Example 1: [\"KthLargest\", \"add\", \"add\", \"add\", \"add\", \"add\"] [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]] -> [null, 4, 5, 5, 8, 8]")
    void example1() {
        KthLargest obj = new KthLargest(3, new int[] {4, 5, 8, 2});
        int r1 = obj.add(3);
        int r2 = obj.add(5);
        int r3 = obj.add(10);
        int r4 = obj.add(9);
        int r5 = obj.add(4);

        assertEquals(4, r1);
        assertEquals(5, r2);
        assertEquals(5, r3);
        assertEquals(8, r4);
        assertEquals(8, r5);
    }

    @Test
    @DisplayName("Example 2: [\"KthLargest\", \"add\", \"add\", \"add\", \"add\"] [[4, [7, 7, 7, 7, 8, 3]], [2], [10], [9], [9]] -> [null, 7, 7, 7, 8]")
    void example2() {
        KthLargest obj = new KthLargest(4, new int[] {7, 7, 7, 7, 8, 3});
        int r1 = obj.add(2);
        int r2 = obj.add(10);
        int r3 = obj.add(9);
        int r4 = obj.add(9);

        assertEquals(7, r1);
        assertEquals(7, r2);
        assertEquals(7, r3);
        assertEquals(8, r4);
    }
}
