package Array.Medium;
import java.util.*;

public class subarraySumZero {
    public static int subarray(int[] arr){
        int n = arr.length;
        int sum =0;
        int max =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            sum += arr[i];
            if(sum ==0){
                max =i+1;
            }
            else{
                if(map.containsKey(sum)){
                    max = Math.max(max,i - map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={9,-3,3,-1,6,-5};
        System.out.println(subarray(arr));
    }
}
