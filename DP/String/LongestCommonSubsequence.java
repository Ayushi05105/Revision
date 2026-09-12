package DP.String;

public class LongestCommonSubsequence {

    public static String helper(String s1,String s2,int i,int j,String[][] dp){
        if(i == s1.length() || j == s2.length()) return "";

        if(dp[i][j] != null){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
           return dp[i][j] = s1.charAt(i) + helper(s1,s2,i+1,j+1,dp);
        }
        String skip1 = helper(s1, s2, i+1, j,dp);
        String skip2 = helper(s1, s2, i, j+1,dp);
        if(skip1.length() >= skip2.length()){
            return dp[i][j] = skip1;
        }
        return dp[i][j] = skip2;

    }

    public static String lcs(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        String[][] dp = new String[n][m];
        
        return helper(s1,s2,0,0,dp);

    }


    // tabulation

    public static String lcs2(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        int i =n;
        int j =m;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                ans.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i-1][j] >= dp[i][j-1]){
                    i--;
                }
                else j--;
            }
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 ="apple";
        String s2 ="waffle";
        System.out.println(lcs(s1, s2));
        System.out.println(lcs2(s1, s2));
    }
    
}
