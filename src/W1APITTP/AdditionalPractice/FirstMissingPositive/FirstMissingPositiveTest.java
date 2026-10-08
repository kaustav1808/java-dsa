package W1APITTP.AdditionalPractice.FirstMissingPositive;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 41. First Missing Positive
 * https://leetcode.com/problems/first-missing-positive/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("41. First Missing Positive")
public class FirstMissingPositiveTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,0] -> 3")
    void example1() {
        int[] nums = new int[] {1, 2, 0};
        int expected = 3;
        int actual = new FirstMissingPositive().firstMissingPositive(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [3,4,-1,1] -> 2")
    void example2() {
        int[] nums = new int[] {3, 4, -1, 1};
        int expected = 2;
        int actual = new FirstMissingPositive().firstMissingPositive(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [7,8,9,11,12] -> 1")
    void example3() {
        int[] nums = new int[] {7, 8, 9, 11, 12};
        int expected = 1;
        int actual = new FirstMissingPositive().firstMissingPositive(nums);

        assertEquals(expected, actual);
    }
}
