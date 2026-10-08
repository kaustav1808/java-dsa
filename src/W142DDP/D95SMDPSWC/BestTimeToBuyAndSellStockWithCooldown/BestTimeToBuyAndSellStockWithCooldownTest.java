package W142DDP.D95SMDPSWC.BestTimeToBuyAndSellStockWithCooldown;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 309. Best Time to Buy and Sell Stock with Cooldown
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("309. Best Time to Buy and Sell Stock with Cooldown")
public class BestTimeToBuyAndSellStockWithCooldownTest {

    @Test
    @DisplayName("Example 1: prices = [1,2,3,0,2] -> 3")
    void example1() {
        int[] prices = new int[] {1, 2, 3, 0, 2};
        int expected = 3;
        int actual = new BestTimeToBuyAndSellStockWithCooldown().maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: prices = [1] -> 0")
    void example2() {
        int[] prices = new int[] {1};
        int expected = 0;
        int actual = new BestTimeToBuyAndSellStockWithCooldown().maxProfit(prices);

        assertEquals(expected, actual);
    }
}
