package com.jack.prefixsum;

import java.util.ArrayList;
import java.util.List;

public class Leetcode303 {

    public static void main(String[] args) {
        
    }

    private class NumArray {

        List<Integer> list = new ArrayList<>();

        public NumArray(int[] nums) {
            list.add(0);
            int sum = 0;
            for(int num : nums){
                sum += num;
                list.add(sum);
            }
          
        }
        
        public int sumRange(int left, int right) {
            return list.get(right+1)- list.get(left);
        }
}


}
