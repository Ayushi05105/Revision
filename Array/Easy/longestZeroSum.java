package Array.Easy;
import java.util.*;
public class longestZeroSum {
    public static int zeroSum(int[] arr){
        int sum=0;
        int maxLen =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum ==0){
                maxLen = i+1;
            }
            if(map.containsKey(sum)){
                int len = i -map.get(sum);
                maxLen = Math.max(maxLen,len);
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;

    }
    public static void main(String[] args) {
        int[] arr={9,-3,3,-1,6,-5};
        System.out.println(zeroSum(arr));
    }
    
}
