package W6HSMS.D38MSAMD.SlidingWindowMaximum;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 239. Sliding Window Maximum
 * https://leetcode.com/problems/sliding-window-maximum/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("239. Sliding Window Maximum")
public class SlidingWindowMaximumTest {

    @Test
    @DisplayName("Example 1: nums = [1,3,-1,-3,5,3,6,7], k = 3 -> [3,3,5,5,6,7]")
    void example1() {
        int[] nums = new int[] {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] expected = new int[] {3, 3, 5, 5, 6, 7};
        int[] actual = new SlidingWindowMaximum().maxSlidingWindow(nums, k);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1], k = 1 -> [1]")
    void example2() {
        int[] nums = new int[] {1};
        int k = 1;
        int[] expected = new int[] {1};
        int[] actual = new SlidingWindowMaximum().maxSlidingWindow(nums, k);

        assertArrayEquals(expected, actual);
    }
}
