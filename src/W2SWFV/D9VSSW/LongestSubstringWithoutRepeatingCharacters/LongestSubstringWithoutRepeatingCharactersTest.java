package W2SWFV.D9VSSW.LongestSubstringWithoutRepeatingCharacters;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("3. Longest Substring Without Repeating Characters")
public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    @DisplayName("Example 1: s = \"abcabcbb\" -> 3")
    void example1() {
        String s = "abcabcbb";
        int expected = 3;
        int actual = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"bbbbb\" -> 1")
    void example2() {
        String s = "bbbbb";
        int expected = 1;
        int actual = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"pwwkew\" -> 3")
    void example3() {
        String s = "pwwkew";
        int expected = 3;
        int actual = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }
}
