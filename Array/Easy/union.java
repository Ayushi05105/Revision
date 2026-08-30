package Array.Easy;

import java.util.*;

public class union {

    public static List<Integer> unionArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        List<Integer> arr = new ArrayList<>();
        while (i < n && j<m) {
            if (arr1[i] < arr2[j]) {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != arr1[i]) {
                    arr.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != arr2[j]) {
                    arr.add(arr2[j]);
                }
                j++;
            } else {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != arr1[i]) {
                    arr.add(arr1[i]);
                    
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if(arr.isEmpty() || arr.get(arr.size() - 1) != arr1[i]){
            arr.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if(arr.isEmpty() || arr.get(arr.size() - 1) != arr2[j]){
            arr.add(arr2[j]);
            }
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5 };
        System.out.println(unionArray(arr1, arr2));

    }

}
