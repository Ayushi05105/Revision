package Recursion;
import java.util.*;

public class subset_II {

    public static void helper(int[] arr,int idx,List<Integer> ds,List<List<Integer>> ans){
        int n = arr.length;
        if(idx == n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i =idx;i<n;i++){
            if(i != idx && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            helper(arr,i+1,ds,ans);
            ds.remove(ds.size()-1);
        }
    }

    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(subset(arr));
    }
    
}
