package W8IB.AdditionalPractice.LetterCombinationsOfAPhoneNumber;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 17. Letter Combinations of a Phone Number
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("17. Letter Combinations of a Phone Number")
public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    @DisplayName("Example 1: digits = \"23\" -> [\"ad\",\"ae\",\"af\",\"bd\",\"be\",\"bf\",\"cd\",\"ce\",\"cf\"]")
    void example1() {
        String digits = "23";
        List<String> expected = list("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> actual = new LetterCombinationsOfAPhoneNumber().letterCombinations(digits);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 2: digits = \"2\" -> [\"a\",\"b\",\"c\"]")
    void example2() {
        String digits = "2";
        List<String> expected = list("a", "b", "c");
        List<String> actual = new LetterCombinationsOfAPhoneNumber().letterCombinations(digits);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }
}
