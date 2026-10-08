package W142DDP.D94ED.EditDistance;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 72. Edit Distance
 * https://leetcode.com/problems/edit-distance/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("72. Edit Distance")
public class EditDistanceTest {

    @Test
    @DisplayName("Example 1: word1 = \"horse\", word2 = \"ros\" -> 3")
    void example1() {
        String word1 = "horse";
        String word2 = "ros";
        int expected = 3;
        int actual = new EditDistance().minDistance(word1, word2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: word1 = \"intention\", word2 = \"execution\" -> 5")
    void example2() {
        String word1 = "intention";
        String word2 = "execution";
        int expected = 5;
        int actual = new EditDistance().minDistance(word1, word2);

        assertEquals(expected, actual);
    }
}
