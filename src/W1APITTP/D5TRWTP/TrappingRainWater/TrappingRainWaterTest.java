package W1APITTP.D5TRWTP.TrappingRainWater;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 42. Trapping Rain Water
 * https://leetcode.com/problems/trapping-rain-water/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("42. Trapping Rain Water")
public class TrappingRainWaterTest {

    @Test
    @DisplayName("Example 1: height = [0,1,0,2,1,0,1,3,2,1,2,1] -> 6")
    void example1() {
        int[] height = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        int actual = new TrappingRainWater().trap(height);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: height = [4,2,0,3,2,5] -> 9")
    void example2() {
        int[] height = new int[] {4, 2, 0, 3, 2, 5};
        int expected = 9;
        int actual = new TrappingRainWater().trap(height);

        assertEquals(expected, actual);
    }
}
