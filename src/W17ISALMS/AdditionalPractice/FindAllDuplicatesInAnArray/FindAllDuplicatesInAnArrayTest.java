package W17ISALMS.AdditionalPractice.FindAllDuplicatesInAnArray;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 442. Find All Duplicates in an Array
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("442. Find All Duplicates in an Array")
public class FindAllDuplicatesInAnArrayTest {

    @Test
    @DisplayName("Example 1: nums = [4,3,2,7,8,2,3,1] -> [2,3]")
    void example1() {
        int[] nums = new int[] {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = list(2, 3);
        List<Integer> actual = new FindAllDuplicatesInAnArray().findDuplicates(nums);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 2: nums = [1,1,2] -> [1]")
    void example2() {
        int[] nums = new int[] {1, 1, 2};
        List<Integer> expected = list(1);
        List<Integer> actual = new FindAllDuplicatesInAnArray().findDuplicates(nums);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 3: nums = [1] -> []")
    void example3() {
        int[] nums = new int[] {1};
        List<Integer> expected = list();
        List<Integer> actual = new FindAllDuplicatesInAnArray().findDuplicates(nums);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }
}
