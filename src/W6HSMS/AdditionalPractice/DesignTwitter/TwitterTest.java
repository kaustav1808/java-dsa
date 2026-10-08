package W6HSMS.AdditionalPractice.DesignTwitter;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 355. Design Twitter
 * https://leetcode.com/problems/design-twitter/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("355. Design Twitter")
public class TwitterTest {

    @Test
    @DisplayName("Example 1: [\"Twitter\", \"postTweet\", \"getNewsFeed\", \"follow\", \"postTweet\", \"getNewsFeed\", \"unfollow\", \"getNewsFeed\"] [[], [1, 5], [1], [1, 2], [2, 6]... -> [null, null, [5], null, null, [6, 5], null, [5]]")
    void example1() {
        Twitter obj = new Twitter();
        obj.postTweet(1, 5);
        List<Integer> r2 = obj.getNewsFeed(1);
        obj.follow(1, 2);
        obj.postTweet(2, 6);
        List<Integer> r5 = obj.getNewsFeed(1);
        obj.unfollow(1, 2);
        List<Integer> r7 = obj.getNewsFeed(1);

        assertEquals(list(5), r2);
        assertEquals(list(6, 5), r5);
        assertEquals(list(5), r7);
    }
}
