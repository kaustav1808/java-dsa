package W7BSBSA.AdditionalPractice.TimeBasedKeyValueStore;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 981. Time Based Key-Value Store
 * https://leetcode.com/problems/time-based-key-value-store/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("981. Time Based Key-Value Store")
public class TimeMapTest {

    @Test
    @DisplayName("Example 1: [\"TimeMap\", \"set\", \"get\", \"get\", \"set\", \"get\", \"get\"] [[], [\"foo\", \"bar\", 1], [\"foo\", 1], [\"foo\", 3], [\"foo\", \"bar2\", 4], [\"foo\", 4], [\"f... -> [null, null, \"bar\", \"bar\", null, \"bar2\", \"bar2\"]")
    void example1() {
        TimeMap obj = new TimeMap();
        obj.set("foo", "bar", 1);
        String r2 = obj.get("foo", 1);
        String r3 = obj.get("foo", 3);
        obj.set("foo", "bar2", 4);
        String r5 = obj.get("foo", 4);
        String r6 = obj.get("foo", 5);

        assertEquals("bar", r2);
        assertEquals("bar", r3);
        assertEquals("bar2", r5);
        assertEquals("bar2", r6);
    }
}
