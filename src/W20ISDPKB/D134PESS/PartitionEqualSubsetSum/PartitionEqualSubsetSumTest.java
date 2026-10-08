package W20ISDPKB.D134PESS.PartitionEqualSubsetSum;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 416. Partition Equal Subset Sum
 * https://leetcode.com/problems/partition-equal-subset-sum/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("416. Partition Equal Subset Sum")
public class PartitionEqualSubsetSumTest {

    @Test
    @DisplayName("Example 1: nums = [1,5,11,5] -> true")
    void example1() {
        int[] nums = new int[] {1, 5, 11, 5};
        boolean expected = true;
        boolean actual = new PartitionEqualSubsetSum().canPartition(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,3,5] -> false")
    void example2() {
        int[] nums = new int[] {1, 2, 3, 5};
        boolean expected = false;
        boolean actual = new PartitionEqualSubsetSum().canPartition(nums);

        assertEquals(expected, actual);
    }
}
