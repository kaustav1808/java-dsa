package W5HPSFA.AdditionalPractice.RangeSumQueryImmutable;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 303. Range Sum Query - Immutable
 * https://leetcode.com/problems/range-sum-query-immutable/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("303. Range Sum Query - Immutable")
public class NumArrayTest {

    @Test
    @DisplayName("Example 1: [\"NumArray\", \"sumRange\", \"sumRange\", \"sumRange\"] [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]] -> [null, 1, -1, -3]")
    void example1() {
        NumArray obj = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        int r1 = obj.sumRange(0, 2);
        int r2 = obj.sumRange(2, 5);
        int r3 = obj.sumRange(0, 5);

        assertEquals(1, r1);
        assertEquals(-1, r2);
        assertEquals(-3, r3);
    }
}
