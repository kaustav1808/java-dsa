package W18ISHITP.AdditionalPractice.CarPooling;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1094. Car Pooling
 * https://leetcode.com/problems/car-pooling/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1094. Car Pooling")
public class CarPoolingTest {

    @Test
    @DisplayName("Example 1: trips = [[2,1,5],[3,3,7]], capacity = 4 -> false")
    void example1() {
        int[][] trips = new int[][] {{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        boolean expected = false;
        boolean actual = new CarPooling().carPooling(trips, capacity);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: trips = [[2,1,5],[3,3,7]], capacity = 5 -> true")
    void example2() {
        int[][] trips = new int[][] {{2, 1, 5}, {3, 3, 7}};
        int capacity = 5;
        boolean expected = true;
        boolean actual = new CarPooling().carPooling(trips, capacity);

        assertEquals(expected, actual);
    }
}
