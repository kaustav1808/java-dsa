package W15GKSSP.D99GJG.JumpGameII;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 45. Jump Game II
 * https://leetcode.com/problems/jump-game-ii/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("45. Jump Game II")
public class JumpGameIITest {

    @Test
    @DisplayName("Example 1: nums = [2,3,1,1,4] -> 2")
    void example1() {
        int[] nums = new int[] {2, 3, 1, 1, 4};
        int expected = 2;
        int actual = new JumpGameII().jump(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [2,3,0,1,4] -> 2")
    void example2() {
        int[] nums = new int[] {2, 3, 0, 1, 4};
        int expected = 2;
        int actual = new JumpGameII().jump(nums);

        assertEquals(expected, actual);
    }
}
