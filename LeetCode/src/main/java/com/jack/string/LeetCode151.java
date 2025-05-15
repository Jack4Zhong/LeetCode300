package com.jack.string;//package string;

public class LeetCode151 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        String res = solution.reverseWords("This is a    world");
        System.out.println(res);
    }

    static class Solution{
        public String reverseWords(String s) {
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            
            String [] sArr = s.split(" ");
            int len = sArr.length;

            StringBuilder sb = new StringBuilder();
            for (int i = len-1; i >=0; i--) {
            
                sb.append(sArr[i]);
                if(i!= 0)
                    sb.append(" ");
                
            }
            
            return sb.toString();
        }
    }

}
