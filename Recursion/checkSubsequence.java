package Recursion;

public class checkSubsequence {
    public static boolean helper(int[] arr,int idx,int sum){
        if(sum ==0) return true;
        if(sum <0) return false;
        if(idx == arr.length) return sum == 0;
        boolean pick = helper(arr,idx+1,sum-arr[idx]);
        boolean notPick = helper(arr,idx+1,sum);
        return pick || notPick;

    }
    public static boolean subsequence(int[] arr,int k){
        return helper(arr, 0, k);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k = 8;
        System.out.println(subsequence(arr, k));

    }
    
}
