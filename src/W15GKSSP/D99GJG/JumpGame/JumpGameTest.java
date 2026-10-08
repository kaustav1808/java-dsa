package W15GKSSP.D99GJG.JumpGame;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 55. Jump Game
 * https://leetcode.com/problems/jump-game/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("55. Jump Game")
public class JumpGameTest {

    @Test
    @DisplayName("Example 1: nums = [2,3,1,1,4] -> true")
    void example1() {
        int[] nums = new int[] {2, 3, 1, 1, 4};
        boolean expected = true;
        boolean actual = new JumpGame().canJump(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [3,2,1,0,4] -> false")
    void example2() {
        int[] nums = new int[] {3, 2, 1, 0, 4};
        boolean expected = false;
        boolean actual = new JumpGame().canJump(nums);

        assertEquals(expected, actual);
    }
}
