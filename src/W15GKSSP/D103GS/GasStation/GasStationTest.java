package W15GKSSP.D103GS.GasStation;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 134. Gas Station
 * https://leetcode.com/problems/gas-station/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("134. Gas Station")
public class GasStationTest {

    @Test
    @DisplayName("Example 1: gas = [1,2,3,4,5], cost = [3,4,5,1,2] -> 3")
    void example1() {
        int[] gas = new int[] {1, 2, 3, 4, 5};
        int[] cost = new int[] {3, 4, 5, 1, 2};
        int expected = 3;
        int actual = new GasStation().canCompleteCircuit(gas, cost);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: gas = [2,3,4], cost = [3,4,3] -> -1")
    void example2() {
        int[] gas = new int[] {2, 3, 4};
        int[] cost = new int[] {3, 4, 3};
        int expected = -1;
        int actual = new GasStation().canCompleteCircuit(gas, cost);

        assertEquals(expected, actual);
    }
}
