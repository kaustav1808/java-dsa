package W6HSMS.D38MSAMD.DailyTemperatures;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 739. Daily Temperatures
 * https://leetcode.com/problems/daily-temperatures/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("739. Daily Temperatures")
public class DailyTemperaturesTest {

    @Test
    @DisplayName("Example 1: temperatures = [73,74,75,71,69,72,76,73] -> [1,1,4,2,1,1,0,0]")
    void example1() {
        int[] temperatures = new int[] {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = new int[] {1, 1, 4, 2, 1, 1, 0, 0};
        int[] actual = new DailyTemperatures().dailyTemperatures(temperatures);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: temperatures = [30,40,50,60] -> [1,1,1,0]")
    void example2() {
        int[] temperatures = new int[] {30, 40, 50, 60};
        int[] expected = new int[] {1, 1, 1, 0};
        int[] actual = new DailyTemperatures().dailyTemperatures(temperatures);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: temperatures = [30,60,90] -> [1,1,0]")
    void example3() {
        int[] temperatures = new int[] {30, 60, 90};
        int[] expected = new int[] {1, 1, 0};
        int[] actual = new DailyTemperatures().dailyTemperatures(temperatures);

        assertArrayEquals(expected, actual);
    }
}
