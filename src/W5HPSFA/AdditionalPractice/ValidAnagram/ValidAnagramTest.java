package W5HPSFA.AdditionalPractice.ValidAnagram;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("242. Valid Anagram")
public class ValidAnagramTest {

    @Test
    @DisplayName("Example 1: s = \"anagram\", t = \"nagaram\" -> true")
    void example1() {
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        boolean actual = new ValidAnagram().isAnagram(s, t);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"rat\", t = \"car\" -> false")
    void example2() {
        String s = "rat";
        String t = "car";
        boolean expected = false;
        boolean actual = new ValidAnagram().isAnagram(s, t);

        assertEquals(expected, actual);
    }
}
