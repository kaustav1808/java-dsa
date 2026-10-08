package W5HPSFA.D29HmIAFS.GroupAnagrams;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 49. Group Anagrams
 * https://leetcode.com/problems/group-anagrams/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("49. Group Anagrams")
public class GroupAnagramsTest {

    @Test
    @DisplayName("Example 1: strs = [\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"] -> [[\"bat\"],[\"nat\",\"tan\"],[\"ate\",\"eat\",\"tea\"]]")
    void example1() {
        String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = list(list("bat"), list("nat", "tan"), list("ate", "eat", "tea"));
        List<List<String>> actual = new GroupAnagrams().groupAnagrams(strs);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }

    @Test
    @DisplayName("Example 2: strs = [\"\"] -> [[\"\"]]")
    void example2() {
        String[] strs = new String[] {""};
        List<List<String>> expected = list(list(""));
        List<List<String>> actual = new GroupAnagrams().groupAnagrams(strs);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }

    @Test
    @DisplayName("Example 3: strs = [\"a\"] -> [[\"a\"]]")
    void example3() {
        String[] strs = new String[] {"a"};
        List<List<String>> expected = list(list("a"));
        List<List<String>> actual = new GroupAnagrams().groupAnagrams(strs);

        assertEquals(TestUtil.sortAll(expected), TestUtil.sortAll(actual));
    }
}
