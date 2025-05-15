package bit;

public class LeetCode191 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int res =solution.hammingWeight(11);
        System.out.println(res);
    
    }

    static class BetterSolution{
        public int hammingWeight(int n) {
            int ans = 0;
            while (n != 0) {
                n &= n - 1;
                ans++;
            }
            return ans;      
        }
    }

    static class Solution{
        public int hammingWeight(int n) {
            int res = 0;
            while (n > 0){
                res += n%2;
                n= n/2;
            }        
            return res;
        }
    }

}
