package Array.Easy;

public class longestSubarray {
    public static int longest(int[] arr,int k){
        int n = arr.length;
        int max =0;
        int l =0;
        int r = 0;
        int sum = arr[0];
        while(r<n){
            while(l<=r && sum>k){
                sum -= arr[l];
                l++;
            }
            if(sum ==k){
                max = Math.max(max,r-l+1);
            }
            r++;
            if(r<n){
                sum += arr[r];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] arr={10,5,2,7,1,9};
        int k = 15;
        System.out.println(longest(arr, k));

    }
    
}
