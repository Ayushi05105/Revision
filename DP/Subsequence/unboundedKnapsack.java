package DP.Subsequence;
import java.util.*;

public class unboundedKnapsack {

    public static int helper(int[] wt,int[] val,int idx,int W,int[][] dp){
        if(idx ==0){
            return (W / wt[0])*val[0];
        }
        if(dp[idx][W] !=-1){
            return dp[idx][W];
        }
        int notPick = helper(wt,val,idx-1,W,dp);
        int pick =0;
        if(wt[idx] <=W){
            pick = val[idx] + helper(wt,val,idx,W-wt[idx],dp);
        }
        return dp[idx][W] = Math.max(pick , notPick);
    }

    public static int knapsack(int n,int[] wt,int[] val,int W){
        int[][] dp = new int[n][W+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return helper(wt,val,n-1,W,dp);
    }
    public static void main(String[] args) {
        int[] wt = {2,4,6};
        int[] val = {5,11,13};
        int n = 3;
        int W = 8;
        System.out.println(knapsack(n, wt, val, W));
    }
    
}
