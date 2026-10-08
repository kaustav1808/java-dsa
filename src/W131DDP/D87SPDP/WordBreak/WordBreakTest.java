package W131DDP.D87SPDP.WordBreak;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 139. Word Break
 * https://leetcode.com/problems/word-break/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("139. Word Break")
public class WordBreakTest {

    @Test
    @DisplayName("Example 1: s = \"leetcode\", wordDict = [\"leet\",\"code\"] -> true")
    void example1() {
        String s = "leetcode";
        List<String> wordDict = list("leet", "code");
        boolean expected = true;
        boolean actual = new WordBreak().wordBreak(s, wordDict);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"applepenapple\", wordDict = [\"apple\",\"pen\"] -> true")
    void example2() {
        String s = "applepenapple";
        List<String> wordDict = list("apple", "pen");
        boolean expected = true;
        boolean actual = new WordBreak().wordBreak(s, wordDict);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"catsandog\", wordDict = [\"cats\",\"dog\",\"sand\",\"and\",\"cat\"] -> false")
    void example3() {
        String s = "catsandog";
        List<String> wordDict = list("cats", "dog", "sand", "and", "cat");
        boolean expected = false;
        boolean actual = new WordBreak().wordBreak(s, wordDict);

        assertEquals(expected, actual);
    }
}
