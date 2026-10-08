package W5HPSFA.AdditionalPractice.ContainsDuplicate;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("217. Contains Duplicate")
public class ContainsDuplicateTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3,1] -> true")
    void example1() {
        int[] nums = new int[] {1, 2, 3, 1};
        boolean expected = true;
        boolean actual = new ContainsDuplicate().containsDuplicate(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,3,4] -> false")
    void example2() {
        int[] nums = new int[] {1, 2, 3, 4};
        boolean expected = false;
        boolean actual = new ContainsDuplicate().containsDuplicate(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [1,1,1,3,3,4,3,2,4,2] -> true")
    void example3() {
        int[] nums = new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean expected = true;
        boolean actual = new ContainsDuplicate().containsDuplicate(nums);

        assertEquals(expected, actual);
    }
}
