package com.jack.string;

public class LeetCode125 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        boolean res = solution.isPalindrome("A man, a plan, a canal: Panama");

        System.out.println(res);
    }


    static class Solution {
        public boolean isPalindrome(String s) {
            s = s.toLowerCase();
            s = s.replaceAll("[^a-z0-9]", "");

            int len = s.length();
            int left = 0;
            int right = len - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) return false;

                left++;
                right--;
            }

            return true;
        }
    }

}
