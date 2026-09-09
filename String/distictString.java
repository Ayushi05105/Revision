package String;
import java.util.*;
public class distictString {

    public static  int kDistinctString(String s,int k){
        
        HashMap<Character,Integer> map = new HashMap<>();
        int left =0;
        int ans =0;
        for(int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

            while(map.size() >k){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0) map.remove(leftChar);
                left++;
            }
            ans += (i-left+1);
        }
        return ans;
    }
    public static  int cnt(String s,int k){
        return kDistinctString(s, k) - kDistinctString(s, k-1);
    }
    public static void main(String[] args) {
        String s = "pqpqs";
        int k =2;
        System.out.println(cnt(s, k));

    }
    
}
