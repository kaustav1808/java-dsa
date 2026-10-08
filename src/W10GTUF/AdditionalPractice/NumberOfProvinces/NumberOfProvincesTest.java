package W10GTUF.AdditionalPractice.NumberOfProvinces;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 547. Number of Provinces
 * https://leetcode.com/problems/number-of-provinces/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("547. Number of Provinces")
public class NumberOfProvincesTest {

    @Test
    @DisplayName("Example 1: isConnected = [[1,1,0],[1,1,0],[0,0,1]] -> 2")
    void example1() {
        int[][] isConnected = new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int expected = 2;
        int actual = new NumberOfProvinces().findCircleNum(isConnected);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: isConnected = [[1,0,0],[0,1,0],[0,0,1]] -> 3")
    void example2() {
        int[][] isConnected = new int[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int expected = 3;
        int actual = new NumberOfProvinces().findCircleNum(isConnected);

        assertEquals(expected, actual);
    }
}
