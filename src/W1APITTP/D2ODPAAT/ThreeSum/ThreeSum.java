package W1APITTP.D2ODPAAT.ThreeSum;

import W131DDP.D85DPFFS.ClimbingStairs.ClimbingStairs;

import java.util.*;

/**
 * Medium 15. 3Sum (LeetCode)
 * Jira: SCRUM-31 - Day 2 - Opposite-direction pointers: area and triplets
 * https://leetcode.com/problems/3sum/
 *
 * Write your solution inside threeSum(...). Run ThreeSumTest; when every example
 * passes, copy the method into LeetCode's "class Solution { ... }" and submit.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        List<List<Integer>> triplets = new ArrayList<>();

        while(i<nums.length){
          if(i!=0 && nums[i]==nums[i-1]) {
              i++;
             continue;
          }else{
              twoSum(nums, i, triplets);
              i++;
          }
        }
        return triplets;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> triplets ) {
       int l = i+1;
       int h = nums.length-1;

       while(l<h) {
         int sum = nums[i]+nums[l]+nums[h];
         if(sum>0) {
             h--;
             continue;
         }
         else if(sum<0){
             l++;
             continue;
         }else{
             List<Integer> last = !triplets.isEmpty()?triplets.get(triplets.size()-1):new ArrayList<>();
             List<Integer> triplet = new ArrayList<>();
             triplet.add(nums[i]);
             triplet.add(nums[l]);
             triplet.add(nums[h]);
             if(!last.equals(triplet)) {
                 triplets.add(triplet);
             }
             l++;
             h--;
             continue;
         }
       }
    }
}
