package W17ISALMS.D113FTDN.FindTheDuplicateNumber;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 287. Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("287. Find the Duplicate Number")
public class FindTheDuplicateNumberTest {

    @Test
    @DisplayName("Example 1: nums = [1,3,4,2,2] -> 2")
    void example1() {
        int[] nums = new int[] {1, 3, 4, 2, 2};
        int expected = 2;
        int actual = new FindTheDuplicateNumber().findDuplicate(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [3,1,3,4,2] -> 3")
    void example2() {
        int[] nums = new int[] {3, 1, 3, 4, 2};
        int expected = 3;
        int actual = new FindTheDuplicateNumber().findDuplicate(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [3,3,3,3,3] -> 3")
    void example3() {
        int[] nums = new int[] {3, 3, 3, 3, 3};
        int expected = 3;
        int actual = new FindTheDuplicateNumber().findDuplicate(nums);

        assertEquals(expected, actual);
    }
}
