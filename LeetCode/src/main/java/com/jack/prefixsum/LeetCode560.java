package com.jack.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class LeetCode560 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public int subarraySum(int[] nums, int k) {

            int res =0;
            int len = nums.length;

            Map<Integer, Integer> map = new HashMap<>();

            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum+=nums[i];
                if(map.containsKey(sum-k)) 
                    res+= map.get(sum-k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return res;
        }
    }
}
