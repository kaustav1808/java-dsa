package W12TPL.D82TFPR.ReplaceWords;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 648. Replace Words
 * https://leetcode.com/problems/replace-words/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("648. Replace Words")
public class ReplaceWordsTest {

    @Test
    @DisplayName("Example 1: dictionary = [\"cat\",\"bat\",\"rat\"], sentence = \"the cattle was rattled by the battery\" -> \"the cat was rat by the bat\"")
    void example1() {
        List<String> dictionary = list("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        String expected = "the cat was rat by the bat";
        String actual = new ReplaceWords().replaceWords(dictionary, sentence);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: dictionary = [\"a\",\"b\",\"c\"], sentence = \"aadsfasf absbs bbab cadsfafs\" -> \"a a b c\"")
    void example2() {
        List<String> dictionary = list("a", "b", "c");
        String sentence = "aadsfasf absbs bbab cadsfafs";
        String expected = "a a b c";
        String actual = new ReplaceWords().replaceWords(dictionary, sentence);

        assertEquals(expected, actual);
    }
}
