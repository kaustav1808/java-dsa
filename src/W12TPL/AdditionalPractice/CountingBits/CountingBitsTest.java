package W12TPL.AdditionalPractice.CountingBits;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 338. Counting Bits
 * https://leetcode.com/problems/counting-bits/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("338. Counting Bits")
public class CountingBitsTest {

    @Test
    @DisplayName("Example 1: n = 2 -> [0,1,1]")
    void example1() {
        int n = 2;
        int[] expected = new int[] {0, 1, 1};
        int[] actual = new CountingBits().countBits(n);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 5 -> [0,1,1,2,1,2]")
    void example2() {
        int n = 5;
        int[] expected = new int[] {0, 1, 1, 2, 1, 2};
        int[] actual = new CountingBits().countBits(n);

        assertArrayEquals(expected, actual);
    }
}
