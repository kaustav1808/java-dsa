package W12TPL.D81XORABT.MaximumXOROfTwoNumbersInAnArray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 421. Maximum XOR of Two Numbers in an Array
 * https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("421. Maximum XOR of Two Numbers in an Array")
public class MaximumXOROfTwoNumbersInAnArrayTest {

    @Test
    @DisplayName("Example 1: nums = [3,10,5,25,2,8] -> 28")
    void example1() {
        int[] nums = new int[] {3, 10, 5, 25, 2, 8};
        int expected = 28;
        int actual = new MaximumXOROfTwoNumbersInAnArray().findMaximumXOR(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [14,70,53,83,49,91,36,80,92,51,66,70] -> 127")
    void example2() {
        int[] nums = new int[] {14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70};
        int expected = 127;
        int actual = new MaximumXOROfTwoNumbersInAnArray().findMaximumXOR(nums);

        assertEquals(expected, actual);
    }
}
