package W5HPSFA.D33LRUC.LRUCache;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 146. LRU Cache
 * https://leetcode.com/problems/lru-cache/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("146. LRU Cache")
public class LRUCacheTest {

    @Test
    @DisplayName("Example 1: [\"LRUCache\", \"put\", \"put\", \"get\", \"put\", \"get\", \"put\", \"get\", \"get\", \"get\"] [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]] -> [null, null, null, 1, null, -1, null, -1, 3, 4]")
    void example1() {
        LRUCache obj = new LRUCache(2);
        obj.put(1, 1);
        obj.put(2, 2);
        int r3 = obj.get(1);
        obj.put(3, 3);
        int r5 = obj.get(2);
        obj.put(4, 4);
        int r7 = obj.get(1);
        int r8 = obj.get(3);
        int r9 = obj.get(4);

        assertEquals(1, r3);
        assertEquals(-1, r5);
        assertEquals(-1, r7);
        assertEquals(3, r8);
        assertEquals(4, r9);
    }
}
