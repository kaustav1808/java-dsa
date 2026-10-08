package W1APITTP.AdditionalPractice.ProductOfArrayExceptSelf;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 238. Product of Array Except Self
 * https://leetcode.com/problems/product-of-array-except-self/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("238. Product of Array Except Self")
public class ProductOfArrayExceptSelfTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3,4] -> [24,12,8,6]")
    void example1() {
        int[] nums = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {24, 12, 8, 6};
        int[] actual = new ProductOfArrayExceptSelf().productExceptSelf(nums);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [-1,1,0,-3,3] -> [0,0,9,0,0]")
    void example2() {
        int[] nums = new int[] {-1, 1, 0, -3, 3};
        int[] expected = new int[] {0, 0, 9, 0, 0};
        int[] actual = new ProductOfArrayExceptSelf().productExceptSelf(nums);

        assertArrayEquals(expected, actual);
    }
}
