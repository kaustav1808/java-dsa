package W4MMGST.AdditionalPractice.PlusOne;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 66. Plus One
 * https://leetcode.com/problems/plus-one/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("66. Plus One")
public class PlusOneTest {

    @Test
    @DisplayName("Example 1: digits = [1,2,3] -> [1,2,4]")
    void example1() {
        int[] digits = new int[] {1, 2, 3};
        int[] expected = new int[] {1, 2, 4};
        int[] actual = new PlusOne().plusOne(digits);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: digits = [4,3,2,1] -> [4,3,2,2]")
    void example2() {
        int[] digits = new int[] {4, 3, 2, 1};
        int[] expected = new int[] {4, 3, 2, 2};
        int[] actual = new PlusOne().plusOne(digits);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: digits = [9] -> [1,0]")
    void example3() {
        int[] digits = new int[] {9};
        int[] expected = new int[] {1, 0};
        int[] actual = new PlusOne().plusOne(digits);

        assertArrayEquals(expected, actual);
    }
}
