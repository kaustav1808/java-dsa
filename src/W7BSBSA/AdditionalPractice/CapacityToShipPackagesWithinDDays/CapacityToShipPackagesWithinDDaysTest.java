package W7BSBSA.AdditionalPractice.CapacityToShipPackagesWithinDDays;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1011. Capacity To Ship Packages Within D Days
 * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1011. Capacity To Ship Packages Within D Days")
public class CapacityToShipPackagesWithinDDaysTest {

    @Test
    @DisplayName("Example 1: weights = [1,2,3,4,5,6,7,8,9,10], days = 5 -> 15")
    void example1() {
        int[] weights = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int expected = 15;
        int actual = new CapacityToShipPackagesWithinDDays().shipWithinDays(weights, days);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: weights = [3,2,2,4,1,4], days = 3 -> 6")
    void example2() {
        int[] weights = new int[] {3, 2, 2, 4, 1, 4};
        int days = 3;
        int expected = 6;
        int actual = new CapacityToShipPackagesWithinDDays().shipWithinDays(weights, days);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: weights = [1,2,3,1,1], days = 4 -> 3")
    void example3() {
        int[] weights = new int[] {1, 2, 3, 1, 1};
        int days = 4;
        int expected = 3;
        int actual = new CapacityToShipPackagesWithinDDays().shipWithinDays(weights, days);

        assertEquals(expected, actual);
    }
}
