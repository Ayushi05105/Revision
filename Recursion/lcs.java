package Recursion;

public class lcs {

    public static int longestCommonSubsequence(String s1,String s2,int n,int m){
        if( n==0 || m==0) return 0;
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return 1 + longestCommonSubsequence(s1, s2, n-1, m-1);
        }
        return Math.max(longestCommonSubsequence(s1, s2, n-1, m),longestCommonSubsequence(s1, s2, n, m-1));
    }
    
    public static void main(String[] args) {
        String s1 = "abcdab";
        String s2 ="bacdb";
        System.out.println(longestCommonSubsequence(s1, s2, s1.length(),s2.length()));
    }
    
}
