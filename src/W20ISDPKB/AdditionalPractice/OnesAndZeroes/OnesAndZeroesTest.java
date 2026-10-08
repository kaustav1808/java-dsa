package W20ISDPKB.AdditionalPractice.OnesAndZeroes;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 474. Ones and Zeroes
 * https://leetcode.com/problems/ones-and-zeroes/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("474. Ones and Zeroes")
public class OnesAndZeroesTest {

    @Test
    @DisplayName("Example 1: strs = [\"10\",\"0001\",\"111001\",\"1\",\"0\"], m = 5, n = 3 -> 4")
    void example1() {
        String[] strs = new String[] {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        int expected = 4;
        int actual = new OnesAndZeroes().findMaxForm(strs, m, n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: strs = [\"10\",\"0\",\"1\"], m = 1, n = 1 -> 2")
    void example2() {
        String[] strs = new String[] {"10", "0", "1"};
        int m = 1;
        int n = 1;
        int expected = 2;
        int actual = new OnesAndZeroes().findMaxForm(strs, m, n);

        assertEquals(expected, actual);
    }
}
