package W12TPL.AdditionalPractice.MissingNumber;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("268. Missing Number")
public class MissingNumberTest {

    @Test
    @DisplayName("Example 1: nums = [3,0,1] -> 2")
    void example1() {
        int[] nums = new int[] {3, 0, 1};
        int expected = 2;
        int actual = new MissingNumber().missingNumber(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [0,1] -> 2")
    void example2() {
        int[] nums = new int[] {0, 1};
        int expected = 2;
        int actual = new MissingNumber().missingNumber(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [9,6,4,2,3,5,7,0,1] -> 8")
    void example3() {
        int[] nums = new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int expected = 8;
        int actual = new MissingNumber().missingNumber(nums);

        assertEquals(expected, actual);
    }
}
