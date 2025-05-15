package string;

public class LeetCode392 {
    public static void main(String[] args) {

        BetterSolution solution = new BetterSolution();
        boolean res = solution.isSubsequence("ace", "abcde");
        System.out.println(res);
        
    }

    static class Solution{
        public boolean isSubsequence(String s, String t) {
            int sLen = s.length();
            if( sLen < 1 ) return true;
            
            int tLen = t.length();

            int sIndex = 0;
            for (int i = 0; i < tLen; i++) {
                if (s.charAt(sIndex)== t.charAt(i)){
                    sIndex++;
                    if(sIndex == sLen -1) return true;
                }
            }
            return false;
        }
    }


    static class BetterSolution{
        public boolean isSubsequence(String s, String t) {
            int sLen = s.length();
            int tLen = t.length();

            int sIndex = 0;
            int tIndex = 0;

            while(sIndex<sLen && tIndex<tLen){
                if(s.charAt(sIndex)== t.charAt(tIndex)) sIndex++;

                tIndex++;
            }

            return sIndex == sLen;
        }

    }

}
