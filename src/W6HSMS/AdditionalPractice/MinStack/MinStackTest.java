package W6HSMS.AdditionalPractice.MinStack;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 155. Min Stack
 * https://leetcode.com/problems/min-stack/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("155. Min Stack")
public class MinStackTest {

    @Test
    @DisplayName("Example 1: [\"MinStack\",\"push\",\"push\",\"push\",\"getMin\",\"pop\",\"top\",\"getMin\"] [[],[-2],[0],[-3],[],[],[],[]] -> [null,null,null,null,-3,null,0,-2]")
    void example1() {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        int r4 = obj.getMin();
        obj.pop();
        int r6 = obj.top();
        int r7 = obj.getMin();

        assertEquals(-3, r4);
        assertEquals(0, r6);
        assertEquals(-2, r7);
    }
}
