package com.jack.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LeetCode496 {
    public static void main(String[] args) {
        
    }


    static class Solution{
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            Deque<Integer> stack = new ArrayDeque<>();

            Map<Integer, Integer> map = new HashMap<>();

            for(int num: nums2){
                while (!stack.isEmpty() && stack.peek()< num){
                    map.put(stack.pop(), num);
                }
                stack.push(num);
            }

            int len = nums1.length;
            int [] res = new int[len];
            for (int i = 0; i < len; i++) {
                res[i] = map.getOrDefault(nums1[i],-1);
            }
            return res;

        }
    }

}
