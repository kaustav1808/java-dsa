package W6HSMS.AdditionalPractice.CarFleet;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 853. Car Fleet
 * https://leetcode.com/problems/car-fleet/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("853. Car Fleet")
public class CarFleetTest {

    @Test
    @DisplayName("Example 1: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3] -> 3")
    void example1() {
        int target = 12;
        int[] position = new int[] {10, 8, 0, 5, 3};
        int[] speed = new int[] {2, 4, 1, 1, 3};
        int expected = 3;
        int actual = new CarFleet().carFleet(target, position, speed);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: target = 10, position = [3], speed = [3] -> 1")
    void example2() {
        int target = 10;
        int[] position = new int[] {3};
        int[] speed = new int[] {3};
        int expected = 1;
        int actual = new CarFleet().carFleet(target, position, speed);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: target = 100, position = [0,2,4], speed = [4,2,1] -> 1")
    void example3() {
        int target = 100;
        int[] position = new int[] {0, 2, 4};
        int[] speed = new int[] {4, 2, 1};
        int expected = 1;
        int actual = new CarFleet().carFleet(target, position, speed);

        assertEquals(expected, actual);
    }
}
