package W4MMGST.AdditionalPractice.HappyNumber;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 202. Happy Number
 * https://leetcode.com/problems/happy-number/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("202. Happy Number")
public class HappyNumberTest {

    @Test
    @DisplayName("Example 1: n = 19 -> true")
    void example1() {
        int n = 19;
        boolean expected = true;
        boolean actual = new HappyNumber().isHappy(n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 2 -> false")
    void example2() {
        int n = 2;
        boolean expected = false;
        boolean actual = new HappyNumber().isHappy(n);

        assertEquals(expected, actual);
    }
}
