package W1APITTP.D2ODPAAT.ContainerWithMostWater;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("11. Container With Most Water")
public class ContainerWithMostWaterTest {

    @Test
    @DisplayName("Example 1: height = [1,8,6,2,5,4,8,3,7] -> 49")
    void example1() {
        int[] height = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int actual = new ContainerWithMostWater().maxArea(height);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: height = [1,1] -> 1")
    void example2() {
        int[] height = new int[] {1, 1};
        int expected = 1;
        int actual = new ContainerWithMostWater().maxArea(height);

        assertEquals(expected, actual);
    }
}
