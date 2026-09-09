package Recursion;
import java.util.*;
public class generateBinaryString {
    
    public static void generate(int n,String curr,List<String> ans){
        if(curr.length()==n){
            ans.add(curr);
            return;
        }
        generate(n, curr +"0", ans);
        if(curr.isEmpty() || curr.charAt(curr.length()-1) != '1'){
            generate(n, curr+"1", ans);
        }
    }
    public static void main(String[] args) {
        int n =3;
        List<String> ans = new ArrayList<>();
        generate(n,"", ans);
        for(String s: ans){
            System.out.print(s+" ");
        }
        System.out.println();
    }
    
}
