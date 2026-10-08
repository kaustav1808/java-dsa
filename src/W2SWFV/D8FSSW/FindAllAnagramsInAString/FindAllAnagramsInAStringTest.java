package W2SWFV.D8FSSW.FindAllAnagramsInAString;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 438. Find All Anagrams in a String
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("438. Find All Anagrams in a String")
public class FindAllAnagramsInAStringTest {

    @Test
    @DisplayName("Example 1: s = \"cbaebabacd\", p = \"abc\" -> [0,6]")
    void example1() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> expected = list(0, 6);
        List<Integer> actual = new FindAllAnagramsInAString().findAnagrams(s, p);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 2: s = \"abab\", p = \"ab\" -> [0,1,2]")
    void example2() {
        String s = "abab";
        String p = "ab";
        List<Integer> expected = list(0, 1, 2);
        List<Integer> actual = new FindAllAnagramsInAString().findAnagrams(s, p);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }
}
