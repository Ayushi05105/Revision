package Recursion;

public class countSubsequence {
    public static  int helper(int[] arr,int idx,int sum){
        int n = arr.length;
        if(sum ==0) return 1;
        if(sum <0 || idx==n) return 0;
        int pick = helper(arr,idx+1,sum - arr[idx]);
        int notPick = helper(arr,idx+1,sum);
        return pick + notPick;
    }
    public static int Subsequense_sum_K(int[] arr,int k){
        return helper(arr,0,k);
    }
    public static void main(String[] args) {
        int[] arr={4,9,2,5,1};
        int k =10;
        System.out.println(Subsequense_sum_K(arr, k));

    }
    
}
