package W2SWFV.AdditionalPractice.PermutationInString;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 567. Permutation in String
 * https://leetcode.com/problems/permutation-in-string/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("567. Permutation in String")
public class PermutationInStringTest {

    @Test
    @DisplayName("Example 1: s1 = \"ab\", s2 = \"eidbaooo\" -> true")
    void example1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean expected = true;
        boolean actual = new PermutationInString().checkInclusion(s1, s2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s1 = \"ab\", s2 = \"eidboaoo\" -> false")
    void example2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean expected = false;
        boolean actual = new PermutationInString().checkInclusion(s1, s2);

        assertEquals(expected, actual);
    }
}
