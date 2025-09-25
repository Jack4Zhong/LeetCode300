package com.jack;

public class Test {
   
    public static void main(String[] args)  {

        int [] arr = {4,1,2,3};
        Solution solution = new Solution();
        int res = solution.solution(arr);
        System.out.println(res);
     
    }

    static class Solution{

        public int solution(int[] A) {

            int len = A.length;
            if (A == null || len == 0) return 0;
            
            long profit = 0;

            int low = 0;
            int high = A[0];
            
            
            for (int i = 1; i < len; i++) { 
                if(A[i] < A[i-1]){
                    profit += high -low;
                    low = A[i];
                }else {
                    high = A[i];
                }
            
            }
            profit += high-low;
                    
            return (int)profit;
        }

    }
}











