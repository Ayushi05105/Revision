package Basic.BasicRecursion;
import java.util.*;

public class countFreq {
    public static void count(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
    public static void main(String[] args) {
        int[] arr={10,5,4,4,6,10};
        count(arr);
    }
}
