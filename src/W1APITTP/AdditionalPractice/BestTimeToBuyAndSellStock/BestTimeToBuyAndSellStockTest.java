package W1APITTP.AdditionalPractice.BestTimeToBuyAndSellStock;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("121. Best Time to Buy and Sell Stock")
public class BestTimeToBuyAndSellStockTest {

    @Test
    @DisplayName("Example 1: prices = [7,1,5,3,6,4] -> 5")
    void example1() {
        int[] prices = new int[] {7, 1, 5, 3, 6, 4};
        int expected = 5;
        int actual = new BestTimeToBuyAndSellStock().maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: prices = [7,6,4,3,1] -> 0")
    void example2() {
        int[] prices = new int[] {7, 6, 4, 3, 1};
        int expected = 0;
        int actual = new BestTimeToBuyAndSellStock().maxProfit(prices);

        assertEquals(expected, actual);
    }
}
