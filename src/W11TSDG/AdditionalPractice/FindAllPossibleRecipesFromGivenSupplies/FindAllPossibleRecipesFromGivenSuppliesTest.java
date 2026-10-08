package W11TSDG.AdditionalPractice.FindAllPossibleRecipesFromGivenSupplies;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 2115. Find All Possible Recipes from Given Supplies
 * https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/
 * LeetCode accepts the answer in any order, so both sides are sorted before comparing.
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("2115. Find All Possible Recipes from Given Supplies")
public class FindAllPossibleRecipesFromGivenSuppliesTest {

    @Test
    @DisplayName("Example 1: recipes = [\"bread\"], ingredients = [[\"yeast\",\"flour\"]], supplies = [\"yeast\",\"flour\",\"corn\"] -> [\"bread\"]")
    void example1() {
        String[] recipes = new String[] {"bread"};
        List<List<String>> ingredients = list(list("yeast", "flour"));
        String[] supplies = new String[] {"yeast", "flour", "corn"};
        List<String> expected = list("bread");
        List<String> actual = new FindAllPossibleRecipesFromGivenSupplies().findAllRecipes(recipes, ingredients, supplies);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 2: recipes = [\"bread\",\"sandwich\"], ingredients = [[\"yeast\",\"flour\"],[\"bread\",\"meat\"]], supplies = [\"yeast\",\"flour\",\"meat\"] -> [\"bread\",\"sandwich\"]")
    void example2() {
        String[] recipes = new String[] {"bread", "sandwich"};
        List<List<String>> ingredients = list(list("yeast", "flour"), list("bread", "meat"));
        String[] supplies = new String[] {"yeast", "flour", "meat"};
        List<String> expected = list("bread", "sandwich");
        List<String> actual = new FindAllPossibleRecipesFromGivenSupplies().findAllRecipes(recipes, ingredients, supplies);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }

    @Test
    @DisplayName("Example 3: recipes = [\"bread\",\"sandwich\",\"burger\"], ingredients = [[\"yeast\",\"flour\"],[\"bread\",\"meat\"],[\"sandwich\",\"meat\",\"bread\"]], supplies = [\"yea... -> [\"bread\",\"sandwich\",\"burger\"]")
    void example3() {
        String[] recipes = new String[] {"bread", "sandwich", "burger"};
        List<List<String>> ingredients = list(
                list("yeast", "flour"),
                list("bread", "meat"),
                list("sandwich", "meat", "bread"));
        String[] supplies = new String[] {"yeast", "flour", "meat"};
        List<String> expected = list("bread", "sandwich", "burger");
        List<String> actual = new FindAllPossibleRecipesFromGivenSupplies().findAllRecipes(recipes, ingredients, supplies);

        assertEquals(TestUtil.sorted(expected), TestUtil.sorted(actual));
    }
}
