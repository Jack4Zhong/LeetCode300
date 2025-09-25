package com.jack.linkedlist;

import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCode206 {

    public static void main(String[] args) {
        
    }

    static class Solution{
        public Character firstNonRepeatableCharacter(String s) {

            Map<Character,Integer> map = new LinkedHashMap<>();
            char [] cArr = s.toCharArray();
            for(Character c : cArr){
                map.put(c, map.getOrDefault(c, 0)+1);
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry.getValue()==1)
                    return entry.getKey();
                
            }

            return null;
        }
    }
}
