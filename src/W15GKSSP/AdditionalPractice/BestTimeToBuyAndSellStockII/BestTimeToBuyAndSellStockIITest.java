package W15GKSSP.AdditionalPractice.BestTimeToBuyAndSellStockII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 122. Best Time to Buy and Sell Stock II
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("122. Best Time to Buy and Sell Stock II")
public class BestTimeToBuyAndSellStockIITest {

    @Test
    @DisplayName("Example 1: prices = [7,1,5,3,6,4] -> 7")
    void example1() {
        int[] prices = new int[] {7, 1, 5, 3, 6, 4};
        int expected = 7;
        int actual = new BestTimeToBuyAndSellStockII().maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: prices = [1,2,3,4,5] -> 4")
    void example2() {
        int[] prices = new int[] {1, 2, 3, 4, 5};
        int expected = 4;
        int actual = new BestTimeToBuyAndSellStockII().maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: prices = [7,6,4,3,1] -> 0")
    void example3() {
        int[] prices = new int[] {7, 6, 4, 3, 1};
        int expected = 0;
        int actual = new BestTimeToBuyAndSellStockII().maxProfit(prices);

        assertEquals(expected, actual);
    }
}
