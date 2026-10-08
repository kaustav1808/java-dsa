package W11TSDG.D73AD.AlienDictionary;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 269. Alien Dictionary
 * https://leetcode.com/problems/alien-dictionary/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("269. Alien Dictionary")
public class AlienDictionaryTest {

    @Test
    @DisplayName("Example 1: words = [\"wrt\",\"wrf\",\"er\",\"ett\",\"rftt\"] -> \"wertf\"")
    void example1() {
        String[] words = new String[] {"wrt", "wrf", "er", "ett", "rftt"};
        String expected = "wertf";
        String actual = new AlienDictionary().alienOrder(words);

        assertTrue(TestUtil.safe(() -> TestUtil.isValidAlienOrder(words, actual, expected)), () -> "expected any valid order, e.g. \"wertf\" but got " + TestUtil.str(actual));
    }

    @Test
    @DisplayName("Example 2: words = [\"z\",\"x\"] -> \"zx\"")
    void example2() {
        String[] words = new String[] {"z", "x"};
        String expected = "zx";
        String actual = new AlienDictionary().alienOrder(words);

        assertTrue(TestUtil.safe(() -> TestUtil.isValidAlienOrder(words, actual, expected)), () -> "expected any valid order, e.g. \"zx\" but got " + TestUtil.str(actual));
    }

    @Test
    @DisplayName("Example 3: words = [\"z\",\"x\",\"z\"] -> \"\"")
    void example3() {
        String[] words = new String[] {"z", "x", "z"};
        String expected = "";
        String actual = new AlienDictionary().alienOrder(words);

        assertTrue(TestUtil.safe(() -> TestUtil.isValidAlienOrder(words, actual, expected)), () -> "expected \"\" (no valid order) but got " + TestUtil.str(actual));
    }
}
