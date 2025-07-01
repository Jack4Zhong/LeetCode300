package com.jack.bucket;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LeetCode451 {

    public static void main(String[] args) {
        
    }

    static class Solution{
        public String frequencySort(String s) {
            Map<Character, Integer> map = new HashMap();

            for(Character c :s.toCharArray()){
                map.put(c, map.getOrDefault(c,0)+1);
            }

            Map<Character, Integer> sortMap = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new));

            StringBuilder sb = new StringBuilder();
            for(Map.Entry<Character, Integer> entry: sortMap.entrySet()){
                Character c = entry.getKey();
                for (int i = 0; i < entry.getValue(); i++) {
                    sb.append(c);
                }
            }

            return sb.toString();
        
        }
    }

}
