package W11TSDG.AdditionalPractice.VerifyingAnAlienDictionary;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 953. Verifying an Alien Dictionary
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("953. Verifying an Alien Dictionary")
public class VerifyingAnAlienDictionaryTest {

    @Test
    @DisplayName("Example 1: words = [\"hello\",\"leetcode\"], order = \"hlabcdefgijkmnopqrstuvwxyz\" -> true")
    void example1() {
        String[] words = new String[] {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        boolean expected = true;
        boolean actual = new VerifyingAnAlienDictionary().isAlienSorted(words, order);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: words = [\"word\",\"world\",\"row\"], order = \"worldabcefghijkmnpqstuvxyz\" -> false")
    void example2() {
        String[] words = new String[] {"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        boolean expected = false;
        boolean actual = new VerifyingAnAlienDictionary().isAlienSorted(words, order);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: words = [\"apple\",\"app\"], order = \"abcdefghijklmnopqrstuvwxyz\" -> false")
    void example3() {
        String[] words = new String[] {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        boolean expected = false;
        boolean actual = new VerifyingAnAlienDictionary().isAlienSorted(words, order);

        assertEquals(expected, actual);
    }
}
