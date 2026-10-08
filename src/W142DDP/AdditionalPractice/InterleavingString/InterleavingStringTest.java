package W142DDP.AdditionalPractice.InterleavingString;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 97. Interleaving String
 * https://leetcode.com/problems/interleaving-string/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("97. Interleaving String")
public class InterleavingStringTest {

    @Test
    @DisplayName("Example 1: s1 = \"aabcc\", s2 = \"dbbca\", s3 = \"aadbbcbcac\" -> true")
    void example1() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean expected = true;
        boolean actual = new InterleavingString().isInterleave(s1, s2, s3);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s1 = \"aabcc\", s2 = \"dbbca\", s3 = \"aadbbbaccc\" -> false")
    void example2() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        boolean expected = false;
        boolean actual = new InterleavingString().isInterleave(s1, s2, s3);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s1 = \"\", s2 = \"\", s3 = \"\" -> true")
    void example3() {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        boolean expected = true;
        boolean actual = new InterleavingString().isInterleave(s1, s2, s3);

        assertEquals(expected, actual);
    }
}
