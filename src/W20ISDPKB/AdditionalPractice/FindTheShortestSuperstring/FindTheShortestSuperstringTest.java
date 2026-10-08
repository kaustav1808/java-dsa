package W20ISDPKB.AdditionalPractice.FindTheShortestSuperstring;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 943. Find the Shortest Superstring
 * https://leetcode.com/problems/find-the-shortest-superstring/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("943. Find the Shortest Superstring")
public class FindTheShortestSuperstringTest {

    @Test
    @DisplayName("Example 1: words = [\"alex\",\"loves\",\"leetcode\"] -> \"alexlovesleetcode\"")
    void example1() {
        String[] words = new String[] {"alex", "loves", "leetcode"};
        String expected = "alexlovesleetcode";
        String actual = new FindTheShortestSuperstring().shortestSuperstring(words);

        assertTrue(TestUtil.safe(() -> TestUtil.isShortestSuperstring(words, actual, expected.length())), () -> "expected any shortest superstring, e.g. \"alexlovesleetcode\" but got " + TestUtil.str(actual));
    }

    @Test
    @DisplayName("Example 2: words = [\"catg\",\"ctaagt\",\"gcta\",\"ttca\",\"atgcatc\"] -> \"gctaagttcatgcatc\"")
    void example2() {
        String[] words = new String[] {"catg", "ctaagt", "gcta", "ttca", "atgcatc"};
        String expected = "gctaagttcatgcatc";
        String actual = new FindTheShortestSuperstring().shortestSuperstring(words);

        assertTrue(TestUtil.safe(() -> TestUtil.isShortestSuperstring(words, actual, expected.length())), () -> "expected any shortest superstring, e.g. \"gctaagttcatgcatc\" but got " + TestUtil.str(actual));
    }
}
