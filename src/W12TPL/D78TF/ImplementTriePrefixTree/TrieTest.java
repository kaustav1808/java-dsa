package W12TPL.D78TF.ImplementTriePrefixTree;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 208. Implement Trie (Prefix Tree)
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("208. Implement Trie (Prefix Tree)")
public class TrieTest {

    @Test
    @DisplayName("Example 1: [\"Trie\", \"insert\", \"search\", \"search\", \"startsWith\", \"insert\", \"search\"] [[], [\"apple\"], [\"apple\"], [\"app\"], [\"app\"], [\"app\"], [\"app\"]] -> [null, null, true, false, true, null, true]")
    void example1() {
        Trie obj = new Trie();
        obj.insert("apple");
        boolean r2 = obj.search("apple");
        boolean r3 = obj.search("app");
        boolean r4 = obj.startsWith("app");
        obj.insert("app");
        boolean r6 = obj.search("app");

        assertEquals(true, r2);
        assertEquals(false, r3);
        assertEquals(true, r4);
        assertEquals(true, r6);
    }
}
