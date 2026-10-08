package W15GKSSP.AdditionalPractice.HandOfStraights;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 846. Hand of Straights
 * https://leetcode.com/problems/hand-of-straights/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("846. Hand of Straights")
public class HandOfStraightsTest {

    @Test
    @DisplayName("Example 1: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3 -> true")
    void example1() {
        int[] hand = new int[] {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        boolean expected = true;
        boolean actual = new HandOfStraights().isNStraightHand(hand, groupSize);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: hand = [1,2,3,4,5], groupSize = 4 -> false")
    void example2() {
        int[] hand = new int[] {1, 2, 3, 4, 5};
        int groupSize = 4;
        boolean expected = false;
        boolean actual = new HandOfStraights().isNStraightHand(hand, groupSize);

        assertEquals(expected, actual);
    }
}
