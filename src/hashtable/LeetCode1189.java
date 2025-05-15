package hashtable;//package hashtable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode1189 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String text = "loonbalxballpoon";
        int res = solution.maxNumberOfBalloons(text);
        System.out.println(res);
        
    }


    static class Solution{
        public int maxNumberOfBalloons(String text) {

            char [] chars = text.toCharArray();

            Set<Character> bSet = new HashSet<>(List.of('a', 'b','l','o','n'));

            int [] arr = new int[26];
            
            for(char c : chars){
                arr[c-'a'] += 1;
            }

            arr['l'-'a'] >>= 1;
            arr['o'-'a'] >>= 1;

            int res = Integer.MAX_VALUE;

            for(char c : bSet){
                res = Math.min(res, arr[c-'a']);
            }

            return res;
        }
    }
    
}
