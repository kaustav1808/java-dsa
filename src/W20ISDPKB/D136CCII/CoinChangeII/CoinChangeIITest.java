package W20ISDPKB.D136CCII.CoinChangeII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 518. Coin Change II
 * https://leetcode.com/problems/coin-change-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("518. Coin Change II")
public class CoinChangeIITest {

    @Test
    @DisplayName("Example 1: amount = 5, coins = [1,2,5] -> 4")
    void example1() {
        int amount = 5;
        int[] coins = new int[] {1, 2, 5};
        int expected = 4;
        int actual = new CoinChangeII().change(amount, coins);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: amount = 3, coins = [2] -> 0")
    void example2() {
        int amount = 3;
        int[] coins = new int[] {2};
        int expected = 0;
        int actual = new CoinChangeII().change(amount, coins);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: amount = 10, coins = [10] -> 1")
    void example3() {
        int amount = 10;
        int[] coins = new int[] {10};
        int expected = 1;
        int actual = new CoinChangeII().change(amount, coins);

        assertEquals(expected, actual);
    }
}
