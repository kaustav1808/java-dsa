package W18ISHITP.AdditionalPractice.MaximumProfitInJobScheduling;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1235. Maximum Profit in Job Scheduling
 * https://leetcode.com/problems/maximum-profit-in-job-scheduling/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1235. Maximum Profit in Job Scheduling")
public class MaximumProfitInJobSchedulingTest {

    @Test
    @DisplayName("Example 1: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70] -> 120")
    void example1() {
        int[] startTime = new int[] {1, 2, 3, 3};
        int[] endTime = new int[] {3, 4, 5, 6};
        int[] profit = new int[] {50, 10, 40, 70};
        int expected = 120;
        int actual = new MaximumProfitInJobScheduling().jobScheduling(startTime, endTime, profit);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60] -> 150")
    void example2() {
        int[] startTime = new int[] {1, 2, 3, 4, 6};
        int[] endTime = new int[] {3, 5, 10, 6, 9};
        int[] profit = new int[] {20, 20, 100, 70, 60};
        int expected = 150;
        int actual = new MaximumProfitInJobScheduling().jobScheduling(startTime, endTime, profit);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4] -> 6")
    void example3() {
        int[] startTime = new int[] {1, 1, 1};
        int[] endTime = new int[] {2, 3, 4};
        int[] profit = new int[] {5, 6, 4};
        int expected = 6;
        int actual = new MaximumProfitInJobScheduling().jobScheduling(startTime, endTime, profit);

        assertEquals(expected, actual);
    }
}
