package Recursion;
import java.util.*;

public class combinationSum_III {

    public static void helper(int n,int sum,int idx,List<Integer> ds,List<List<Integer>> ans){
        if(sum ==0 && ds.size()==n){
            ans.add(new ArrayList<>(ds));
        }
        if(sum <=0 || ds.size() > n) return;
        for(int i =idx;i<=9;i++){
            if(i <= sum){
                ds.add(i);
                helper(n, sum-i, idx+1, ds, ans);
                ds.remove(ds.size()-1);
            }
            else{
                break;
            }
        }
    }
    public static List<List<Integer>> combination(int n,int sum){
        List<List<Integer>> ans = new ArrayList<>();
        helper(n,sum,1,new ArrayList<>(),ans);
        return ans;
    }
    public static void main(String[] args) {
        int n =3;
        int sum = 7;
        System.out.println(combination(n, sum));
    }
}
