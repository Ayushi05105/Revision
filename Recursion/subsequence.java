package Recursion;
import java.util.*;
public class subsequence {
    public static void helper(int[] arr,int idx,List<Integer> ds,List<List<Integer>> ans){
        if(idx == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        helper(arr,idx+1,ds,ans);
        ds.add(arr[idx]);
        helper(arr,idx+1,ds,ans);
        ds.remove(ds.size()-1);
    }

    public static List<List<Integer>> subsequenceI(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println(subsequenceI(arr));
    }
    
}
