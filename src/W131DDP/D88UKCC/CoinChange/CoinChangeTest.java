package W131DDP.D88UKCC.CoinChange;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 322. Coin Change
 * https://leetcode.com/problems/coin-change/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("322. Coin Change")
public class CoinChangeTest {

    @Test
    @DisplayName("Example 1: coins = [1,2,5], amount = 11 -> 3")
    void example1() {
        int[] coins = new int[] {1, 2, 5};
        int amount = 11;
        int expected = 3;
        int actual = new CoinChange().coinChange(coins, amount);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: coins = [2], amount = 3 -> -1")
    void example2() {
        int[] coins = new int[] {2};
        int amount = 3;
        int expected = -1;
        int actual = new CoinChange().coinChange(coins, amount);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: coins = [1], amount = 0 -> 0")
    void example3() {
        int[] coins = new int[] {1};
        int amount = 0;
        int expected = 0;
        int actual = new CoinChange().coinChange(coins, amount);

        assertEquals(expected, actual);
    }
}
