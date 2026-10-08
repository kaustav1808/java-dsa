package W8IB.AdditionalPractice.GenerateParentheses;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 22. Generate Parentheses
 * https://leetcode.com/problems/generate-parentheses/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("22. Generate Parentheses")
public class GenerateParenthesesTest {

    @Test
    @DisplayName("Example 1: n = 3 -> [\"((()))\",\"(()())\",\"(())()\",\"()(())\",\"()()()\"]")
    void example1() {
        int n = 3;
        List<String> expected = list("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> actual = new GenerateParentheses().generateParenthesis(n);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 2: n = 1 -> [\"()\"]")
    void example2() {
        int n = 1;
        List<String> expected = list("()");
        List<String> actual = new GenerateParentheses().generateParenthesis(n);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }
}
