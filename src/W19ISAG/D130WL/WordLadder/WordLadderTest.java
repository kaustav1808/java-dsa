package W19ISAG.D130WL.WordLadder;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 127. Word Ladder
 * https://leetcode.com/problems/word-ladder/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("127. Word Ladder")
public class WordLadderTest {

    @Test
    @DisplayName("Example 1: beginWord = \"hit\", endWord = \"cog\", wordList = [\"hot\",\"dot\",\"dog\",\"lot\",\"log\",\"cog\"] -> 5")
    void example1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = list("hot", "dot", "dog", "lot", "log", "cog");
        int expected = 5;
        int actual = new WordLadder().ladderLength(beginWord, endWord, wordList);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: beginWord = \"hit\", endWord = \"cog\", wordList = [\"hot\",\"dot\",\"dog\",\"lot\",\"log\"] -> 0")
    void example2() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = list("hot", "dot", "dog", "lot", "log");
        int expected = 0;
        int actual = new WordLadder().ladderLength(beginWord, endWord, wordList);

        assertEquals(expected, actual);
    }
}
