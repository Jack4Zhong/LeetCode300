package com.jack.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1512 {

    public static void main(String[] args) {
        
    }

    static class Solution{
        public int numIdenticalPairs(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int num: nums){
                map.put(num, map.getOrDefault(num, 0)+1);
            }

            int res =0;
            for(int val : map.values()){
                res+= val*(val-1)/2;
            }
            return res;

        }
    }

}
