// package Recursion;
// import java.util.*;


// public class printLcs {

//     public static String helper(String s1,String s2,int n,int m, List<String> ds,List<List<String>> ans){
//         if(n ==0 || m==0){
//             ans.add(new ArrayList<>(ds));
            
//         }
//         if(s1.charAt(n-1) == s2.charAt(m-1)){
           
//             return s1.charAt(n-1) + helper(s1,s2,n-1,m-1,ds,ans);
//         }
        
//         String left = helper(s1,s2,n-1,m,ds,ans);

//         String right = helper(s1,s2,n,m-1,ds,ans);
//         if(left.length() > right.length()){
//             return left;
//         }
//         if(left.length() < right.length()){
//             return right;
//         }
//     }

//     public static List<List<String>> lcs(String s1,String s2){
        
//         List<List<String>> ans = new ArrayList<>();
//         helper(s1,s2,s1.length(),s2.length(),new ArrayList<>(),ans);
//         return ans;

//     }
//     public static void main(String[] args) {
//         String s1 ="abcdab";
//         String s2 ="bacdb";
//         System.out.println(lcs(s1, s2));

//     }
    
// }
