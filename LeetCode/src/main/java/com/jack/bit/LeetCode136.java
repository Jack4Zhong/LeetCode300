package com.jack.bit;

import java.util.HashSet;
import java.util.Set;

public class LeetCode136 {

    public static void main(String[] args) {

        BetterSolution solution = new BetterSolution();
        // Solution solution = new Solution();
        int [] nums = {1,1,2,2,3,3,4};
        int res =solution.singleNumber(nums);

        System.out.println(res);
        
    }


    static class BetterSolution{
        public int singleNumber(int[] nums) {
            int res =0;
            for(int num: nums){
                res ^= num;
            }
            return res;
       
        }

    }


    static class Solution{
        public int singleNumber(int[] nums) {
            int res =0;
            Set<Integer> set = new HashSet<>();

            for (int num : nums) {
                if(set.contains(num)){
                    res -= num;
                }else{
                    res += num;
                    set.add(num);
                }
            }
            return res;
        }
    }


}
