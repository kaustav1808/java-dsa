package W12TPL.D81XORABT.SingleNumber;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 136. Single Number
 * https://leetcode.com/problems/single-number/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("136. Single Number")
public class SingleNumberTest {

    @Test
    @DisplayName("Example 1: nums = [2,2,1] -> 1")
    void example1() {
        int[] nums = new int[] {2, 2, 1};
        int expected = 1;
        int actual = new SingleNumber().singleNumber(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [4,1,2,1,2] -> 4")
    void example2() {
        int[] nums = new int[] {4, 1, 2, 1, 2};
        int expected = 4;
        int actual = new SingleNumber().singleNumber(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [1] -> 1")
    void example3() {
        int[] nums = new int[] {1};
        int expected = 1;
        int actual = new SingleNumber().singleNumber(nums);

        assertEquals(expected, actual);
    }
}
