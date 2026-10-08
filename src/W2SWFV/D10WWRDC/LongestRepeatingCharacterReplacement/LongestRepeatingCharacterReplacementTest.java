package W2SWFV.D10WWRDC.LongestRepeatingCharacterReplacement;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 424. Longest Repeating Character Replacement
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("424. Longest Repeating Character Replacement")
public class LongestRepeatingCharacterReplacementTest {

    @Test
    @DisplayName("Example 1: s = \"ABAB\", k = 2 -> 4")
    void example1() {
        String s = "ABAB";
        int k = 2;
        int expected = 4;
        int actual = new LongestRepeatingCharacterReplacement().characterReplacement(s, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"AABABBA\", k = 1 -> 4")
    void example2() {
        String s = "AABABBA";
        int k = 1;
        int expected = 4;
        int actual = new LongestRepeatingCharacterReplacement().characterReplacement(s, k);

        assertEquals(expected, actual);
    }
}
