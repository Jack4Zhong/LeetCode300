
import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
    public static void main(String[] args) {

        BetterSolution solution = new BetterSolution();
        // Solution solution = new Solution();
        int [] nums = {1,1,1,1,2,3,4};
        int res = solution.majorityElement(nums);
        System.out.println(res);
    }

    static class Solution{
        public int majorityElement(int[] nums) {
            int len = nums.length;
            int res = 0;

            Map<Integer, Integer> map = new HashMap<>();

            for(int num: nums){
                map.put(num, map.getOrDefault(num, 0)+1);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue()> len/2) res = entry.getKey();             
            }

            return res;  
        }
    }

    // Moore vote argothem. 
    static class BetterSolution{
        public int majorityElement(int[] nums) {
            int count = 0;
            int res = 0;

            for(int num : nums){
                if (count == 0){
                    res = num;
                }

                count += res==num?1:-1;
            }

            return res;
        }
    }

}
