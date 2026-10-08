package W6HSMS.AdditionalPractice.DecodeString;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 394. Decode String
 * https://leetcode.com/problems/decode-string/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("394. Decode String")
public class DecodeStringTest {

    @Test
    @DisplayName("Example 1: s = \"3[a]2[bc]\" -> \"aaabcbc\"")
    void example1() {
        String s = "3[a]2[bc]";
        String expected = "aaabcbc";
        String actual = new DecodeString().decodeString(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"3[a2[c]]\" -> \"accaccacc\"")
    void example2() {
        String s = "3[a2[c]]";
        String expected = "accaccacc";
        String actual = new DecodeString().decodeString(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"2[abc]3[cd]ef\" -> \"abcabccdcdcdef\"")
    void example3() {
        String s = "2[abc]3[cd]ef";
        String expected = "abcabccdcdcdef";
        String actual = new DecodeString().decodeString(s);

        assertEquals(expected, actual);
    }
}
