package array;

import java.util.Arrays;

public class LeetCode283 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[]  nums = {0,1,0,3,12};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    // Steps
    // 0 - {0,1,0,3,12}
    // 1 - {1,0,0,3,12}
    // 2 - {1,3,0,0,12}
    // 3 - {1,3,12,0,0}

    
    static class Solution {
        public void moveZeroes(int[] nums) {
            int len = nums.length;
            int index = -1;

            for (int i = 0; i < len; i++) {                
                if(nums[i] != 0 ){
                    int temp = nums[++index];
                    nums[index] = nums[i];
                    nums[i]= temp;              
                }
            }
        }
    }
}
