package W15GKSSP.AdditionalPractice.PartitionLabels;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 763. Partition Labels
 * https://leetcode.com/problems/partition-labels/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("763. Partition Labels")
public class PartitionLabelsTest {

    @Test
    @DisplayName("Example 1: s = \"ababcbacadefegdehijhklij\" -> [9,7,8]")
    void example1() {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> expected = list(9, 7, 8);
        List<Integer> actual = new PartitionLabels().partitionLabels(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"eccbbbbdec\" -> [10]")
    void example2() {
        String s = "eccbbbbdec";
        List<Integer> expected = list(10);
        List<Integer> actual = new PartitionLabels().partitionLabels(s);

        assertEquals(expected, actual);
    }
}
