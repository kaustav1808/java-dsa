package W7BSBSA.D46BSOTA.KokoEatingBananas;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 875. Koko Eating Bananas
 * https://leetcode.com/problems/koko-eating-bananas/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("875. Koko Eating Bananas")
public class KokoEatingBananasTest {

    @Test
    @DisplayName("Example 1: piles = [3,6,7,11], h = 8 -> 4")
    void example1() {
        int[] piles = new int[] {3, 6, 7, 11};
        int h = 8;
        int expected = 4;
        int actual = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: piles = [30,11,23,4,20], h = 5 -> 30")
    void example2() {
        int[] piles = new int[] {30, 11, 23, 4, 20};
        int h = 5;
        int expected = 30;
        int actual = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: piles = [30,11,23,4,20], h = 6 -> 23")
    void example3() {
        int[] piles = new int[] {30, 11, 23, 4, 20};
        int h = 6;
        int expected = 23;
        int actual = new KokoEatingBananas().minEatingSpeed(piles, h);

        assertEquals(expected, actual);
    }
}
