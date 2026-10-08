package W12TPL.AdditionalPractice.ReverseBits;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 190. Reverse Bits
 * https://leetcode.com/problems/reverse-bits/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("190. Reverse Bits")
public class ReverseBitsTest {

    @Test
    @DisplayName("Example 1: n = 43261596 -> 964176192")
    void example1() {
        int n = 43261596;
        int expected = 964176192;
        int actual = new ReverseBits().reverseBits(n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 2147483644 -> 1073741822")
    void example2() {
        int n = 2147483644;
        int expected = 1073741822;
        int actual = new ReverseBits().reverseBits(n);

        assertEquals(expected, actual);
    }
}
