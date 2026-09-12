package DP.DPonLIS;
import java.util.*;

import BinarySearch.OnAnswer.nthRoot;

public class longestIncreasingSubsequence {


    // recursion

    public static int helper(int[] arr,int idx ,int prevIdx){
        int n = arr.length;
        if(idx == n) return 0;
        int notTake = helper(arr,idx+1, prevIdx);
        int pick =0;
        if(prevIdx == -1 || arr[prevIdx] < arr[idx]){
            pick =  1+ helper(arr,idx+1,idx);
        }
        int len =Math.max(pick,notTake);
        return len;
    }

    public static int lis(int[] arr){
        return helper(arr, 0, -1);
    }


    // tabultaion

    public static int LIS(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n+1][n+1];
        for(int i =n-1;i>=0;i--){
            for(int j = i-1;j>=-1;j--){
                int notPick = dp[i+1][j+1];
                int pick =0;
                if(j == -1 || arr[i] > arr[j]){
                    pick = 1 + dp[i+1][i+1];
                } 
                dp[i][j+1] = Math.max(pick , notPick);  
            }
        }
        return dp[0][0];
    }



    // binary search most optimised one
    public static int LIS2(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int len =0;
        for(int x:arr){
            int low =0;
            int high = len;
            while(low < high){
                int mid = (low + high)/2;
                if(temp[mid] < x){
                    low = mid+1;
                }
                else{
                    high = mid;
                }
            }
            temp[low] =x;
            if(low == len){
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr={10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lis(arr));
        System.out.println(LIS(arr));
        System.out.println(LIS2(arr));
    }
    
}
