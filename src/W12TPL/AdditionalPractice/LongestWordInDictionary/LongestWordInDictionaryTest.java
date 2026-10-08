package W12TPL.AdditionalPractice.LongestWordInDictionary;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 720. Longest Word in Dictionary
 * https://leetcode.com/problems/longest-word-in-dictionary/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("720. Longest Word in Dictionary")
public class LongestWordInDictionaryTest {

    @Test
    @DisplayName("Example 1: words = [\"w\",\"wo\",\"wor\",\"worl\",\"world\"] -> \"world\"")
    void example1() {
        String[] words = new String[] {"w", "wo", "wor", "worl", "world"};
        String expected = "world";
        String actual = new LongestWordInDictionary().longestWord(words);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: words = [\"a\",\"banana\",\"app\",\"appl\",\"ap\",\"apply\",\"apple\"] -> \"apple\"")
    void example2() {
        String[] words = new String[] {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String expected = "apple";
        String actual = new LongestWordInDictionary().longestWord(words);

        assertEquals(expected, actual);
    }
}
