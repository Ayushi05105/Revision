package Array.Medium;
import java.util.*;

public class LeaderArray {
    public static List<Integer> leader(int[] arr){
        int n = arr.length;
        
        List<Integer> ans =new ArrayList<>();
        if(n==0){
            return ans;
        }
        int max = arr[n-1];
        ans.add(arr[n-1]);
        for(int i =n-2;i>=0;i--){
            if(arr[i] >max ){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={10,22,12,3,0,6};
        System.out.println(leader(arr));
    }
    
}
