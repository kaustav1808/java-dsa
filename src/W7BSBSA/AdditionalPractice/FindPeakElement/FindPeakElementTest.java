package W7BSBSA.AdditionalPractice.FindPeakElement;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 162. Find Peak Element
 * https://leetcode.com/problems/find-peak-element/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("162. Find Peak Element")
public class FindPeakElementTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3,1] -> 2")
    void example1() {
        int[] nums = new int[] {1, 2, 3, 1};
        int expected = 2;
        int actual = new FindPeakElement().findPeakElement(nums);

        assertTrue(TestUtil.safe(() -> TestUtil.isPeak(nums, actual)), () -> "expected any peak index, e.g. 2 but got " + TestUtil.str(actual));
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,1,3,5,6,4] -> 5")
    void example2() {
        int[] nums = new int[] {1, 2, 1, 3, 5, 6, 4};
        int expected = 5;
        int actual = new FindPeakElement().findPeakElement(nums);

        assertTrue(TestUtil.safe(() -> TestUtil.isPeak(nums, actual)), () -> "expected any peak index, e.g. 5 but got " + TestUtil.str(actual));
    }
}
