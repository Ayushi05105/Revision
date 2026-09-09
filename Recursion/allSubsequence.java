package Recursion;
import java.util.*;

public class allSubsequence {
    public static  void helper(String s,int idx,StringBuilder curr,List<String> ans){
        if(idx == s.length()){
            ans.add(curr.toString());
            return;
        }
        helper(s,idx+1,curr,ans);
        curr.append(s.charAt(idx));
        helper(s,idx+1,curr,ans);
        curr.deleteCharAt(curr.length()-1);
    }
    public static List<String> subsequence(String s){
        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        helper(s,0,curr,ans);
        return ans;
    }
    public static void main(String[] args) {
        String s ="abc";
        System.out.println(subsequence(s));
    }
}
