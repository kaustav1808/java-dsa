package W6HSMS.D36PqATK.TopKFrequentElements;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 347. Top K Frequent Elements
 * https://leetcode.com/problems/top-k-frequent-elements/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("347. Top K Frequent Elements")
public class TopKFrequentElementsTest {

    @Test
    @DisplayName("Example 1: nums = [1,1,1,2,2,3], k = 2 -> [1,2]")
    void example1() {
        int[] nums = new int[] {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = new int[] {1, 2};
        int[] actual = new TopKFrequentElements().topKFrequent(nums, k);

        assertArrayEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 2: nums = [1], k = 1 -> [1]")
    void example2() {
        int[] nums = new int[] {1};
        int k = 1;
        int[] expected = new int[] {1};
        int[] actual = new TopKFrequentElements().topKFrequent(nums, k);

        assertArrayEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 3: nums = [1,2,1,2,1,2,3,1,3,2], k = 2 -> [1,2]")
    void example3() {
        int[] nums = new int[] {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int k = 2;
        int[] expected = new int[] {1, 2};
        int[] actual = new TopKFrequentElements().topKFrequent(nums, k);

        assertArrayEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }
}
