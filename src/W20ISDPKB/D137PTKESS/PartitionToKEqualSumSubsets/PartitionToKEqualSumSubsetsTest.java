package W20ISDPKB.D137PTKESS.PartitionToKEqualSumSubsets;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 698. Partition to K Equal Sum Subsets
 * https://leetcode.com/problems/partition-to-k-equal-sum-subsets/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("698. Partition to K Equal Sum Subsets")
public class PartitionToKEqualSumSubsetsTest {

    @Test
    @DisplayName("Example 1: nums = [4,3,2,3,5,2,1], k = 4 -> true")
    void example1() {
        int[] nums = new int[] {4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        boolean expected = true;
        boolean actual = new PartitionToKEqualSumSubsets().canPartitionKSubsets(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,2,3,4], k = 3 -> false")
    void example2() {
        int[] nums = new int[] {1, 2, 3, 4};
        int k = 3;
        boolean expected = false;
        boolean actual = new PartitionToKEqualSumSubsets().canPartitionKSubsets(nums, k);

        assertEquals(expected, actual);
    }
}
