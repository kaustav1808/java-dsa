package W15GKSSP.AdditionalPractice.Candy;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 135. Candy
 * https://leetcode.com/problems/candy/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("135. Candy")
public class CandyTest {

    @Test
    @DisplayName("Example 1: ratings = [1,0,2] -> 5")
    void example1() {
        int[] ratings = new int[] {1, 0, 2};
        int expected = 5;
        int actual = new Candy().candy(ratings);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: ratings = [1,2,2] -> 4")
    void example2() {
        int[] ratings = new int[] {1, 2, 2};
        int expected = 4;
        int actual = new Candy().candy(ratings);

        assertEquals(expected, actual);
    }
}
