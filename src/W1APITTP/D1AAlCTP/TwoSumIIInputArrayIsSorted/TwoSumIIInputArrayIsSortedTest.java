package W1APITTP.D1AAlCTP.TwoSumIIInputArrayIsSorted;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 167. Two Sum II - Input Array Is Sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("167. Two Sum II - Input Array Is Sorted")
public class TwoSumIIInputArrayIsSortedTest {

    @Test
    @DisplayName("Example 1: numbers = [2,7,11,15], target = 9 -> [1,2]")
    void example1() {
        int[] numbers = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[] {1, 2};
        int[] actual = new TwoSumIIInputArrayIsSorted().twoSum(numbers, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: numbers = [2,3,4], target = 6 -> [1,3]")
    void example2() {
        int[] numbers = new int[] {2, 3, 4};
        int target = 6;
        int[] expected = new int[] {1, 3};
        int[] actual = new TwoSumIIInputArrayIsSorted().twoSum(numbers, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: numbers = [-1,0], target = -1 -> [1,2]")
    void example3() {
        int[] numbers = new int[] {-1, 0};
        int target = -1;
        int[] expected = new int[] {1, 2};
        int[] actual = new TwoSumIIInputArrayIsSorted().twoSum(numbers, target);

        assertArrayEquals(expected, actual);
    }
}
