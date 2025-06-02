package com.jack.string;

public class LeetCode14 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String [] strs = {"flower","flow","flight"};
        String res = solution.longestCommonPrefix(strs);

        System.out.println(res);
        
    }

    static class Solution{
        public String longestCommonPrefix(String[] strs) {
            int len  = strs.length;
            if (len ==0) return "";
            String pre = strs[0];
            if (len == 1) return pre;

            for (int i = 1; i < len; i++) {
                while (!strs[i].startsWith(pre)){
                    pre = pre.substring(0, pre.length()-1);
                }
                
            }
            return pre;        
        }
    }
}
