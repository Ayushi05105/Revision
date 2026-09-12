package DP.DPonLIS;
import java.util.*;

public class longestDivisibleSubset {

    public static int Print_Length_LDS(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n+1][n+1];
        for(int idx =n-1;idx>=0;idx--){
            for(int prevIdx = idx-1;prevIdx >=-1;prevIdx--){
                int pick =0;
                if(prevIdx == -1 ||arr[idx] % arr[prevIdx] ==0){
                    pick = 1 + dp[idx+1][idx+1];
                }
                int notPick = dp[idx+1][prevIdx +1];
                dp[idx][prevIdx+1] = Math.max(pick,notPick);
            }
        }
        return dp[0][0];
    }


    public static List<Integer> LDS(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n+1][n+1];
        for(int idx =n-1;idx>=0;idx--){
            for(int prevIdx = idx-1;prevIdx >=-1;prevIdx--){
                int pick =0;
                if(prevIdx == -1 ||arr[idx] % arr[prevIdx] ==0){
                    pick = 1 + dp[idx+1][idx+1];
                }
                int notPick = dp[idx+1][prevIdx +1];
                dp[idx][prevIdx+1] = Math.max(pick,notPick);
            }
        }
        int idx =0;
        int prevIdx =-1;
        List<Integer> ans = new ArrayList<>();
        while(idx <n){
            int notPick = dp[idx+1][prevIdx+1];
            int pick =0;
            if(prevIdx == -1 || arr[idx] %arr[prevIdx] ==0){
                pick = 1 + dp[idx+1][idx+1];
            }
            if(pick >notPick){
                ans.add(arr[idx]);
                prevIdx = idx;
            }
            idx++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={3,5,10,20};
        System.out.println(Print_Length_LDS(arr));
        System.out.println(LDS(arr));

    }
}
