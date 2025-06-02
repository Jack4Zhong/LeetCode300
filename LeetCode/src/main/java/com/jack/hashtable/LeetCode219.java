package com.jack.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode219 {
    public static void main(String[] args) {
        
    }


    static class Solution{
        public boolean containsNearbyDuplicate(int[] nums, int k) {

            int len = nums.length;

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < len; i++) {
                int num = nums[i];
                if (map.containsKey(num) && (i-map.get(num)<=k)) return true;

                map.put(num, i);
            }

            return false;
        
        }
    }
}
