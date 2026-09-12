package DP.DPonLIS;
import java.util.*;

public class longestStringChain {


    public static int StringChain(String[] word){
        int n = word.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);

        Arrays.sort(word,Comparator.comparingInt(String:: length));
        int maxLen =0;
        for(int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                if(check(word[i] ,word[j]) && dp[i] <dp[j] +1){
                    dp[i] = dp[j] +1;
                }
            }
            if(dp[i] > maxLen) maxLen = dp[i];
        }
        return maxLen;
    }

    public static boolean check(String s1,String s2){
        if(s1.length() != s2.length() +1) return false;
        int i =0;int j=0;
        while(i < s1.length()){
            if(j<s2.length() && s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return (j == s2.length());
    }
    public static void main(String[] args) {
        String[] word ={"a","b","ba","bca","bda","bdca"};
        System.out.println(StringChain(word));
    }
    
}
