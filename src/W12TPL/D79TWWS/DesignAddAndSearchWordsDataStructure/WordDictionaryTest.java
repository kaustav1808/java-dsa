package W12TPL.D79TWWS.DesignAddAndSearchWordsDataStructure;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 211. Design Add and Search Words Data Structure
 * https://leetcode.com/problems/design-add-and-search-words-data-structure/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("211. Design Add and Search Words Data Structure")
public class WordDictionaryTest {

    @Test
    @DisplayName("Example 1: [\"WordDictionary\",\"addWord\",\"addWord\",\"addWord\",\"search\",\"search\",\"search\",\"search\"] [[],[\"bad\"],[\"dad\"],[\"mad\"],[\"pad\"],[\"bad\"],[\".ad\"],... -> [null,null,null,null,false,true,true,true]")
    void example1() {
        WordDictionary obj = new WordDictionary();
        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");
        boolean r4 = obj.search("pad");
        boolean r5 = obj.search("bad");
        boolean r6 = obj.search(".ad");
        boolean r7 = obj.search("b..");

        assertEquals(false, r4);
        assertEquals(true, r5);
        assertEquals(true, r6);
        assertEquals(true, r7);
    }
}
