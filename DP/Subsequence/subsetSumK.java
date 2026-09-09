package DP.Subsequence;
import java.util.*;

public class subsetSumK {

    public static boolean helper(int[] arr,int sum,int idx,int[][] dp){
        
        if(sum ==0) return true;
        if(idx ==0) return arr[0]== sum;
        if(dp[idx][sum] != -1){
            return dp[idx][sum] ==1;
        }
        
        boolean notTake = helper(arr, sum, idx-1, dp);
        boolean take =false;
        if(arr[idx]<= sum){
            take = helper(arr, sum-arr[idx], idx-1, dp);
        }
        dp[idx][sum] = (notTake|| take)?1:0;
        return (take || notTake);

    }
    public static boolean subset(int[] arr,int k){
        int n = arr.length;
        int[][] dp = new int[n][k+1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return helper(arr,k,n-1,dp);
    }
    public static void main(String[] args) {
        int[] arr ={4,3,5,6};
        int k = 6;
        System.out.println(subset(arr, k));
    }
    
}
