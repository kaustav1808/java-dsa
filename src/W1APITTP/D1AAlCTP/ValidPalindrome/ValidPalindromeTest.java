package W1APITTP.D1AAlCTP.ValidPalindrome;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 125. Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("125. Valid Palindrome")
public class ValidPalindromeTest {

    @Test
    @DisplayName("Example 1: s = \"A man, a plan, a canal: Panama\" -> true")
    void example1() {
        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;
        boolean actual = new ValidPalindrome().isPalindrome(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"race a car\" -> false")
    void example2() {
        String s = "race a car";
        boolean expected = false;
        boolean actual = new ValidPalindrome().isPalindrome(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \" \" -> true")
    void example3() {
        String s = " ";
        boolean expected = true;
        boolean actual = new ValidPalindrome().isPalindrome(s);

        assertEquals(expected, actual);
    }
}
