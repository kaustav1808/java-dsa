package W12TPL.D80TGDFS.WordSearchII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 212. Word Search II
 * https://leetcode.com/problems/word-search-ii/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("212. Word Search II")
public class WordSearchIITest {

    @Test
    @DisplayName("Example 1: board = [[\"o\",\"a\",\"a\",\"n\"],[\"e\",\"t\",\"a\",\"e\"],[\"i\",\"h\",\"k\",\"r\"],[\"i\",\"f\",\"l\",\"v\"]], words = [\"oath\",\"pea\",\"eat\",\"rain\"] -> [\"eat\",\"oath\"]")
    void example1() {
        char[][] board = new char[][] {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = new String[] {"oath", "pea", "eat", "rain"};
        List<String> expected = list("eat", "oath");
        List<String> actual = new WordSearchII().findWords(board, words);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 2: board = [[\"a\",\"b\"],[\"c\",\"d\"]], words = [\"abcb\"] -> []")
    void example2() {
        char[][] board = new char[][] {{'a', 'b'}, {'c', 'd'}};
        String[] words = new String[] {"abcb"};
        List<String> expected = list();
        List<String> actual = new WordSearchII().findWords(board, words);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }
}
