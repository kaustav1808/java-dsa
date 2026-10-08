package W5HPSFA.D30SIUAWHs.LongestConsecutiveSequence;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 128. Longest Consecutive Sequence
 * https://leetcode.com/problems/longest-consecutive-sequence/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("128. Longest Consecutive Sequence")
public class LongestConsecutiveSequenceTest {

    @Test
    @DisplayName("Example 1: nums = [100,4,200,1,3,2] -> 4")
    void example1() {
        int[] nums = new int[] {100, 4, 200, 1, 3, 2};
        int expected = 4;
        int actual = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [0,3,7,2,5,8,4,6,0,1] -> 9")
    void example2() {
        int[] nums = new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected = 9;
        int actual = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [1,0,1,2] -> 3")
    void example3() {
        int[] nums = new int[] {1, 0, 1, 2};
        int expected = 3;
        int actual = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(expected, actual);
    }
}
