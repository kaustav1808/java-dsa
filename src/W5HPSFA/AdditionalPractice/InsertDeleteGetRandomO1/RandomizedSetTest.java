package W5HPSFA.AdditionalPractice.InsertDeleteGetRandomO1;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 380. Insert Delete GetRandom O(1)
 * https://leetcode.com/problems/insert-delete-getrandom-o1/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("380. Insert Delete GetRandom O(1)")
public class RandomizedSetTest {

    @Test
    @DisplayName("Example 1: [\"RandomizedSet\", \"insert\", \"remove\", \"insert\", \"getRandom\", \"remove\", \"insert\", \"getRandom\"] [[], [1], [2], [2], [], [1], [2], []] -> [null, true, false, true, 2, true, false, 2]")
    void example1() {
        RandomizedSet obj = new RandomizedSet();
        boolean r1 = obj.insert(1);
        boolean r2 = obj.remove(2);
        boolean r3 = obj.insert(2);
        int r4 = obj.getRandom();
        boolean r5 = obj.remove(1);
        boolean r6 = obj.insert(2);
        int r7 = obj.getRandom();

        assertEquals(true, r1);
        assertEquals(false, r2);
        assertEquals(true, r3);
        assertTrue(Set.of(1, 2).contains(r4), "getRandom() must return one of [1, 2]");
        assertEquals(true, r5);
        assertEquals(false, r6);
        assertTrue(Set.of(2).contains(r7), "getRandom() must return one of [2]");
    }
}
