package W5HPSFA.D32PSVBAR.ContiguousArray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 525. Contiguous Array
 * https://leetcode.com/problems/contiguous-array/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("525. Contiguous Array")
public class ContiguousArrayTest {

    @Test
    @DisplayName("Example 1: nums = [0,1] -> 2")
    void example1() {
        int[] nums = new int[] {0, 1};
        int expected = 2;
        int actual = new ContiguousArray().findMaxLength(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [0,1,0] -> 2")
    void example2() {
        int[] nums = new int[] {0, 1, 0};
        int expected = 2;
        int actual = new ContiguousArray().findMaxLength(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [0,1,1,1,1,1,0,0,0] -> 6")
    void example3() {
        int[] nums = new int[] {0, 1, 1, 1, 1, 1, 0, 0, 0};
        int expected = 6;
        int actual = new ContiguousArray().findMaxLength(nums);

        assertEquals(expected, actual);
    }
}
