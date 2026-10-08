package W19ISAG.AdditionalPractice.WordLadderII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 126. Word Ladder II
 * https://leetcode.com/problems/word-ladder-ii/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("126. Word Ladder II")
public class WordLadderIITest {

    @Test
    @DisplayName("Example 1: beginWord = \"hit\", endWord = \"cog\", wordList = [\"hot\",\"dot\",\"dog\",\"lot\",\"log\",\"cog\"] -> [[\"hit\",\"hot\",\"dot\",\"dog\",\"cog\"],[\"hit\",\"hot\",\"lot\",\"log\",\"cog\"]]")
    void example1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = list("hot", "dot", "dog", "lot", "log", "cog");
        List<List<String>> expected = list(
                list("hit", "hot", "dot", "dog", "cog"),
                list("hit", "hot", "lot", "log", "cog"));
        List<List<String>> actual = new WordLadderII().findLadders(beginWord, endWord, wordList);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }

    @Test
    @DisplayName("Example 2: beginWord = \"hit\", endWord = \"cog\", wordList = [\"hot\",\"dot\",\"dog\",\"lot\",\"log\"] -> []")
    void example2() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = list("hot", "dot", "dog", "lot", "log");
        List<List<String>> expected = list();
        List<List<String>> actual = new WordLadderII().findLadders(beginWord, endWord, wordList);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }
}
