package com.jack.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode49 {
    public static void main(String[] args) {
        
    }

    static class Solution{
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> map = new HashMap<>();
            List<List<String>> res = new ArrayList<>();

            for(String str :strs){
                String sortStr = sortString(str);
                if(!map.containsKey(sortStr)){
                    map.put(sortStr, new ArrayList<String>());
                }
                map.get(sortStr).add(str);
            }

            for(List<String> sList: map.values()){
                res.add(sList);
            }

            return res;
            
        }

        private String sortString(String str){
            char [] sArr = str.toCharArray();
            Arrays.sort(sArr);
            return new String(sArr);
        }
    }

}
