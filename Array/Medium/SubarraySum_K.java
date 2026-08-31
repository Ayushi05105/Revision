package Array.Medium;

import java.util.HashMap;

public class SubarraySum_K {
    public static int subarray_Sum(int[] arr,int k){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int cnt =0;
        map.put(0,1);
        for(int i =0;i<n;i++){
            sum += arr[i];
            int remove = sum -k;
            if(map.containsKey(remove)){
                cnt += map.get(remove);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        int k = 6;
        System.out.println(subarray_Sum(arr, k));
    }
}
