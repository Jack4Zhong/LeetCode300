package com.jack.twopoints;

public class LeetCode167 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public int[] twoSum(int[] numbers, int target) {
            int len = numbers.length;
            int left = 0;
            int right = len-1;

            int [] res = new int[2];

            while (left<right){
                if (numbers[left]+numbers[right]==target){
                    res[0] = left+1;
                    res[1] = right+1;
                    break;
                }

                if (numbers[left]+numbers[right]<target){
                    left++;
                    continue;
                }

                if (numbers[left]+numbers[right]>target){
                    right--;
                }
            }

            return res;
        }
    }
}
