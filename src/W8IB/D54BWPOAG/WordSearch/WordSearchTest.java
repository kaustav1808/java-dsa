package W8IB.D54BWPOAG.WordSearch;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 79. Word Search
 * https://leetcode.com/problems/word-search/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("79. Word Search")
public class WordSearchTest {

    @Test
    @DisplayName("Example 1: board = [[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]], word = \"ABCCED\" -> true")
    void example1() {
        char[][] board = new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean expected = true;
        boolean actual = new WordSearch().exist(board, word);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: board = [[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]], word = \"SEE\" -> true")
    void example2() {
        char[][] board = new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        boolean expected = true;
        boolean actual = new WordSearch().exist(board, word);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: board = [[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]], word = \"ABCB\" -> false")
    void example3() {
        char[][] board = new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        boolean expected = false;
        boolean actual = new WordSearch().exist(board, word);

        assertEquals(expected, actual);
    }
}
