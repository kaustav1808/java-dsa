package W12TPL.AdditionalPractice.SearchSuggestionsSystem;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1268. Search Suggestions System
 * https://leetcode.com/problems/search-suggestions-system/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1268. Search Suggestions System")
public class SearchSuggestionsSystemTest {

    @Test
    @DisplayName("Example 1: products = [\"mobile\",\"mouse\",\"moneypot\",\"monitor\",\"mousepad\"], searchWord = \"mouse\" -> [[\"mobile\",\"moneypot\",\"monitor\"],[\"mobile\",\"moneypot\",\"monitor\"],[\"mouse\",\"mousepad\"],[\"mouse\",\"m...")
    void example1() {
        String[] products = new String[] {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        List<List<String>> expected = list(
                list("mobile", "moneypot", "monitor"),
                list("mobile", "moneypot", "monitor"),
                list("mouse", "mousepad"),
                list("mouse", "mousepad"),
                list("mouse", "mousepad"));
        List<List<String>> actual = new SearchSuggestionsSystem().suggestedProducts(products, searchWord);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: products = [\"havana\"], searchWord = \"havana\" -> [[\"havana\"],[\"havana\"],[\"havana\"],[\"havana\"],[\"havana\"],[\"havana\"]]")
    void example2() {
        String[] products = new String[] {"havana"};
        String searchWord = "havana";
        List<List<String>> expected = list(
                list("havana"),
                list("havana"),
                list("havana"),
                list("havana"),
                list("havana"),
                list("havana"));
        List<List<String>> actual = new SearchSuggestionsSystem().suggestedProducts(products, searchWord);

        assertEquals(expected, actual);
    }
}
