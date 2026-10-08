# 2115. Find All Possible Recipes from Given Supplies

**Difficulty:** Medium · **Source:** LeetCode

## Links

- LeetCode: https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/
- Jira task: https://kaustavofficial1808-1790950392039.atlassian.net/browse/SCRUM-20

**Where it fits:** Week 11 - Topological Sort & Dependency Graphs → Additional practice (SCRUM-20)

## Problem statement

You have a list of recipes, each with a list of ingredients, and an initial list of supplies (available in infinite amounts). A recipe can be made if all its ingredients are available; once made, it can itself be used as an ingredient. Return all recipes that can be created, in any order.

## Examples

- `recipes = ["bread"], ingredients = [["yeast","flour"]], supplies = ["yeast","flour","corn"] -> ["bread"]`
- `recipes = ["bread","sandwich"], ingredients = [["yeast","flour"],["bread","meat"]], supplies = ["yeast","flour","meat"] -> ["bread","sandwich"]`

## Board note

Topological sort.

## Hints

<details>
<summary>Open only if you are stuck for more than 20-25 minutes</summary>

- Topological sort: edge ingredient -> recipe, in-degree = number of ingredients, start Kahn's BFS from the supplies.

</details>

## Files in this package

- `FindAllPossibleRecipesFromGivenSupplies.java`: write your solution here.
- `Main.java`: run your solution on the examples above.
- `FindAllPossibleRecipesFromGivenSuppliesTest.java`: JUnit 5 tests; turn each example (and your own edge cases) into an assertion.

## Before you code

1. Restate the problem in one sentence and list the edge cases (empty input, one element, duplicates, negatives, overflow).
2. Trace one example by hand.
3. Say the brute-force idea and its complexity, then look for the better pattern.
4. After solving, write the time and space complexity as a comment and log any mistake in your Error Log.

---
*The statement and examples above are written in our own words for study purposes. Use the link for the official wording, full examples and exact constraints.*
