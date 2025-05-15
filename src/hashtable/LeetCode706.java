package hashtable;// package hashtable;

import java.util.Arrays;

public class LeetCode706 {

    public static void main(String[] args) {

        MyHashMap hashMap = new MyHashMap();

        hashMap.put(1, 1);
        System.out.println((int) hashMap.get(1));
        
    }


    static class MyHashMap {
        private final int [] data = new int[1000001];

        public MyHashMap() {
            Arrays.fill(data, -1);
        }
        
        public void put(int key, int value) {
            data[key] = value;
            
        }
        
        public int get(int key) {
            return data[key];
        }
        
        public void remove(int key) {
            data[key] = -1;
        }
    }

}
