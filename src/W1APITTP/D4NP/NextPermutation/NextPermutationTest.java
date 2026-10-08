package W1APITTP.D4NP.NextPermutation;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 31. Next Permutation
 * https://leetcode.com/problems/next-permutation/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("31. Next Permutation")
public class NextPermutationTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3] -> [1,3,2]")
    void example1() {
        int[] nums = new int[] {1, 2, 3};
        int[] expected = new int[] {1, 3, 2};
        new NextPermutation().nextPermutation(nums);
        int[] actual = nums; // nextPermutation changes nums in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [3,2,1] -> [1,2,3]")
    void example2() {
        int[] nums = new int[] {3, 2, 1};
        int[] expected = new int[] {1, 2, 3};
        new NextPermutation().nextPermutation(nums);
        int[] actual = nums; // nextPermutation changes nums in place

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [1,1,5] -> [1,5,1]")
    void example3() {
        int[] nums = new int[] {1, 1, 5};
        int[] expected = new int[] {1, 5, 1};
        new NextPermutation().nextPermutation(nums);
        int[] actual = nums; // nextPermutation changes nums in place

        assertArrayEquals(expected, actual);
    }
}
