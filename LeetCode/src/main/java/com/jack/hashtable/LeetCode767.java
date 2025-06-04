package com.jack.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LeetCode767 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String str = "aaaabbbcd";

        String res = solution.reorganizeString(str);

        System.out.println(res);
        
    }

    static class Solution{
        public String reorganizeString(String s) {
            char [] cArr = s.toCharArray();
            int len = cArr.length;

            Map<Character, Integer> map = new HashMap<>();
            for (char c :cArr){
                map.put(c, map.getOrDefault(c, 0)+1);
            }

            List <Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

            list.sort(Map.Entry.comparingByValue());

            System.out.println(list);



            Map<Character, Integer> sortMap = new LinkedHashMap<>();

            for (int i = list.size()-1; i>=0; i--) {
                sortMap.put(list.get(i).getKey(), list.get(i).getValue());
            }

            System.out.println(sortMap);

            char [] newArr = new char [len];

            int index = 0;
            for (Map.Entry<Character, Integer> entry : sortMap.entrySet()) {

                int n = entry.getValue();
                if (index == 0 && n > (len+1)/2){
                    return "";
                }

                while (n > 0){
                    if(index > len-1) index = 1;
                    newArr[index] = entry.getKey();
                    index += 2;
                    n--;
                }
    
            }       
            return new String(newArr);
        }
    }

}
