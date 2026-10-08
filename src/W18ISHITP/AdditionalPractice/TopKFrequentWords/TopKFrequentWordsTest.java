package W18ISHITP.AdditionalPractice.TopKFrequentWords;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 692. Top K Frequent Words
 * https://leetcode.com/problems/top-k-frequent-words/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("692. Top K Frequent Words")
public class TopKFrequentWordsTest {

    @Test
    @DisplayName("Example 1: words = [\"i\",\"love\",\"leetcode\",\"i\",\"love\",\"coding\"], k = 2 -> [\"i\",\"love\"]")
    void example1() {
        String[] words = new String[] {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> expected = list("i", "love");
        List<String> actual = new TopKFrequentWords().topKFrequent(words, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: words = [\"the\",\"day\",\"is\",\"sunny\",\"the\",\"the\",\"the\",\"sunny\",\"is\",\"is\"], k = 4 -> [\"the\",\"is\",\"sunny\",\"day\"]")
    void example2() {
        String[] words = new String[] {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> expected = list("the", "is", "sunny", "day");
        List<String> actual = new TopKFrequentWords().topKFrequent(words, k);

        assertEquals(expected, actual);
    }
}
