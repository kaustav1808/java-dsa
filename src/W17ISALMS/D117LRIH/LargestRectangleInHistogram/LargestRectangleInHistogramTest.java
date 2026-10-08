package W17ISALMS.D117LRIH.LargestRectangleInHistogram;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 84. Largest Rectangle in Histogram
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("84. Largest Rectangle in Histogram")
public class LargestRectangleInHistogramTest {

    @Test
    @DisplayName("Example 1: heights = [2,1,5,6,2,3] -> 10")
    void example1() {
        int[] heights = new int[] {2, 1, 5, 6, 2, 3};
        int expected = 10;
        int actual = new LargestRectangleInHistogram().largestRectangleArea(heights);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: heights = [2,4] -> 4")
    void example2() {
        int[] heights = new int[] {2, 4};
        int expected = 4;
        int actual = new LargestRectangleInHistogram().largestRectangleArea(heights);

        assertEquals(expected, actual);
    }
}
