package W2SWFV.AdditionalPractice.FruitIntoBaskets;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 904. Fruit Into Baskets
 * https://leetcode.com/problems/fruit-into-baskets/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("904. Fruit Into Baskets")
public class FruitIntoBasketsTest {

    @Test
    @DisplayName("Example 1: fruits = [1,2,1] -> 3")
    void example1() {
        int[] fruits = new int[] {1, 2, 1};
        int expected = 3;
        int actual = new FruitIntoBaskets().totalFruit(fruits);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: fruits = [0,1,2,2] -> 3")
    void example2() {
        int[] fruits = new int[] {0, 1, 2, 2};
        int expected = 3;
        int actual = new FruitIntoBaskets().totalFruit(fruits);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: fruits = [1,2,3,2,2] -> 4")
    void example3() {
        int[] fruits = new int[] {1, 2, 3, 2, 2};
        int expected = 4;
        int actual = new FruitIntoBaskets().totalFruit(fruits);

        assertEquals(expected, actual);
    }
}
