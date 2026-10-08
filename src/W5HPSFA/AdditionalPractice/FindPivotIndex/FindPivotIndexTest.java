package W5HPSFA.AdditionalPractice.FindPivotIndex;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 724. Find Pivot Index
 * https://leetcode.com/problems/find-pivot-index/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("724. Find Pivot Index")
public class FindPivotIndexTest {

    @Test
    @DisplayName("Example 1: nums = [1,7,3,6,5,6] -> 3")
    void example1() {
        int[] nums = new int[] {1, 7, 3, 6, 5, 6};
        int expected = 3;
        int actual = new FindPivotIndex().pivotIndex(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,3] -> -1")
    void example2() {
        int[] nums = new int[] {1, 2, 3};
        int expected = -1;
        int actual = new FindPivotIndex().pivotIndex(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [2,1,-1] -> 0")
    void example3() {
        int[] nums = new int[] {2, 1, -1};
        int expected = 0;
        int actual = new FindPivotIndex().pivotIndex(nums);

        assertEquals(expected, actual);
    }
}
