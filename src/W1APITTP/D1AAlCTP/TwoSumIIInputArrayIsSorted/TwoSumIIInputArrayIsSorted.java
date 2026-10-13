package W1APITTP.D1AAlCTP.TwoSumIIInputArrayIsSorted;

import java.util.*;

/**
 * Medium 167. Two Sum II - Input Array Is Sorted (LeetCode)
 * Jira: SCRUM-30 - Day 1 - Arrays vs ArrayList + converging two pointers
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * Write your solution inside twoSum(...). Run TwoSumIIInputArrayIsSortedTest; when every example
 * passes, copy the method into LeetCode's "class Solution { ... }" and submit.
 */
public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int lv;
        int rv;
        int[] result = new int[2];

        while(l<r){
            lv = numbers[l];
            rv = numbers[r];
            if(lv+rv>target){ r--;continue;}
            else if(lv+rv<target) { l++;continue;}
            else if(lv+rv==target) {
                result[0] = l+1;
                result[1] = r+1;
                return result;
            }
        }
        return null;
    }
}
