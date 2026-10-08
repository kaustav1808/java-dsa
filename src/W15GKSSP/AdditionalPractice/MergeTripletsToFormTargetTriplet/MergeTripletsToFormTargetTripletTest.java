package W15GKSSP.AdditionalPractice.MergeTripletsToFormTargetTriplet;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 1899. Merge Triplets to Form Target Triplet
 * https://leetcode.com/problems/merge-triplets-to-form-target-triplet/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("1899. Merge Triplets to Form Target Triplet")
public class MergeTripletsToFormTargetTripletTest {

    @Test
    @DisplayName("Example 1: triplets = [[2,5,3],[1,8,4],[1,7,5]], target = [2,7,5] -> true")
    void example1() {
        int[][] triplets = new int[][] {{2, 5, 3}, {1, 8, 4}, {1, 7, 5}};
        int[] target = new int[] {2, 7, 5};
        boolean expected = true;
        boolean actual = new MergeTripletsToFormTargetTriplet().mergeTriplets(triplets, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: triplets = [[3,4,5],[4,5,6]], target = [3,2,5] -> false")
    void example2() {
        int[][] triplets = new int[][] {{3, 4, 5}, {4, 5, 6}};
        int[] target = new int[] {3, 2, 5};
        boolean expected = false;
        boolean actual = new MergeTripletsToFormTargetTriplet().mergeTriplets(triplets, target);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: triplets = [[2,5,3],[2,3,4],[1,2,5],[5,2,3]], target = [5,5,5] -> true")
    void example3() {
        int[][] triplets = new int[][] {{2, 5, 3}, {2, 3, 4}, {1, 2, 5}, {5, 2, 3}};
        int[] target = new int[] {5, 5, 5};
        boolean expected = true;
        boolean actual = new MergeTripletsToFormTargetTriplet().mergeTriplets(triplets, target);

        assertEquals(expected, actual);
    }
}
