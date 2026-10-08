package W10GTUF.AdditionalPractice.AccountsMerge;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 721. Accounts Merge
 * https://leetcode.com/problems/accounts-merge/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("721. Accounts Merge")
public class AccountsMergeTest {

    @Test
    @DisplayName("Example 1: accounts = [[\"John\",\"johnsmith@mail.com\",\"john_newyork@mail.com\"],[\"John\",\"johnsmith@mail.com\",\"john00@mail.com\"],[\"Mary\",\"mary@mail.com\"... -> [[\"John\",\"john00@mail.com\",\"john_newyork@mail.com\",\"johnsmith@mail.com\"],[\"Mary\",\"mary@mail.com\"]...")
    void example1() {
        List<List<String>> accounts = list(
                list("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                list("John", "johnsmith@mail.com", "john00@mail.com"),
                list("Mary", "mary@mail.com"),
                list("John", "johnnybravo@mail.com"));
        List<List<String>> expected = list(
                list("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
                list("Mary", "mary@mail.com"),
                list("John", "johnnybravo@mail.com"));
        List<List<String>> actual = new AccountsMerge().accountsMerge(accounts);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }

    @Test
    @DisplayName("Example 2: accounts = [[\"Gabe\",\"Gabe0@m.co\",\"Gabe3@m.co\",\"Gabe1@m.co\"],[\"Kevin\",\"Kevin3@m.co\",\"Kevin5@m.co\",\"Kevin0@m.co\"],[\"Ethan\",\"Ethan5@m.co\",\"E... -> [[\"Ethan\",\"Ethan0@m.co\",\"Ethan4@m.co\",\"Ethan5@m.co\"],[\"Gabe\",\"Gabe0@m.co\",\"Gabe1@m.co\",\"Gabe3@m.c...")
    void example2() {
        List<List<String>> accounts = list(
                list("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co"),
                list("Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co"),
                list("Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co"),
                list("Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co"),
                list("Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co"));
        List<List<String>> expected = list(
                list("Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"),
                list("Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"),
                list("Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"),
                list("Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co"),
                list("Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co"));
        List<List<String>> actual = new AccountsMerge().accountsMerge(accounts);

        assertEquals(TestUtil.sortOuter(expected), TestUtil.sortOuter(actual));
    }
}
