package DP.DPonLIS;

import java.util.ArrayList;
import java.util.List;

public class printLIS {

    // recursion
    public static List<Integer> helper(int[] arr,int idx ,int prevIdx,List<Integer> ans){
        int n = arr.length;
        if(idx == n) return ans;

        List<Integer> notPick = helper(arr,idx+1, prevIdx,new ArrayList<>(ans));
        
        List<Integer> pick = new ArrayList<>(ans);
        if(prevIdx == -1 || arr[prevIdx] < arr[idx]){
            pick.add(arr[idx]);
            pick = helper(arr,idx+1,idx,pick);
        }
        if(pick.size() > notPick.size()){
            return pick;
        }
        return notPick;
    }
    public static void lis(int[] arr){
        List<Integer> ans = new ArrayList<>();
        ans = helper(arr, 0, -1, ans);
        System.out.println(ans);
    }

    // tabulation
    public static List<Integer> printLis(int[] arr){
        
        int n = arr.length;
        int[][] dp = new int[n+1][n+1];
        for(int idx = n-1;idx>=0;idx--){
            for(int prevIdx = idx-1;prevIdx >=-1;prevIdx--){
                int notPick = dp[idx+1][prevIdx+1];
                int pick =0;
                if( prevIdx==-1 || arr[idx] > arr[prevIdx]){
                    pick = 1 + dp[idx+1][idx+1];
                }
                dp[idx][prevIdx+1]= Math.max(pick,notPick);
            }
        }
        int idx =0;
        int prevIdx =-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(idx < n){
            int notPick = dp[idx+1][prevIdx+1];
            int pick =0;
            if(prevIdx == -1 || arr[idx] > arr[prevIdx]){
                pick = 1 + dp[idx+1][idx+1];
            }
            if(pick > notPick){
                ans.add(arr[idx]);
                prevIdx = idx;
            }
            idx++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={10,9,2,5,3,7,101,18};
        lis(arr);
        System.out.println(printLis(arr));
    }
    
}
